
import Applogic.Calculator;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javafx.geometry.VerticalDirection;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import uilogic.AddClick;
import uilogic.CalcPanel;
import uilogic.SubClick;
import uilogic.SumClick;

public class GraphicCalculator implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        JFrame frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(500, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout panelmain = new GridLayout(3, 1);
        container.setLayout(panelmain);
        JTextField opfield = new JTextField("0");
        JTextField inputfield = new JTextField("");
        CalcPanel panel = new CalcPanel();
        opfield.setEnabled(false);
        JButton plus = new JButton("+");
        JButton sub = new JButton("-");
        JButton sum = new JButton("Z");

        if (opfield.getText().equals("0")) {
            sum.setEnabled(false);
        }

        Calculator calc = new Calculator();
        plus.addActionListener(new AddClick(calc, opfield, inputfield, sum));
        sub.addActionListener(new SubClick(calc, opfield, inputfield, sum));
        sum.addActionListener(new SumClick(calc, opfield, inputfield, sum));

        panel.add(plus);
        panel.add(sub);
        panel.add(sum);
        container.add(opfield);
        container.add(inputfield);
        container.add(panel);

    }

    public JFrame getFrame() {
        return frame;
    }
}
