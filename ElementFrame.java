/**
 * This class creates a new type
 * of JFrame. The class creates 
 * a frame that is a certain size
 * and the constructor takes 
 * an element where it gets
 * information for the element from 
 *
 * @author Zoe Lawrence
 * @version 06/18/14
 * 
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ElementFrame extends JFrame {
   private Element e;
     
   /**
    * This constructor creates the frame,
    * and takes an element so that the 
    * name and photo can be added to the 
    * frame.
    *
    * @param e  is and element that has methods
    *           to getName and symbol.
    */
   public ElementFrame(Element e) {
      this.e = e;
      setSize(new Dimension(1280, 1024));
      setLayout(new FlowLayout());
      setTitle(e.getName());
      String name = e.getName();
	   JLabel j2 = new JLabel();
      j2.setFont(new Font("sansserif", Font.BOLD, 50));  
      j2.setText("Element Name: " + name);
      add(j2);
      JLabel j1 = new JLabel();
      j1.setFont(new Font("sansserif", Font.BOLD, 50));		
      j1.setIcon(new ImageIcon(name + ".jpg"));
      add(j1);
   }
}