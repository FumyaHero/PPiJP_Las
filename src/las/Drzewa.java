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
public class Drzewa extends Flora implements Zycie 
{
    String gatunek;
    String typlisci;
    String wysokosc;

public Drzewa()
    {
        Random r = new Random();
        switch(r.nextInt(5))
        {
            case 0:
                set("Sosna limba","igły","20 do 25");
                break;
                
            case 1:
                set("Buk zwyczajny","Jajowate lub eliptyczne","od 30 do 50");
                break;
                
            case 2:
                set("Dąb czerwony","Mocno klapowane (okolo 25cm)","do 25");
                break;
                
            case 3:
                set("Świerk pospolity","igły","40");
                break;
                
            case 4:
                set("Robinia akacjowa","Złożone z wielu owalnych listków","do 25");
                break;
         
        } 
    }

     @Override
public void show() 
    { 
        System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Typ lisci: " + typlisci + System.lineSeparator() + "Wysokość: " + wysokosc +" m"+ System.lineSeparator()); 
    } 
private void set(String gatunek, String typlisci, String wysokosc)
    {
        this.gatunek = gatunek;
        this.typlisci = typlisci;
        this.wysokosc = wysokosc;
    }
}
