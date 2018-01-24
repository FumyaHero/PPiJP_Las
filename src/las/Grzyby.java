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
public class Grzyby implements Zycie{
    
    String krolestwo = "Królestwo grzybów";
    String gatunek;
    String czyjadalny;
    String spod_kapelusza;

public Grzyby()
    {
        Random r = new Random();
        switch(r.nextInt(5))
        {
            case 0:
                set("Borowik szlachetny","Jadalny","rurki");
                break;
                
            case 1:
                set("Borowik ceglastopory","Jadalny warunkowo","czerwone kosmki lub ziarenka");
                break;
                
            case 2:
                set("Muchomor zielonawy","Trujący","blaszki");
                break;
                
            case 3:
                set("Klejówka plamista","Jadalny","Gładkie");
                break;
                
            case 4:
                set("Gąska siarkowa","Trujący","blaszki");
                break;
                
            
        } 
    }

   @Override
public void show() 
    { 
        System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Wartość spożywcza: " + czyjadalny + System.lineSeparator() + "Spód kapelusza: " + spod_kapelusza + System.lineSeparator()); 
    }
private void set(String gatunek, String czyjadalny, String spod_kapelusza)
    {
        this.gatunek = gatunek;
        this.czyjadalny = czyjadalny;
        this.spod_kapelusza = spod_kapelusza;
    }
    
}
