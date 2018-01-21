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
public class Krzewy extends Flora implements Zycie 
{
    String gatunek;
    boolean czyowoce;
    int wysokosc;

    public Krzewy(String x,boolean y,int k)
         {
             this.gatunek = x;
             this.czyowoce = y;
             this.wysokosc = k;
         }

     @Override
     public void show() 
    { 
            System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Czy rodzi owoce? " + czyowoce + System.lineSeparator() + "Wysokość: " + wysokosc +" cm"+ System.lineSeparator()); 
    }     
}
