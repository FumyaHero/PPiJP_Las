/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package las;

/**
 *
 * @author Student
 */
public class Mech extends Flora implements Zycie 
{
    String gatunek;
    String kolor;
    String sprezystosc;

    public Mech(String x,String y,String k)
        {
            this.gatunek = x;
            this.kolor = y;
            this.sprezystosc = k;
        }

   @Override
   public void show() 
    { 
        System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Kolor płatków: " + kolor + System.lineSeparator() + "Sprężystość: " + sprezystosc + System.lineSeparator()); 
    }
}
