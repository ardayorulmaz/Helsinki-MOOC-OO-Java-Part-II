/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.*;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author Sparkcaster
 */
public class FilmComparator implements Comparator<Film> {

    private Map<Film, List<Rating>> id;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.id = ratings;
    }

    public int getAS(Film film) {
        int total = 0;
        for (Rating rating : this.id.get(film)) {
            total += rating.getValue();
        }
        return total / this.id.get(film).size();
    }

    @Override
    public int compare(Film o1, Film o2) {
        if (getAS(o1) > getAS(o2)) {
            return -1;
        } else if (getAS(o1) < getAS(o2)) {
            return 1;
        } else {
            return 0;
        }
    }

}
