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
    String wystepowanie;
    String ochrona;

public Mech()
    {
        Random r = new Random();
        switch(r.nextInt(1))
        {
            case 0:
                set("Biczyca","lasy swierkowe","czesciowo");
                break;
            
        }
    }

   @Override
public void show() 
    { 
        System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + ": " + "Wystepowanie: " + wystepowanie + System.lineSeparator() + "Czy jest pod ochrona?: " + ochrona + System.lineSeparator()); 
    }
private void set(String gatunek, String wystepowanie, String ochrona)
    {
        this.gatunek = gatunek;
        this.wystepowanie = wystepowanie;
        this.ochrona = ochrona;
    }   
}
