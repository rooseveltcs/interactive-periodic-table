import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabelListener extends MouseInputAdapter
{
   private Element e;
   
   public LabelListener(Element e) {
      this.e = e;    
   }
   
   public void mouseClicked(MouseEvent event)
   {
      ElementFrame frame = new ElementFrame(e);
      frame.setSize(new Dimension(1280,1024));
      frame.setVisible(true);
   }
}