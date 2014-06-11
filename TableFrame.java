import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TableFrame extends JFrame {
   private ArrayList<Element> table;
     
   public TableFrame(ArrayList<Element> table) {
      this.table = table;
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(new Dimension(1280, 1024));
      setLayout(new GridLayout(10,18));
   }
   
   public ArrayList<JButton> createClickies(ArrayList<Element> elements) {
      ArrayList<JButton> list = new ArrayList<JButton>();
      for(int i = 0; i < elements.size(); i++) {
         Element temp = table.get(i);
         if (temp == null) {
             JLabel label = new JLabel();
             label.setPreferredSize(new Dimension(50, 100));
             add(label, BorderLayout.LINE_END);
             continue;
         }         
         LabelListener mousie = new LabelListener(temp);
         JButton test = new JButton("", new ImageIcon(temp.getName() + ".jpg"));
         test.addMouseListener(mousie);
         add(test, BorderLayout.LINE_END);
         test.setPreferredSize(new Dimension(75,200));
      }
      return list;
   }
}