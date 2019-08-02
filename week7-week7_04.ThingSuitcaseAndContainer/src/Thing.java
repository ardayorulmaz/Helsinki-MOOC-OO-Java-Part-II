/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sparkcaster
 */
public class Thing {

    private String name;
    private int kg;

    public Thing(String name, int kg) {
        this.name = name;
        this.kg = kg;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.kg;
    }

    public String toString() {
    return getName() + " (" +getWeight() + " kg)";
    }
}
