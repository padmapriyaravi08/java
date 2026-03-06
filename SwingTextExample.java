import javax.swing.*;
import java.awt.event.*;

public class SwingTextExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("TextField, TextArea & Toggle Example");

        // JTextField
        JTextField tf = new JTextField();
        tf.setBounds(80, 20, 150, 30);

        // JTextArea
        JTextArea ta = new JTextArea(5, 20);
        ta.setBounds(50, 60, 200, 80);

        // JToggleButton
        JToggleButton toggle = new JToggleButton("ON/OFF");
        toggle.setBounds(90, 150, 120, 30);

        toggle.addActionListener(e -> {
            if (toggle.isSelected())
                System.out.println("ON");
            else
                System.out.println("OFF");
        });

        // Add components to frame
        frame.add(tf);
        frame.add(ta);
        frame.add(toggle);

        // Frame settings
        frame.setSize(320, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}