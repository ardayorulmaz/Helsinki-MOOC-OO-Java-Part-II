/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applogic;

/**
 *
 * @author Sparkcaster
 */
public class Calculator {

    private int input1;
    private int input2;
    private int output;

    public Calculator() {
        this.output = 0;
    }

    public void add(int input1, int input2) {
        this.output = input1 + input2;
    }

    public String giveOutput() {
        Integer z = this.output;
        return z.toString();
    }

    public void subtract(int input1, int input2) {
        this.output = input2 - input1;
    }
}
