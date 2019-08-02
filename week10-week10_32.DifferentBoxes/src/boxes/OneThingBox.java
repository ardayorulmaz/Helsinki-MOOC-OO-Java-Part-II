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
public class OneThingBox extends Box {

    private List<Thing> itemlist;

    public OneThingBox() {
        this.itemlist = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if (this.itemlist.isEmpty()) {
            this.itemlist.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (this.itemlist.contains(thing)) {
            return true;
        } else {
            return false;
        }
    }

}
