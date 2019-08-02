/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Sparkcaster
 */
public class Packer {

    private int boxesVolume;
    private Box box;    

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }


  public List<Box> packThings(List<Thing> things) {
        List<Box> boxList = new ArrayList<Box>();
        
        if (!things.isEmpty()) {
           this.box = new Box(boxesVolume);
            
            for (Thing thing : things) {
                // Trys to add thing. If unsuccessful, adds box to list and creates new box.
                if (!this.box.addThing(thing)) {
                    boxList.add(this.box);
                    
                    this.box = new Box(boxesVolume);
                    this.box.addThing(thing);
                }
            }
            boxList.add(this.box);
        }
        return boxList;
    }
}





