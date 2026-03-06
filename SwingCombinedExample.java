import javax.swing.*;

public class SwingCombinedExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Radio & ScrollPane Example");

        // Radio Buttons
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");

        r1.setBounds(50, 30, 100, 30);
        r2.setBounds(50, 60, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        // TextArea with ScrollPane
        JTextArea ta = new JTextArea(5, 20);
        JScrollPane sp = new JScrollPane(ta);
        sp.setBounds(50, 100, 200, 80);

        // Add components
        frame.add(r1);
        frame.add(r2);
        frame.add(sp);

        // Frame settings
        frame.setSize(320, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}