import java.awt.*;
import javax.swing.*;

public class Buttons {
  private JFrame frame;
  private JButton[][] buttons;

  public Buttons() {
    frame = new JFrame("Reversi GUI");
    frame.setLayout(new GridLayout(8, 8));

    buttons = new JButton[8][8];
    for (int row = 0; row < 8; row++) {
      for (int col = 0; col < 8; col++) {
        buttons[row][col] = new JButton();
        buttons[row][col].setBackground(Color.GREEN);
        
        frame.add(buttons[row][col]);
      }
    }

    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    new Buttons();
  }
}
  