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
public class Mech extends Flora implements Zycie 
{
    String gatunek;
    String wystepowanie;
    String ochrona;

public Mech()
    {
        Random r = new Random();
        switch(r.nextInt(5))
        {
            case 0:
                set("Biczyca trójwrębna","lasy swierkowe","czesciowo");
                break;
            
            case 1:
                set("drabik drzewkowaty","Zbiorowiska leśne","czesciowo");
                break;
                
            case 2:
                set("stożka ostrokrężna","Zacienione miejsca, częsty w lasach","nie");
                break;
                
            case 3:
                set("widłoząbek włoskowy","rośnie na brzegach dróg leśnych","nie");
                break;
                
            case 4:
                set("widłoząb miotłowy","lasy iglaste i mieszane","czesciowo");
                break;
        }
    }

   @Override
public void show() 
    { 
        System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Wystepowanie: " + wystepowanie + System.lineSeparator() + "Czy jest pod ochrona?: " + ochrona + System.lineSeparator()); 
    }
private void set(String gatunek, String wystepowanie, String ochrona)
    {
        this.gatunek = gatunek;
        this.wystepowanie = wystepowanie;
        this.ochrona = ochrona;
    }   
}
