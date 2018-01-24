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
public class Ssaki extends Fauna implements Zycie
{
    String gatunek;
    String dieta;
    String kolor_futra;

public Ssaki()
    {
        Random r = new Random();
        switch(r.nextInt(4))
        {
            case 0:
                set("Lis","Mięso","Rude");
                break;

            case 1:
                set("Dzik","Żołędzie","Ciemnobrązowe");
                break;
                
            case 2:
                set("Sarna","Owoce leśne","Jasnobrązowe");
                break;
                              
            case 3:
                set("Wiewiórka","Żołędzie","Rude");
                break;
        } 

    }
    
        @Override
public void show() 
    { 
        System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Dieta: " + dieta + System.lineSeparator() + "Kolor futra: " + kolor_futra + System.lineSeparator()); 
    }      
    
private void set(String gatunek, String dieta, String kolor_futra)
    {
        this.gatunek = gatunek;
        this.dieta = dieta;
        this.kolor_futra = kolor_futra;
    }
}

// OLD CODE
/*
        
    this.gatunek = x;
    this.dieta = y;
    this.kolorfutra = k;
    
    case 3:las[i] = new Ssaki("Dzik","Żołędzie","Ciemnobrązowe");break;
    case 4:las[i] = new Ssaki("Sarna","Owoce leśne","Jasnobrązowe");break;
    case 5:las[i] = new Ssaki("Lis","Mięso","Rude");break;
*/