/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.domain;

/**
 *
 * @author Sparkcaster
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return getName();
    }

    @Override
    public boolean equals(Object object) {
        Person compared = (Person) object;
        if (this.getName() == compared.getName()) {
            return true;
            
        }
        return false;
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
