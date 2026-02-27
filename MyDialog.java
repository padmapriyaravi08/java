import javax.swing.*;
public class MyDialog {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    JDialog dialog = new JDialog(frame, "My Dialog",true);
    dialog.setSize(600, 600);
    dialog.setVisible(true);
  }
}