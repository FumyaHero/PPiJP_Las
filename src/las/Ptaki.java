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
       int rozpietoscskrzydel;

public Ptaki()
    {
        Random r = new Random();
        switch(r.nextInt(1))
        {
            case 0:
                set("Dzieciol","owady",70);
                break;
        } 
    }

        @Override
        public void show() 
        { 
            System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Dieta: " + dieta + System.lineSeparator() + "Rozpiętość skrzydeł: " + rozpietoscskrzydel +" cm"+ System.lineSeparator()); 
        } 
private void set(String gatunek, String dieta, int rozpietoscskrzydel)
    {
        this.gatunek = gatunek;
        this.dieta = dieta;
        this.rozpietoscskrzydel = rozpietoscskrzydel;
    }
}
