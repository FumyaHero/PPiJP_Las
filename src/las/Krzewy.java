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
        switch(r.nextInt(5))
        {
            case 0:
                set("Śliwa tarnina","kuliste,jadalne","3 do 4");
                break;
            case 1:
                set("Czeremcha zwyczajna","Czarne, błyszczące, kuliste, wielkości grochu, jadalne ","0,5 do 4");
                break;
                
            case 2:
                set("Bez koralowy","Koralowoczerwone,trujące","do 5");
                break;
                
            case 3:
                set("Bez czarny","Czarne, błyszczące, jadalne po wysuszeniu.","do 7");
                break;
                
            case 4:
                set("Malina właściwa","Czerwony, zbiorowy","do 2");
                break;
        } 
    }

    @Override
public void show() 
    { 
        System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Czy rodzi owoce? " + owoce + System.lineSeparator() + "Wysokość: " + wysokosc +" m"+ System.lineSeparator()); 
    }    

private void set(String gatunek, String owoce, String wysokosc)
    {
        this.gatunek = gatunek;
        this.owoce = owoce;
        this.wysokosc = wysokosc;
    }
}
