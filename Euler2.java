
package Calculations;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;




public class Euler2 
{
    public void distinctpowers()
    {
        /*29
        Consider all integer combinations of a^b for 2 ≤ a ≤ 5 and 2 ≤ b ≤ 5:
        2^2=4, 2^3=8, 2^4=16, 2^5=32
        3^2=9, 3^3=27, 3^4=81, 3^5=243
        4^2=16, 4^3=64, 4^4=256, 4^5=1024
        5^2=25, 5^3=125, 5^4=625, 5^5=3125
        If they are then placed in numerical order, with any repeats removed, we get the following sequence of 15 distinct terms:
        4, 8, 9, 16, 25, 27, 32, 64, 81, 125, 243, 256, 625, 1024, 3125
        How many distinct terms are in the sequence generated by ab for 2 ≤ a ≤ 100 and 2 ≤ b ≤ 100?
        */
        
        BigInteger d = BigInteger.valueOf(0);
        ArrayList<BigInteger> results1 = new ArrayList<>(); 
        for(int i=2;i<=100;i++)
        {
            for(int j=2;j<=100;j++)
            {
                d=BigInteger.valueOf(i).pow(j);
                results1.add(d);
            }
        }
       
            
        Collection<BigInteger> noDups = new HashSet<BigInteger>(results1);//σβηνει διπλοτυπα!!
        System.out.println(noDups.size());
        // System.out.println(noDups);// θα ειναι μη ταξινoμημενο  
        
        
        //σε περιπτωση που θελουμε κ να τα ταξινομησουμε αυτο γινεται αν τα μεταφερουμε στην αρχικη λιστα
      /*   results1.clear();
         results1.addAll(noDups);    
                                        
         
         Collections.sort(results1);   //ταξινομηση
         
          System.out.println(results1.size());
         System.out.println(results1);*/ 
        
        
              //ενναλακτικα!   διαγραφει τα διπλοτυπα απο μια λιστα Biginteger
   /*   for(int m=0;m<results1.size()-1;m++)
       {
           for(int n=m+1;n<results1.size();n++)
           {
               if(results1.get(m).equals(results1.get(n)))
               {
                   results1.remove(n);
               }
                   
           }
       }*/
        
    }
    
    
    
}
