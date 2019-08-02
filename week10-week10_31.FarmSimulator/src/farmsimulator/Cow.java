/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.*;

/**
 *
 * @author Sparkcaster
 */
public class Cow implements Milkable, Alive {

    private Random random;
    private String name;
    private int uddercapacity;
    private double volume;

    public Cow() {
        this.random = new Random();
        int num = 15 + random.nextInt(26);
        this.uddercapacity = num;
        int nameno = random.nextInt(NAMES.length + 1);
        this.name = NAMES[nameno];
        this.volume = 0;
    }

    public Cow(String name) {
        this.random = new Random();
        int num = 15 + random.nextInt(26);
        this.uddercapacity = num;
        this.name = name;
    }

    public double getCapacity() {
        return this.uddercapacity;
    }

    public String getName() {
        return this.name;
    }

    public double getAmount() {
        return this.volume;
    }

    @Override
    public String toString() {
        return this.name + " " + getAmount() + "/" + getCapacity();
    }

    @Override
    public double milk() {
        double amount = 0;
        amount = this.volume;
        this.volume = 0;
        return amount;

    }

    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    @Override
    public void liveHour() {

        if (!(getCapacity() - getAmount() < 2)) {
            this.volume += 2.0;
        } else {
            this.volume = getCapacity();
        }
    }

}
