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
        boolean kolce;

        public Kwiaty()
        {
        Random r = new Random();
        switch(r.nextInt(4))
        {
            case 0:
                set("Stokrotka","Biały",false);
                break;

            case 1:
                set("Dzika róza","Różowy",true);
                break;
                
            case 2:
                set("Niezapominajka","Niebieski",false);
                break;
                
            case 3:
                set("Zawilec","Zolty",false);
                break;
        } 
           
        }
       @Override
       public void show() 
        { 
            System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Kolor płatków: " + kolorplatkow + System.lineSeparator() + "Czy ma kolce? " + kolce + System.lineSeparator()); 
        }  
       private void set( String gatunek, String kolorplatkow, Boolean kolce)
    {
        this.gatunek = gatunek;
        this.kolorplatkow = kolorplatkow;
        this.kolce = kolce;
    }
    }

