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
public class Gady extends Fauna implements Zycie
{
       String gatunek;
       String dieta;
       String ochrona;

public Gady()
    {
        Random r = new Random();
        switch(r.nextInt(5))
        {
            case 0:
                set("Jaszczurka zwinka","pajaki,owady,slimaki","Nie");
                break;
            
                case 1:
                set("Jaszczurka zielona","stawonogi,jaszczurki,weze","Calkowita ochrona w Polsce");
                break;
                
                case 2:
                set("Padalec zwyczajny ","owady, ślimaki, dżdżownice","Calkowita ochrona w Polsce");
                break;
                
                case 3:
                set("Zaskroniec zwyczajny","płazy","Calkowita ochrona w Polsce");
                break;
                
                case 4:
                set("Żmija zygzakowata","gryzonie polne, ryjówki, krety","Calkowita ochrona w Polsce");
                break;
        } 
    }

        @Override
public void show() 
    { 
        System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Dieta: " + dieta + System.lineSeparator() + "Czy jest pod ochroną?: " + ochrona + System.lineSeparator()); 
    }
private void set(String gatunek, String dieta, String ochrona)
    {
        this.gatunek = gatunek;
        this.dieta = dieta;
        this.ochrona = ochrona;
    }
}
