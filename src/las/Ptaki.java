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
                set("Bielik","owady",80);
                break;
                
            case 2:
                set("Białozór ","Średniej wielkości ptaki",55);
                break;
                
            case 3:
                set("Cyranka ","rosliny i zwierzeta, z powierzchni wody",38);
                break;
                
            case 4:
                set("Zielonka","Małe bezkręgowce i nasiona roślin",20);
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
