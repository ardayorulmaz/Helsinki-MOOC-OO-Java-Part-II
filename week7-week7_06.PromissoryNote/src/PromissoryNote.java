/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sparkcaster
 */
import java.util.HashMap;

public class PromissoryNote {

    private HashMap<String, Double> notelist;

    public PromissoryNote() {
        this.notelist = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value) {

        this.notelist.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {
        if (this.notelist.containsKey(whose)){
        return this.notelist.get(whose);}
        
        return 0;

    }

}
