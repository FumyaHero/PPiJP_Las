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
    int iloscskrzydel;
    int liczbakonczyn;

    public Owady(String x,int y,int k)
    {
        Random r = new Random(); 
        switch(r.nextInt(5))
        {
            case 0:
                set("Pszczoła",4,2);
                break;

            case 1:
                set("Pszczoła",4,2);
                break;
        }
    }
        @Override
    public void show() 
    { 
        System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Liczba skrzydeł: " + iloscskrzydel + System.lineSeparator() + "Liczba kończyn: " + liczbakonczyn +" cm"+ System.lineSeparator()); 
    } 
    private void set( String gatunek, int iloscskrzydel, int liczbakonczyn)
    {
        this.gatunek = gatunek;
        this.iloscskrzydel = iloscskrzydel;
        this.liczbakonczyn = liczbakonczyn;
    }
}

