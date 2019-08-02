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

public class Storehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Storehouse() {
        this.prices = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }

    public int price(String product) {
        if (this.prices.keySet().contains(product)) {
            return this.prices.get(product);
        } else {
            return -99;
        }

    }

    public int stock(String product) {
        if (this.stocks.keySet().contains(product)) {
            return this.stocks.get(product);
        } else {
            return 0;
        }
    }

    public boolean take(String product) {
        if (this.stocks.keySet().contains(product) && this.stocks.get(product) >= 1) {

            this.stocks.put(product, this.stocks.get(product) - 1);
            return true;
        } else {
            return false;
        }
    }

    public Set<String> products() {
        return this.prices.keySet();
    }

}
