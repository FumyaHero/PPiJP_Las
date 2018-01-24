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
public class Ptaki extends Fauna implements Zycie 
{
       String gatunek;
       String dieta;
       int dlugoscciala;

public Ptaki()
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
        System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Dieta: " + dieta + System.lineSeparator() + "Dlugosc diala: " + dlugoscciala +" cm"+ System.lineSeparator()); 
    } 

private void set(String gatunek, String dieta, int dlugoscciala)
    {
        this.gatunek = gatunek;
        this.dieta = dieta;
        this.dlugoscciala = dlugoscciala;
    }
}
