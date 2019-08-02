package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Swing on");
        frame.setPreferredSize(new Dimension(400, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    public void createComponents(Container container) {
       
        container.add(new JLabel("Are you?"));

        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");
        ButtonGroup yesno = new ButtonGroup();
        yesno.add(yes);
        yesno.add(no);
        
        JRadioButton nr = new JRadioButton("No reason.");
        JRadioButton bcz = new JRadioButton("Because it is fun!");
        ButtonGroup nrbcz = new ButtonGroup();
        nrbcz.add(nr);
        nrbcz.add(bcz);
 BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        container.add(yes);
        container.add(no);

        container.add(new JLabel("Why?"));


        container.add(nr);
        container.add(bcz);
        container.add(new JButton("Done!"));

    }

    public JFrame getFrame() {
        return frame;
    }

    public void dumpp(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        container.add(new JLabel("Are you?"));

        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");
        ButtonGroup yesno = new ButtonGroup();
        yesno.add(yes);
        yesno.add(no);

        container.add(yes);
        container.add(no);

        container.add(new JLabel("Why?"));

        JRadioButton nr = new JRadioButton("No reason");
        JRadioButton bcz = new JRadioButton("Because it is fun!");
        ButtonGroup nrbcz = new ButtonGroup();
        nrbcz.add(nr);
        nrbcz.add(bcz);

        container.add(nr);
        container.add(bcz);
    }
}
