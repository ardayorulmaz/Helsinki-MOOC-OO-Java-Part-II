/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author Sparkcaster
 */
public class Item implements Thing, Comparable<Item> {

    private int volume;
    private String name;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.volume + " dm^3)";
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public int compareTo(Item o) {
        return this.getVolume()-o.getVolume();
    }

}
