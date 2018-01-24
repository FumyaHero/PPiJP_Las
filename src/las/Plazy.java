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
        switch(r.nextInt(1))
        {
            case 0:
                set("Grzebiuszka","grzebiuszkowate","10");
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

