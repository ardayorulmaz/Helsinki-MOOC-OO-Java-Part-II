/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Sparkcaster
 */
public class Employees {

    private ArrayList<Person> personlist;

    public Employees() {
        this.personlist = new ArrayList<Person>();
    }

    public void add(Person person) {
        this.personlist.add(person);
    }

    public void add(List<Person> persons) {
        Iterator<Person> iterator = persons.iterator();

        while (iterator.hasNext()) {
            this.personlist.add(iterator.next());
        }
    }

    public void print() {
        Iterator<Person> gator = this.personlist.iterator();
        while (gator.hasNext()) {
            System.out.println(gator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.personlist.iterator();
        while (iterator.hasNext()) {
            Person perso = iterator.next();
            if (perso.getEducation() == education) {

                System.out.println(perso);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.personlist.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }

}
