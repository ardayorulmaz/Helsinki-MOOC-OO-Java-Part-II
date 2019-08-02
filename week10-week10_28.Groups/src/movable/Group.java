/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Sparkcaster
 */
public class Group implements Movable {

    private List<Movable> organisms;

    public Group() {
        this.organisms = new ArrayList<Movable>();
    }

    public void addToGroup(Movable movable) {
        this.organisms.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : this.organisms) {
            movable.move(dx, dy);
        }
    }

    public String toString() {
        String grouplist = "";
        for (Movable movable : this.organisms) {
            grouplist += movable.toString() +"\n";
        }
        return grouplist;
    }
}
