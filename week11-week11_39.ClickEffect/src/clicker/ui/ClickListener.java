/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import clicker.*;
import clicker.applicationlogic.PersonalCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import clicker.applicationlogic.Calculator;

/**
 *
 * @author Sparkcaster
 */
public class ClickListener implements ActionListener {
    
    private int value;
    private String text;
    private JLabel label;
    private Calculator calc;
    
    public ClickListener(Calculator calc, JLabel label) {
        this.calc = calc;
        this.label = label;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.calc.increase();
        Integer y = this.calc.giveValue();
        String x = y.toString();
        this.label.setText(x);
    }
    
}
