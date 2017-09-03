
//package Calculations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.ThreadLocalRandom;
;


public class Probabilities 
{
    
       public static void random()
        {
            int n,a,b;
            
             while(true)
       {      
           
            
            try
                    {
                      Scanner in = new Scanner(System.in);
                      System.out.print("please give me how many numbers:");  
                      n= in.nextInt();
                      break;
                    }
           catch(Exception e)
                    {
                       System.out.println("wrong iput of data!");
                       
                    }
       } 
       while(true)
       {     
           try
           {    
             do
                    {  
                       Scanner in = new Scanner(System.in);
                       System.out.println("Give me the interval of random numbers (only integers and first the smallest then the biggest)");
                       System.out.print("Smaller:");
                       a=in.nextInt();
            
                       System.out.print("Larger:");
                       b=in.nextInt();
                       
                    }while(a>b);  
                    break;
           }
            catch(Exception e)
            {
           
            }
       }      
                 
       
                 int [] numbers = new int[n];
                 int [] counter = new int[n];
       
            
            
         // εισαγουμε τα δεδομενα μας με τυχαιο τροπο απο α εως β 
            for(int i=0;i<n;i++)
            {
                numbers[i] = ThreadLocalRandom.current().nextInt(a,b+1);
                System.out.print(+numbers[i]+" ");
            }
        
            
          
          
            
                
             
       //  System.out.println("\n"+Arrays.toString(numbers));
           
           
          
         
       //ενας πινακας που μετραει ποσες φορες εμφανιζεται ο καθες αρθμος
            
            for (int i=0;i<n;i++)
            {
                for (int j=0;j<n;j++)
                {
                    if (numbers[i]==numbers[j])
                    {
                               counter[i]++;
                    }
                }
            }
           
           
        //   System.out.println(""+Arrays.toString(counter));
            
            
           
            ArrayList<Integer> results1 = new ArrayList<>();   
            ArrayList<Integer> results2 = new ArrayList<>();
            
    //βαζει τα αποτελεσματα σε 2 λιστες.μια για τους αριθμους μια για το ποσες φορες      
    //και σβηνει τις διπλες τιμες
        for (int i=a;i<b+1;i++)
        {    
             for (int j=0;j<n;j++)
            {   
               if (i==numbers[j])
              {
               results1.add(numbers[j]);
               results2.add(counter[j]);
               break;
              }
            } 
       
         }
           
     //   System.out.println("\n"+results1);
     //   System.out.println(""+results2);
         
         
         
         ArrayList<Float> probability = new ArrayList<>();
         // μια λιστα που εμφανιζει τις πιθανοτητες
         
          for (int i=0;i<results2.size();i++)
          {
              probability.add(i,(float)results2.get(i)*100/n);
          }
         //τυπωνει τα αποτελεσματα
          for(int i=0;i<results2.size();i++)
          {
              
           System.out.print("\nThe number "+results1.get(i)+" appears "+results2.get(i)+" times"+" with probability:"+probability.get(i)+"%"); 
          }
      
         
          
          
    //    System.out.println("\n"+probability);
        
       
       //ελεγχουμε ποιοι αριθμοί δεν υπαρχουνε στη λιστα!!!
       System.out.print("\n\n\n**those numbers don't exist:  ");
         int k;
            for(int i=a;i<b+1;i++)
           {       
               k=0;                                    
               for (int j=0;j<results1.size();j++)
                {
                
                  if (i!=results1.get(j))
                  {
                       k=k+1;
                      if(k==results1.size())
                      {
                          System.out.print(+i+",");
                      }   
                      
                  }
                  
                }
                   
            }
           
            System.out.println(".So the probality is 0%"); 
           
       
     }
       
 }
                      
              
        
    

