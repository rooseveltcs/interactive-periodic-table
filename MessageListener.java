import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MessageListener implements ActionListener
{
   public void actionPerformed(ActionEvent event)
   {
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(new Dimension(1280,1024));
      frame.setVisible(true);
   }
}