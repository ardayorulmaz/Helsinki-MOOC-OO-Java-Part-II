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

public class ShoppingBasket {

    private Map<String, Purchase> basketlist;

    public ShoppingBasket() {
        this.basketlist = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        if (this.basketlist.keySet().contains(product)) {
            this.basketlist.get(product).increaseAmount();
        } else {
            Purchase newitem = new Purchase(product, 1, price);
            this.basketlist.put(product, newitem);
        }
    }

    public int price() {
        int total = 0;
        for (Purchase product : this.basketlist.values()) {
            total += product.price();
        }
        return total;
    }

    public void print() {
        for (Purchase p : this.basketlist.values()) {
            System.out.println(p.toString());
        }
    }
}
