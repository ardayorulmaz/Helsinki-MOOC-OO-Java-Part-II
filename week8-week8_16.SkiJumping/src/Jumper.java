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

public class Jumper implements Comparable<Jumper> {

    private String name;
    private int point;
    private ArrayList<Integer> jumplengths;

    public Jumper(String name, int point) {
        this.name = name;
        this.point = point;
        this.jumplengths = new ArrayList<Integer>();
    }

    public String getName() {
        return this.name;
    }

    public int getPoint() {
        return this.point;
    }

    public void setPoint(int number) {
        this.point = number;
    }

    public void addJump(int length) {
        this.jumplengths.add(length);
    }

    public String jumplist() {
        String jumplist = "";
        for (int number : jumplengths) {
            if (jumplengths.indexOf(number) == (jumplengths.size() - 1))
                     {
                jumplist += number + " m ";
            }
            else {
            jumplist += number + " m, ";}
        }
        return jumplist;
    }

    @Override
    public int compareTo(Jumper jumper) {
        return this.getPoint() - jumper.getPoint();
    }

    @Override
    public String toString() {
        return this.name + " (" + this.point + " points)";
    }
}
