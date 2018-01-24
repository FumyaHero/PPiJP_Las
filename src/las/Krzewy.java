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
public class Krzewy extends Flora implements Zycie 
{
    String gatunek;
    boolean czyowoce;
    int wysokosc;

public Krzewy(String x,boolean y,int k)
    {
        Random r = new Random();
        switch(r.nextInt(1))
        {
            case 0:
                set("Dzieciol","owady",true);
                break;
                
            case 1:
                set("Puszczyk","owady",true);
                break;
        } 
    }

    @Override
public void show() 
    { 
        System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Czy rodzi owoce? " + czyowoce + System.lineSeparator() + "Wysokość: " + wysokosc +" cm"+ System.lineSeparator()); 
    }    

private void set(String gatunek, boolean czyowoce, int wysokosc)
    {
        this.gatunek = gatunek;
        this.czyowoce = czyowoce;
        this.wysokosc = wysokosc;
    }
}
