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
public class SumClick implements ActionListener {

    private Calculator calc;
    private JTextField outputfield;
    private JButton sum;
    private JTextField inputfield;

    public SumClick(Calculator calc, JTextField opfield, JTextField inputfield, JButton sum) {

        this.calc = calc;
        this.outputfield = opfield;
        this.inputfield = inputfield;
        this.sum = sum;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        this.outputfield.setText("0");
        this.inputfield.setText("");
        this.sum.setEnabled(false);

    }

}
