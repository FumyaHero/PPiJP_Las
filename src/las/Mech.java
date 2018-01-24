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
public class Mech extends Flora implements Zycie 
{
    String gatunek;
    String kolor;
    String sprezystosc;

public Mech(String x,String y,String k)
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
        System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Kolor płatków: " + kolor + System.lineSeparator() + "Sprężystość: " + sprezystosc + System.lineSeparator()); 
    }
private void set(String gatunek, String kolor, String sprezystosc)
    {
        this.gatunek = gatunek;
        this.kolor = kolor;
        this.sprezystosc = sprezystosc;
    }   
}
