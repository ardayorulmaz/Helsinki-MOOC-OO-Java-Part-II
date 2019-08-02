/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.*;

/**
 *
 * @author Sparkcaster
 */
public class ContainerHistory {

    private ArrayList<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation) {
        this.history.add(situation);
    }

    public void reset() {
        this.history.clear();
    }

    public double maxValue() {
        if (!this.history.isEmpty()) {
            return Collections.max(this.history);
         
        } else {
            return 0.0;
        }
    }

    public double minValue() {
        if (!this.history.isEmpty()) {
           return Collections.min(this.history);
           
        } else {
            return 0.0;
        }
    }

    public double average() {
        double total = 0.0;
        for (double doby : this.history) {
            total += doby;
        }

        return total / (this.history.size());
    }

    public double greatestFluctuation() {

        if (this.history.isEmpty() || this.history.size() == 1) {
            return 0;
        } else {

            double greatestFluctuation = Math.abs(this.history.get(0) - this.history.get(1));

            for (int i = 0; i < this.history.size() - 1; i++) {

                double fluctuation = Math.abs(this.history.get(i) - this.history.get(i + 1));

                if (fluctuation > greatestFluctuation) {
                    greatestFluctuation = fluctuation;
                }
            }
            return greatestFluctuation;
        }
    }

    public double variance() {
        double toptotal = 0.0;

        for (double x : this.history) {
            toptotal += Math.pow((x - this.average()), 2);
        }
        return (toptotal / (this.history.size() - 1));
    }

    public String toString() {
        return this.history.toString();
    }

}


