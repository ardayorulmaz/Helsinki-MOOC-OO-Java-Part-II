/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.Map;
import reference.domain.Person;

/**
 *
 * @author Sparkcaster
 */
public class PersonComparator implements Comparator<Person> {

    private Map<Person, Integer> id;

    public PersonComparator(Map<Person, Integer> peopleIdentities) {
        this.id = peopleIdentities;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (this.id.get(o1) > this.id.get(o2)) {
            return -1;
        } else if (this.id.get(o1) < this.id.get(o2)) {
            return 1;
        }
        else {return 0;}
    }

}
