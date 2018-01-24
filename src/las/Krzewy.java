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
    String owoce;
    String wysokosc;

public Krzewy()
    {
        Random r = new Random();
        switch(r.nextInt(1))
        {
            case 0:
                set("Śliwa tarnina","kuliste,jadalne","300-400");
                break;
             
        } 
    }

    @Override
public void show() 
    { 
        System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Czy rodzi owoce? " + owoce + System.lineSeparator() + "Wysokość: " + wysokosc +" cm"+ System.lineSeparator()); 
    }    

private void set(String gatunek, String czyowoce, String wysokosc)
    {
        this.gatunek = gatunek;
        this.owoce = owoce;
        this.wysokosc = wysokosc;
    }
}
