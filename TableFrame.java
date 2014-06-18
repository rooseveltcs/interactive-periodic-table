/**
 * This is a type of JFrame. It creates an array list and uses
 * it for adding the elements to the frame. This is also
 * where the mouseListeners add the event to clicking the button.
 * There is a constructor that creates the frame and all the 
 * settings, such as how to close it, how big it is and such. 
 * This is also where the table is created with the buttons.
 * 
 * @author Zoe Lawrence
 * @version 06/18/14
 * 
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TableFrame extends JFrame {
   /**
    * This is the table where the element info
    * it stored.
    */
   private ArrayList<Element> table;
     
   /**
    * Sets up the table as the table that is equal to 
    * the ArrayList created in main. Sets the size
    * and layout of the frame created. The way
    * to close the frame is also established.
    *
    * @param table  takes a table with elements 
    *               to be processed by the class.
    */
   public TableFrame(ArrayList<Element> table){
      this.table = table;
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(new Dimension(1280, 1024));
      setLayout(new GridLayout(10,18));
   }
   /**
    * Establishes the mouseListener, adding it to
    * the buttons that are created. Buttons are 
    * created for elements and Labels are created
    * for the nulls (spaces) in the table. Creates 
    * the layout and dimension of the Label or Button.
    * Labels and Buttons are added to the TableFrame.
    *
    * @param elements  takes an ArrayList of elements
    *                  and nulls that are processed
    *                  and set as values for buttons
    *                  or labels so the right element 
    *                  picture is added
    *   
    */
   public void createClickies(ArrayList<Element> elements) {
      ArrayList<JButton> list = new ArrayList<JButton>();
      for(int i = 0; i < elements.size(); i++) {
         Element temp = table.get(i);
         if (temp == null) {
            LabelListener mousie = new LabelListener(temp);
            JButton test = new JButton("", new ImageIcon(temp.getName() + ".jpg"));
            test.addMouseListener(mousie);
            add(test, BorderLayout.LINE_END);
            test.setPreferredSize(new Dimension(75,200));
         } else {         
            JLabel label = new JLabel();
            label.setPreferredSize(new Dimension(50, 100));
            add(label, BorderLayout.LINE_END);
         }
      }
   }
}