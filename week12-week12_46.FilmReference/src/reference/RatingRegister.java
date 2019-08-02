/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;
import java.util.Map.Entry;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Sparkcaster
 */
public class RatingRegister {

    private Map<Film, List<Rating>> filmratings;
    private Map<Person, HashMap<Film, Rating>> personalfilmratings;

    public RatingRegister() {
        this.filmratings = new HashMap<Film, List<Rating>>();
        this.personalfilmratings = new HashMap<Person, HashMap<Film, Rating>>();
    }

    public void addRating(Film film, Rating rating) {
        if (!this.filmratings.containsKey(film)) {
            this.filmratings.put(film, new ArrayList<Rating>());
            this.filmratings.get(film).add(rating);
        } else {
            this.filmratings.get(film).add(rating);
        }
    }

    public Map<Person, HashMap<Film, Rating>> getPersRat() {
        return this.personalfilmratings;
    }

    public List<Rating> getRatings(Film film) {
        List<Rating> results = new ArrayList<Rating>();
        for (Rating rating : this.filmratings.get(film)) {
            results.add(rating);
        }
        return results;
    }

    public Map<Film, List<Rating>> filmRatings() {
        return this.filmratings;
    }

    public List<Film> getFilms() {
        List<Film> films = new ArrayList<Film>();
        for (Film film : this.filmRatings().keySet()) {
            films.add(film);
        }
        return films;
    }

    public void addRating(Person person, Film film, Rating rating) {
        if (!this.personalfilmratings.keySet().contains(person)) {
            this.personalfilmratings.put(person, new HashMap<Film, Rating>());
            this.personalfilmratings.get(person).put(film, rating);
        } else {
            this.personalfilmratings.get(person).put(film, rating);
        }

        this.addRating(film, rating);
    }

    public Rating getRating(Person person, Film film) {

        if (this.personalfilmratings.get(person).containsKey(film)) {
            return this.personalfilmratings.get(person).get(film);
        } else {
            return Rating.NOT_WATCHED;
        }
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        Map<Film, Rating> results = new HashMap<Film, Rating>();
        if (this.personalfilmratings.keySet().contains(person)) {

            for (Entry<Film, Rating> map : this.personalfilmratings.get(person).entrySet()) {
                results.put(map.getKey(), map.getValue());
            }
        }
        return results;
    }

    public List<Person> reviewers() {
        List<Person> results = new ArrayList<Person>();
        for (Person person : this.personalfilmratings.keySet()) {
            results.add(person);
        }
        return results;
    }
}
