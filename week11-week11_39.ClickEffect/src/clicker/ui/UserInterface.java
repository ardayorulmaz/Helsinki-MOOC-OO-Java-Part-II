package clicker.ui;

import clicker.applicationlogic.PersonalCalculator;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import clicker.applicationlogic.Calculator;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(2, 1);
        container.setLayout(layout);

        JButton button = new JButton("Click!");
        Calculator calc = new PersonalCalculator();
        JLabel label = new JLabel("0");
        ClickListener click = new ClickListener(calc, label);

        button.addActionListener(click);
        container.add(label);
        container.add(button);
    }

    public JFrame getFrame() {
        return frame;
    }
}
