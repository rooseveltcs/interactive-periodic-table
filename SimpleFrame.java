import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleFrame {
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setForeground(Color.RED);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocation(new Point(10,50));
      frame.setSize(new Dimension(300,120));
      frame.setVisible(true);
      frame.setTitle("Interactive Periodic Table");
      
      JButton button1 = new JButton();
      button1.setText("Calcium");
      JButton button2 = new JButton();
      button2.setText("Iron");
      frame.add(button1);
      frame.add(button2);

       JTextField field = new JTextField(8);
       frame.add(field);
       
       JLabel label = new JLabel("This is a label");
       frame.add(label);
       
       frame.setLayout(new FlowLayout());
       frame.pack();
       
   }
}