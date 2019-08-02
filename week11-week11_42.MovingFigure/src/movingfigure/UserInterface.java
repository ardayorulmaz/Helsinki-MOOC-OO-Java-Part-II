package movingfigure;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Figure figure;

    public UserInterface(Figure figure) {
        this.figure = figure;
    }

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        DrawingBoard db = new DrawingBoard(this.figure);
        this.frame.addKeyListener(new KeyboardListener(db, this.figure));
        container.add(db);

    }

    private void addListeners() {

    }

    public JFrame getFrame() {
        return frame;
    }
}
