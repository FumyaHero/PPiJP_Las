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
public class Ptaki extends Fauna implements Zycie 
{
       String gatunek;
       String dieta;
       int rozpietoscskrzydel;

       public Ptaki(String x,String y,int k)
            {
                this.gatunek = x;
                this.dieta = y;
                this.rozpietoscskrzydel = k;
            }

        @Override
        public void show() 
        { 
            System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Dieta: " + dieta + System.lineSeparator() + "Rozpiętość skrzydeł: " + rozpietoscskrzydel +" cm"+ System.lineSeparator()); 
        } 
}
