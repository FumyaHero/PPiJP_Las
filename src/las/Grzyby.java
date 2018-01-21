/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package las;

/**
 *
 * @author Student
 */
public class Grzyby implements Zycie{
    
    String krolestwo = "Królestwo grzybów";
    String gatunek;
    boolean czyjadalny;
    String wysokosc;

    public Grzyby(String x,boolean y,String k)
        {
            this.gatunek = x;
            this.czyjadalny = y;
            this.wysokosc = k;
        }

   @Override
   public void show() 
    { 
        System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Czy jest jadalny? " + czyjadalny + System.lineSeparator() + "Wysokość: " + wysokosc +" cm"+ System.lineSeparator()); 
    }

    
}
