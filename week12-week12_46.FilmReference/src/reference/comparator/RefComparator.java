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
public class RefComparator implements Comparator<Film> {

    private final Map<Film, Rating> id;

    public RefComparator(Map<Film, Rating> ratings) {
        this.id = ratings;
    }

    @Override
    public int compare(Film o1, Film o2) {
        if (this.id.get(o1).getValue() > this.id.get(o2).getValue()) {
            return -1;
        } else if (this.id.get(o1).getValue() < this.id.get(o2).getValue()) {
            return 1;
        } else {
            return 0;
        }
    }

}
