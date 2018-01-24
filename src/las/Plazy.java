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
public class Plazy extends Fauna implements Zycie 
{
       String gatunek;
       String rodzina;
       String dlugosczycia;

public Plazy()
    {
        Random r = new Random();
        switch(r.nextInt(5))
        {
            case 0:
                set("Grzebiuszka ziemna","grzebiuszkowate","10");
                break;
                
            case 1:
                set("Kumak nizinny","kumakowate","20");
                break;
                
            case 2:
                set("Rzekotka drzewna","rzekotki","od 4 do 6");
                break;  
              
            case 3:
                set("Ropucha szara","ropuchowate","40");
                break;
                
            case 4:
                set("Ropucha zielona","ropuchowate","od 6 do 15");
                break;
        }
    }

        @Override
public void show() 
    { 
        System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Rodzina: " + rodzina + System.lineSeparator() + "Maksymalna dlugosc zycia: " + dlugosczycia + " lat"+ System.lineSeparator()); 
    } 
        
private void set(String gatunek, String rodzina, String dlugosczycia)
    {
        this.gatunek = gatunek;
        this.rodzina = rodzina;
        this.dlugosczycia = dlugosczycia;
    }  
}

