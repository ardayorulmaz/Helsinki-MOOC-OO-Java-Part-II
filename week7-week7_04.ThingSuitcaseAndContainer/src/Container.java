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

public class Container {

    private ArrayList<Suitcase> container;
    private int maxWeight;
    private int weight;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.container = new ArrayList<Suitcase>();
        this.weight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if ((this.weight + suitcase.totalWeight()) <= maxWeight) {
            this.container.add(suitcase);
            this.weight += suitcase.totalWeight();
        }

    }

    public void printThings() {
        for (Suitcase suitcase : this.container) {
            suitcase.printThings();
        }
    }

    public String toString() {
        if (this.container.size() == 0) {
            return "empty (0 kg";
        } else if (this.container.size() == 1) {
            return this.container.size() + " suitcase (" + this.weight + ")";
        } else {

            return container.size() + " suitcases (" + this.weight + " kg)";
        }
    }

}
