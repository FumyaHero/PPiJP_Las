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
public class Owady extends Fauna implements Zycie 
{
    String gatunek;
    String dieta;
    String wielkosc;

    public Owady()
    {
        Random r = new Random(); 
        switch(r.nextInt(5))
        {
            case 0:
                set("Mszyca bzowa","Roślinożerna","ok 1");
                break;

            case 1:
                set("Rohatyniec nosorożec","Roślinożerny","30");
                break;
                
            case 2:
                set("Kowal bezskrzydły","Wszystkożerny","10");
                break;
                
            case 3:
                set("Łunica czerwona","Poluje na inne owady","40");
                break;
                
            case 4:
                set("Mieniak tęczowiec","Roślinami żywicielkami są wierzba iwa, szara, uszata","50");
                break;
        }
    }
        @Override
    public void show() 
    { 
        System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Dieta: " + dieta + System.lineSeparator() + "Wielkosc: " + wielkosc +" mm"+ System.lineSeparator()); 
    } 
    private void set( String gatunek, String iloscskrzydel, String wielkosc)
    {
        this.gatunek = gatunek;
        this.dieta = dieta;
        this.wielkosc = wielkosc;
    }
}

