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
public class Owady extends Fauna implements Zycie 
{
       String gatunek;
       int iloscskrzydel;
       int liczbakonczyn;

       public Owady(String x,int y,int k)
            {
                this.gatunek = x;
                this.iloscskrzydel = y;
                this.liczbakonczyn = k;
            }

        @Override
        public void show() 
        { 
            System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Liczba skrzydeł: " + iloscskrzydel + System.lineSeparator() + "Liczba kończyn: " + liczbakonczyn +" cm"+ System.lineSeparator()); 
        } 
}
