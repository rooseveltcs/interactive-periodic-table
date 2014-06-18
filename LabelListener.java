/**
 * This class is the mouselistener.
 * It establishes a listener that
 * takes an element from an arraylist.
 * Also it opens the frame. It extends 
 * MouseInputAdapter. 
 *
 * @author Zoe Lawrence
 * @version 06/18/14
 * 
 */

import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabelListener extends MouseInputAdapter
{
   private Element e;
   
   //this is self-explanitory
   public LabelListener(Element e) {
      this.e = e;    
   }
   
   //this is self-explanitory
   //when mouse is clicked, frame opens
   public void mouseClicked(MouseEvent event)
   {
      ElementFrame frame = new ElementFrame(e);
      frame.setSize(new Dimension(1280,1024));
      frame.setVisible(true);
   }
}