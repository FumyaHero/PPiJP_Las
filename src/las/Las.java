package las;

import java.util.*;

public class Las 
        
{
    public static void main(String[] args) 
    {
        Zycie las[] = new Zycie[100];
        Random r = new Random();
        int x;
        
        for(int i=0;i<=99;i++)
        {
            x = r.nextInt(3);
            switch(x)
            {
                case 0:
                    las[i] = new Ssaki();
                    break;
           
                case 1:
                    las[i] = new Kwiaty();
                    break;
                    
                case 2:
                    las[i] = new Ptaki();
                    break;
                    
                
            } 
            
            // Wypisanie nowego obiektu
            System.out.println("Organizm numer "+(i+1));
            las[i].show();
        }
    }
}

 /*
                        case 0:las[i] = new Kwiaty("Stokrotka","Biały",false);break;
                        case 1:las[i] = new Kwiaty("Dzika róza","Różowy",true);break;
                        case 2:las[i] = new Kwiaty("Niezapominajka","Niebieski",false);break;

                        case 6:las[i] = new Kwiaty("Zawilec","Zolty",false);break;
*/