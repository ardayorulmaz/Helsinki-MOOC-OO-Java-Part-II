/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.*;

/**
 *
 * @author Sparkcaster
 */
public class BulkTank {

    private double capacity;
    private double volume;

    public BulkTank() {
        this.capacity = 2000.0;
        this.volume = 0;
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
        this.volume = 0;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getVolume() {
        return this.volume;
    }

    public double howMuchFreeSpace() {
        return this.capacity - this.volume;
    }

    public void addToTank(double amount) {
        if (howMuchFreeSpace() < amount) {
            this.volume = this.capacity;
        } else {
            this.volume += amount;
        }
    }

    public double getFromTank(double amount) {
        if (amount > getVolume()) {
            double whole = getVolume();
            this.volume = 0;
            return whole;

        }

        this.volume -= amount;
        return amount;

    }

    @Override
    public String toString() {

        return Math.ceil(getVolume()) + "/" + Math.ceil(getCapacity());
    }
}
