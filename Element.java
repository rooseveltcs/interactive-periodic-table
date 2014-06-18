/**
 * This class is where the element is methods are. 
 * The element constructor takes information about 
 * the element and there are methods to get that 
 * information back to be inputed into the elementframe. 
 * This class has private instance fields for all 
 * the information added to the element constructor.
 *
 * @author Zoe Lawrence
 * @version 06/18/14
 *
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Element
{
   /**
    * This is the instance 
    * field for the element
    * name
    */
   private String name;
   
   /**
    * This is the instance 
    * field for the element
    * atomicNum
    */
   private int atomicNum;
   
   /**
    * This is the instance 
    * field for the element
    * symbol
    */
   private String symbol;
   
   /**
    * This is the instance 
    * field for the element
    * atomicMass
    */
   private double atomicMass;
   
   /**
    * This is the constructor for an element object.
    * It creates the element and stores the elements
    * name and atomic number and symbol and atomic mass
    * in the private instance fields created above.
    * 
    * @param name        takes a string that is the name of 
    *                    the element and sets it as the value
    *                    for the private instance feild name
    * @param atomicNum   takes a int that is the atomicNum of 
    *                    the element and sets it as the value
    *                    for the private instance feild atomicNum   
    * @param symbol      takes a string that is the symbol of 
    *                    the element and sets it as the value
    *                    for the private instance feild symbol
    * @param atomicMass  takes a double that is the atomicMass of 
    *                    the element and sets it as the value
    *                    for the private instance feild atomicMass
    */
   public Element(String name, int atomicNum, String symbol, double atomicMass)
   {
      this.name = name;
      this.atomicNum = atomicNum;
      this.symbol = symbol;
      this.atomicMass = atomicMass;
   }
   
   /**
    * This method returns the 
    * name of a given element
    * 
    * @return name  the name of the 
    *               element calling 
    *               the method
    */
   public String getName() {
      return name;
   }
   
   /**
    * This method returns the 
    * symbl of a given element
    * 
    * @return symbol  the symbol of the 
    *                 element calling 
    *                 the method
    */
   public String getSymbol() {
      return symbol;
   }
   
   /**
    * This method returns the 
    * atomicNum of a given element
    * 
    * @return atomicNum  the atomicNum of the 
    *                    element calling 
    *                    the method
    */
   public int getAtomicNum() {
      return atomicNum;
   }

   /**
    * This method returns the 
    * atomicMass of a given element
    * 
    * @return atomicMass  the atomicMass of the 
    *                     element calling 
    *                     the method
    */
   public double getAtomicMass() {
      return atomicMass;
   }
}