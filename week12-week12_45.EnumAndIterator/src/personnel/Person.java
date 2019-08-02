/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

/**
 *
 * @author Sparkcaster
 */
public class Person {

    private String name;
    private Education d;

    public Person(String name, Education d) {
        this.name = name;
        this.d = d;
    }

    public Education getEducation() {
        return this.d;
    }

    public String toString() {
        return this.name + ", " + this.getEducation();
    }
}
