/**
 * This is where the main method for the program is.
 * This is where the elements are added to 
 * the ArrayList table. The nulls are also 
 * added here. The ArrayList table is put 
 * as a parameter for the tableframe created 
 * here. The method for adding mouseListeners. 
 * 
 * @author Zoe Lawrence
 * @version 06/18/14
 * 
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;


public class MainFrame {
   public static void main(String[] args) throws FileNotFoundException {
      ArrayList<Element> table = new ArrayList<Element>();
      for(int i = 0; i < 18; i++) { //reducing redundancy, I swear
         table.add(null);
      }
      table.add(new Element("Hydrogen", 1, "H", 1.01));
      for(int i = 0; i < 16; i++) { //reducing redundancy, I swear
         table.add(null);
      }
      table.add(new Element("Helium", 2, "He", 4.00));
      table.add(new Element("Lithium", 3, "Li", 6.94));
      table.add(new Element("Beryllium", 4, "Be", 9.01));
      for(int i = 0; i < 10; i++) { //reducing redundancy, I swear
         table.add(null);
      }
      table.add(new Element("Boron", 5,"B", 10.81));
      table.add(new Element("Carbon", 6,"C", 12.01));
      table.add(new Element("Nitrogen", 7,"N", 14.00));
      table.add(new Element("Oxygen", 8,"O", 15.99));
      table.add(new Element("Fluorine", 9,"F", 18.99));
      table.add(new Element("Neon", 10,"Ne", 20.17));
      table.add(new Element("Sodium", 11, "Na", 22.98));
      table.add(new Element("Magnesium", 12,"Mg", 24.30));
      for(int i = 0; i < 10; i++) { //reducing redundancy, I swear
         table.add(null);
      }
      table.add(new Element("Aluminum", 13,"Al", 26.98));
      table.add(new Element("Silicon", 14,"Si", 28.08));
      table.add(new Element("Phosphorus", 15,"P", 30.97));
      table.add(new Element("Sulfur", 16,"S", 32.06));
      table.add(new Element("Chlorine", 17,"Cl", 35.45));
      table.add(new Element("Argon", 18,"Ar", 39.94));
      table.add(new Element("Potassium", 19, "K", 39.09));
      table.add(new Element("Calcium", 20,"Ca", 40.07));
      table.add(new Element("Scandium", 21,"Sc", 44.95));
      table.add(new Element("Titanium", 22,"Ti", 47.88));
      table.add(new Element("Vandium", 23,"V", 50.94));
      table.add(new Element("Chromium", 24,"Cr", 51.99));
      table.add(new Element("Manganese", 25,"Mn", 54.93));
      table.add(new Element("Iron", 26,"Fe", 55.84));
      table.add(new Element("Cobalt", 27,"Co", 58.93));
      table.add(new Element("Nickel", 28,"Ni", 58.69));
      table.add(new Element("Copper", 29,"Cu", 63.54));
      table.add(new Element("Zinc", 30,"Zn", 65.39));
      table.add(new Element("Gallium", 31,"Ga", 69.73));
      table.add(new Element("Germanium", 32,"Ge", 72.64));
      table.add(new Element("Arsenic", 33,"As", 74.92));
      table.add(new Element("Selenium", 34,"Se", 78.96));
      table.add(new Element("Bromine", 35,"Br", 79.90));
      table.add(new Element("Krypton", 36,"Kr", 83.80));
      table.add(new Element("Rubidium", 37, "Rb", 85.46));
      table.add(new Element("Strontium", 38,"Sr", 87.62));
      table.add(new Element("Yttrium", 39,"Y", 88.90));
      table.add(new Element("Zirconium", 40,"Zr", 91.22));
      table.add(new Element("Niobium", 41,"Nb", 92.90));
      table.add(new Element("Molybdenum", 42,"Mo", 95.96));
      table.add(new Element("Technetium", 43,"Tc", 98.00));
      table.add(new Element("Ruthenium", 44,"Ru", 101.07));
      table.add(new Element("Rhodium", 45,"Rh", 102.90));
      table.add(new Element("Palladium", 46,"Pd", 106.42));
      table.add(new Element("Silver", 47,"Ag", 107.86));
      table.add(new Element("Cadmium", 48,"Cd", 112.41));
      table.add(new Element("Indium", 49,"In", 114.81));
      table.add(new Element("Tin", 50,"Sn", 118.71));
      table.add(new Element("Antimony", 51,"Sb", 121.76));
      table.add(new Element("Tellurium", 52,"Te", 127.6	));
      table.add(new Element("Iodine", 53,"I", 126.90));
      table.add(new Element("Xenon", 54,"Xe", 131.29));
      table.add(new Element("Cesium", 55, "Cs", 132.90));
      table.add(new Element("Barium", 56,"Ba", 137.32));
      table.add(new Element("Lanthanum", 71,"La", 138.90));
      table.add(new Element("Hafnium", 72,"Hf", 178.49));
      table.add(new Element("Tantalum", 73,"Ta", 180.94));
      table.add(new Element("Tungsten", 74,"W", 183.84));
      table.add(new Element("Rhenium", 75,"Re", 186.207));
      table.add(new Element("Osmium", 76,"Os", 190.23));
      table.add(new Element("Iridium", 77,"Ir", 192.21));
      table.add(new Element("Platinum", 78,"Pt", 195.07));
      table.add(new Element("Gold", 79,"Au", 196.96));
      table.add(new Element("Mercury", 80,"Hg", 200.59));
      table.add(new Element("Thallium", 81,"Tl", 204.38));
      table.add(new Element("Lead", 82,"Pb", 207.2));
      table.add(new Element("Bismuth", 83,"Bi", 208.98));
      table.add(new Element("Polonium", 84,"Po", 209));
      table.add(new Element("Astatine", 85,"At", 210));
      table.add(new Element("Radon", 86,"Rn", 222));
      table.add(new Element("Francium", 87, "Fr", 223));
      table.add(new Element("Radium", 88,"Ra", 226));
      table.add(new Element("Actinium", 89,"Ac", 227));
      table.add(new Element("Rutherfordium", 104,"Rf", 261));
      table.add(new Element("Dubnium", 105,"Db", 262));
      table.add(new Element("Seaborgium", 106,"Sg", 266));
      table.add(new Element("Bohrium", 107,"Bh", 264));
      table.add(new Element("Hassium", 108,"Hs", 277));
      table.add(new Element("Meitnerium", 109,"Mt", 268));
      for(int i = 0; i < 13; i++) { //reducing redundancy, I swear
         table.add(null);
      }
      table.add(new Element("Cerium", 58,"Ce", 140.11));
      table.add(new Element("Praseodymium", 59,"Pr", 140.90));
      table.add(new Element("Neodymium", 60,"Nd", 144.24));
      table.add(new Element("Promethium", 61,"Pm", 145.00));
      table.add(new Element("Samarium", 62,"Sm", 150.36));
      table.add(new Element("Europium", 63,"Eu", 151.96));
      table.add(new Element("Gadolinium", 64,"Gd", 157.25));
      table.add(new Element("Terbium", 65,"Tb", 158.92));
      table.add(new Element("Dysprosium", 66,"Dy", 162.50));
      table.add(new Element("Holmium", 67,"Ho", 164.93));
      table.add(new Element("Erbium", 68,"Er", 167.25));
      table.add(new Element("Thulium", 69,"Tm", 168.93));
      table.add(new Element("Ytterbium", 70,"Yb", 173.04));
      table.add(new Element("Lutetium", 71,"Lu", 174.96));
      for(int i = 0; i < 4; i++) { //reducing redundancy, I swear
         table.add(null);
      }
      table.add(new Element("Thorium", 90,"Th", 232.03));
      table.add(new Element("Protactinium", 91,"Pa", 231.03));
      table.add(new Element("Uranium", 92,"U", 238.02));
      table.add(new Element("Neptunium", 93,"Np", 237));
      table.add(new Element("Plutonium", 94,"Pu", 244));
      table.add(new Element("Americium", 95,"Am", 243));
      table.add(new Element("Curium", 96,"Cm", 247));
      table.add(new Element("Berkelium", 97,"Bk", 247));
      table.add(new Element("Californium", 98,"Cf", 251));
      table.add(new Element("Einsteinium", 99,"Es", 252));
      table.add(new Element("Fermium", 100,"Fm", 257));
      table.add(new Element("Mendelevium", 101,"Md", 258));
      table.add(new Element("Nobelium", 102,"No", 259));
      table.add(new Element("Lawrencium", 103,"Lr", 262));
      TableFrame periodic = new TableFrame(table);
      periodic.createClickies(table);
      periodic.setVisible(true);
   }
}