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
public class Plazy extends Fauna implements Zycie 
{
       String gatunek;
       String dieta;
       String rozmiar;

       public Plazy(String x,String y,String k)
            {
                this.gatunek = x;
                this.dieta = y;
                this.rozmiar = k;
            }

        @Override
        public void show() 
        { 
            System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Dieta: " + dieta + System.lineSeparator() + "Rozmiar: " + rozmiar + System.lineSeparator()); 
        } 
}

