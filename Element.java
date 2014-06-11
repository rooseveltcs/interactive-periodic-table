import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Element
{
   private String name;
   private int atomicNum;
   private String symbol;
   private double atomicMass;
   private double ionicCharge;
   private int atomicRadius;
   private int electronegavity;
   private int ionizationLevel;
   private Graphics g;
   private int neutrons;
   private String electronConfig;
   private String matterState;
   private String color;
   private boolean radioactive;
   private int density;
   
   public Element(String name, int atomicNum, String symbol, double atomicMass)
   {
      this.name = name;
      this.atomicNum = atomicNum;
      this.symbol = symbol;
      this.atomicMass = atomicMass;
   }
   
   public String getName() {
      return name;
   }
   
   public String getSymbol() {
      return symbol;
   }
   
   public int getAtomicNum() {
      return atomicNum;
   }
   
   public double getIonicCharge(int iCharge) {
      return iCharge;
   }
   
   public int getAtomicRadius(int aRadius) {
      return aRadius;
   }
   
   public int getElectronegavity(int eNeg) {
      return eNeg;
   }
   
   public int getIonizationLevel(int iLevel) {
      return iLevel;
   }
   
   public int getNeutrons(int n) {
      return n;
   }
   
   public int getDensity(int d) {
      return d;
   }
}