/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uilogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Applogic.Calculator;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author Sparkcaster
 */
public class AddClick implements ActionListener {

    private Calculator calc;
    private JTextField outputfield;
    private JButton sum;

    private JTextField inputfield;

    public AddClick(Calculator calc, JTextField opfield, JTextField inputfield, JButton sum) {
        this.sum = sum;
        this.calc = calc;
        this.outputfield = opfield;
        this.inputfield = inputfield;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            int x = Integer.parseInt(this.inputfield.getText());
            int y = Integer.parseInt(this.outputfield.getText());
            this.calc.add(x, y);
            this.outputfield.setText(this.calc.giveOutput());
            this.inputfield.setText("");
            this.sum.setEnabled(true);

        } catch (Exception y) {
            this.inputfield.setText("");
        }

    }

}
