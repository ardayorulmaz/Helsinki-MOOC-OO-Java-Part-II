/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;

/**
 *
 * @author Sparkcaster
 */
public class Box implements Thing {

    private ArrayList<Thing> itemlist;

    private int maximumCapacity;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.itemlist = new ArrayList<Thing>();
    }

    public boolean addThing(Thing t) {
        if (this.getVolume() + t.getVolume() > this.maximumCapacity) {
            return false;

        }
      itemlist.add(t);
        return true;
    }

    @Override
    public int getVolume() {
        int totalWeight = 0;

        for (Thing thing : itemlist) {
            totalWeight += thing.getVolume();
        }
        return totalWeight;
    }
}
