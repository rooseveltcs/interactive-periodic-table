import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ElementFrame extends JFrame {
   private Element e;
   private Graphics g;
     
   public ElementFrame(Element e) {
      this.e = e;
      setSize(new Dimension(1280, 1024));
      setLayout(new FlowLayout());
      setTitle(e.getName());
      String name = e.getName();
	   JLabel j1 = new JLabel();
      j1.setFont(new Font("sansserif", Font.BOLD, 50));		
      j1.setIcon(new ImageIcon(name + ".jpg"));
      add(j1);
      JLabel j2 = new JLabel();
      j2.setFont(new Font("sansserif", Font.BOLD, 50));  
      j2.setText("Symbol: " + e.getSymbol());
      add(j2);
   }
}