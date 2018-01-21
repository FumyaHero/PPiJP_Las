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
public class Drzewa extends Flora implements Zycie 
{
    String gatunek;
    boolean czyliscie;
    int wysokosc;

    public Drzewa(String x,boolean y,int k)
         {
             this.gatunek = x;
             this.czyliscie = y;
             this.wysokosc = k;
         }

     @Override
     public void show() 
    { 
            System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Czy ma liście? " + czyliscie + System.lineSeparator() + "Wysokość: " + wysokosc +" m"+ System.lineSeparator()); 
    } 
}
