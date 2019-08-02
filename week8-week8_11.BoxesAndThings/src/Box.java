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

public class Box implements ToBeStored {

  
    private double maxKg;
    private ArrayList<ToBeStored> container;

    public Box(double maxKg) {

        this.maxKg = maxKg;
        this.container = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored item) {
        if (item.weight() + this.weight() <= this.maxKg) {

            this.container.add(item);
        }
    }

    public double weight() {
        double weight = 0;
        for (ToBeStored item : this.container) {
            weight = weight + item.weight();
        }
        return weight;
    }

    public String toString() {
        return "Box: " + this.container.size() + " things, total weight " + this.weight() + " kg";
    }
}
