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

public class Changer {

    private ArrayList<Change> changelist;

    public Changer() {
        this.changelist = new ArrayList<Change>();
    }

    public void addChange(Change change) {
        this.changelist.add(change);
    }

    public String change(String characterString) {
        String word = characterString;
        
        for (Change change : changelist) {
            word = change.change(word);
            

        }
        return word;

    }
}


