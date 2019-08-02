/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sparkcaster
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Purchase {

    
    private String product;
    private int amount;
    private int unitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;

    }

    public int price() {
        int total = 0;
        total = this.amount * this.unitPrice;
        return total;
    }

    public void increaseAmount() {
        this.amount++;
    }

    public String toString() {
        return this.product + ": " + this.amount;
    }
}
