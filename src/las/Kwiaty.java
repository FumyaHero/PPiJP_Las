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
public class Kwiaty extends Flora implements Zycie
{
    String gatunek;
    String kolorplatkow;
    String kolce;

public Kwiaty()
    {
        Random r = new Random();
        switch(r.nextInt(5))
        {
            case 0:
                set("Stokrotka","Biały","nie");
                break;

            case 1:
                set("Dzika róza","Różowy","tak");
                break;
                        
            case 2:
                set("Niezapominajka","Niebieski","nie");
                break;
                
            case 3:
                set("Zawilec","Zolty","nie");
                break;
            
            case 4:
                set("Przylaszczka","Fioletowy","nie");
                break;
        } 
           
    }
    @Override
public void show() 
    { 
        System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Kolor płatków: " + kolorplatkow + System.lineSeparator() + "Czy ma kolce? " + kolce + System.lineSeparator()); 
    }  
 private void set(String gatunek, String kolorplatkow, String kolce)
    {
        this.gatunek = gatunek;
        this.kolorplatkow = kolorplatkow;
        this.kolce = kolce;
    }
}

