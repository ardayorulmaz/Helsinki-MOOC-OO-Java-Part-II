/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sparkcaster
 */
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Thing> container;
    private int maxWeight;
    private int weight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.container = new ArrayList<Thing>();
        this.weight = 0;
    }

    public void addThing(Thing thing) {
        if ((this.weight + thing.getWeight()) <= maxWeight) {
            this.container.add(thing);
            this.weight += thing.getWeight();
        }

    }

    public void printThings() {
        for (Thing thing : this.container) {
            System.out.println(thing.getName() + "(" + thing.getWeight() + " kg)");
        }

    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Thing thing : this.container) {
            totalWeight += thing.getWeight();
        }
        return totalWeight;
    }

    public Thing heaviestThing() {
        if (this.container.size() == 0) {
            return null;
        }
        Thing heaviest = this.container.get(0);
        if (this.container.size() > 0) {
            for (Thing thing : this.container) {
                if (thing.getWeight() > heaviest.getWeight()) {
                    heaviest = thing;

                }

            }

        }
        return heaviest;
    }

    public String toString() {
        if (this.container.size() == 0) {
            return "empty (0 kg)";
        } else if (this.container.size() == 1) {
            return this.container.size() + " thing (" + this.weight + " kg)";
        } else {

            return container.size() + " things (" + this.weight + " kg)";
        }
    }
}
