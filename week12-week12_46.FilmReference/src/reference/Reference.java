/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.Collections;
import reference.comparator.FilmComparator;
import reference.domain.*;
import java.util.*;
import reference.comparator.RefComparator;

/**
 *
 * @author Sparkcaster
 */
public class Reference {

    private RatingRegister rr;

    public Reference(RatingRegister rr) {
        this.rr = rr;

    }

    public int taste(Person person, Person person2) {

        int persontotal = 0;
        for (Film film : this.rr.getFilms()) {
            persontotal += this.rr.getRating(person, film).getValue() * this.rr.getRating(person2, film).getValue();
        }
        return persontotal;
    }

    public Person bestref(Person person) {
        Iterator<Person> bestref = this.rr.reviewers().iterator();
        int bestscore = -30;
        Person random = new Person("random");

        while (bestref.hasNext()) {
            Person ref = bestref.next();
            if (ref != person) {
                if (taste(person, ref) > bestscore) {
                    bestscore = taste(person, ref);
                    random = ref;
                }
            }
        }
        return random;
    }

    public Film recommendFilm(Person person) {

        if (!this.rr.reviewers().contains(person)) {
            FilmComparator comp = new FilmComparator(this.rr.filmRatings());
            List<Film> films = new ArrayList<Film>();
            for (Film film : this.rr.filmRatings().keySet()) {
                films.add(film);

            }
            Collections.sort(films, comp);
            return films.get(0);
        } else {
            Person referrer = bestref(person);

            Map<Film, Rating> filmlist = this.rr.getPersonalRatings(referrer);
            List<Film> films2 = new ArrayList<Film>();
            for (Film film : filmlist.keySet()) {
                films2.add(film);

            }
            RefComparator refc = new RefComparator(filmlist);
            Collections.sort(films2, refc);

            Iterator<Film> itc = films2.iterator();

            while (itc.hasNext()) {
                Film reccomendation = itc.next();
                if (!this.rr.getPersonalRatings(person).containsKey(reccomendation) && this.rr.getRating(referrer, reccomendation).getValue() > 0) {
                    return reccomendation;
                } else if (!itc.hasNext()) {
                    return null;
                }
            }
        }
        return null;
    }
}
