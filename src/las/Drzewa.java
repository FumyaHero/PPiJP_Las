/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package las;

import java.util.Random;

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
        Random r = new Random();
        switch(r.nextInt(1))
        {
            case 0:
                set("Dzieciol","owady",70);
                break;
                
            case 1:
                set("Puszczyk","owady",70);
                break;
        } 
    }

     @Override
public void show() 
    { 
        System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Czy ma liście? " + czyliscie + System.lineSeparator() + "Wysokość: " + wysokosc +" m"+ System.lineSeparator()); 
    } 
private void set(String gatunek, String dieta, int rozpietoscskrzydel)
    {
        this.gatunek = gatunek;
        this.czyliscie = czyliscie;
        this.wysokosc = wysokosc;
    }
}
