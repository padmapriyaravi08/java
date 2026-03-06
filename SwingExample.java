import javax.swing.*;
import java.awt.event.*;

public class SwingExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Swing Components Example");

        // JLabel
        JLabel label = new JLabel("Welcome to Java");
        label.setBounds(90, 20, 200, 30);

        // JButton
        JButton btn = new JButton("Click Me");
        btn.setBounds(90, 60, 120, 30);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
            }
        });

        // JList
        String[] data = {"Java", "Python", "C++"};
        JList<String> list = new JList<>(data);
        list.setBounds(90, 100, 100, 60);

        // Add components to frame
        frame.add(label);
        frame.add(btn);
        frame.add(list);

        // Frame settings
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}