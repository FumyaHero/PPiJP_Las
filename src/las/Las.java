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
            x = r.nextInt(9);
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
                    
                    case 3:
                    las[i] = new Drzewa();
                    break;
                    
                    case 4:
                    las[i] = new Gady();
                    break;
                    
                    case 5:
                    las[i] = new Krzewy();
                    break;
                    
                    case 6:
                    las[i] = new Grzyby();
                    break;
                    
                    case 7:
                    las[i] = new Mech();
                    break;
                    
                    case 8:
                    las[i] = new Plazy();
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