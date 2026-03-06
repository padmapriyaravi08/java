import javax.swing.*;
import java.awt.event.*;

public class mainswing {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });

    }

    public static void createGUI() {

       
        JFrame frame = new JFrame("My First Frame");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JPanel panel = new JPanel();
        JButton button = new JButton("Open Dialog");

        panel.add(new JLabel("Hello"));
        panel.add(button);
        frame.add(panel);

        frame.setVisible(true);

        
        JWindow window = new JWindow();
        window.setSize(200, 100);
        window.add(new JLabel("Welcome Window", SwingConstants.CENTER));
        window.setLocationRelativeTo(null);
        window.setVisible(true);

       
        JDialog dialog = new JDialog(frame, "My Dialog", true);
        dialog.setSize(200, 150);
        dialog.add(new JLabel("This is Dialog"));

       
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.setLocationRelativeTo(frame);
                dialog.setVisible(true);
            }
        });
    }
}