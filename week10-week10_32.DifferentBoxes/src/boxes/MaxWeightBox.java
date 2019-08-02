/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.*;

/**
 *
 * @author Sparkcaster
 */
public class MaxWeightBox extends Box {

    private int maxweight;
    private List<Thing> boxlist;

    public MaxWeightBox(int maxweight) {
        this.maxweight = maxweight;
        this.boxlist = new ArrayList<Thing>();

    }

    @Override
    public void add(Thing thing) {
        if ((thing.getWeight() + this.getWeight()) <= this.maxweight) {
            this.boxlist.add(thing);

        }
    }

    public int getWeight() {
        int totalweight = 0;
        for (Thing thing : this.boxlist) {
            totalweight += thing.getWeight();

        }
        return totalweight;
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (this.boxlist.contains(thing)) {
            return true;
        } else {
            return false;
        }
    }

}
