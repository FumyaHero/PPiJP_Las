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
       String ochrona;

public Gady()
    {
        Random r = new Random();
        switch(r.nextInt(1))
        {
            case 0:
                set("Jaszczurka zwinka","pajaki,owady,slimaki","Nie");
                break;
            
        } 
    }

        @Override
public void show() 
    { 
        System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Dieta: " + dieta + System.lineSeparator() + "Czy jest pod ochroną?: " + ochrona + System.lineSeparator()); 
    }
private void set(String gatunek, String dieta, String ochrona)
    {
        this.gatunek = gatunek;
        this.dieta = dieta;
        this.ochrona = ochrona;
    }
}
