/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sparkcaster
 */
public class BlackHoleBox extends Box {

    private List<Thing> itemlist;

    public BlackHoleBox() {
        this.itemlist = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
       this.itemlist.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
       return false;
    }

}
