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
public class Gady extends Fauna implements Zycie
{
       String gatunek;
       String dieta;
       boolean pancerz;

public Gady(String x,String y,boolean k)
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
        System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Dieta: " + dieta + System.lineSeparator() + "Pancerz? " + pancerz + System.lineSeparator()); 
    }
private void set(String gatunek, String dieta, boolean pancerz)
    {
        this.gatunek = gatunek;
        this.dieta = dieta;
        this.pancerz = pancerz;
    }
}
