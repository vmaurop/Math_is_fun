
//package Calculations;


import java.util.Arrays;
import java.util.Scanner;


//υπολογισμός ΜΚΔ και ΕΚΠ


public class Gcd_Lcm 
{
    int n,min,max;
    int counter,counter1;
    int gcd,lcm;
    
    public  void gdt_and_lcm()
    {
        
        System.out.println("please give me how many numbers");
        Scanner in = new Scanner(System.in);
        n= in.nextInt();
        int [] num = new int[n];
        
        //εισάγουμε τα δεδομένα(τις τιμές)
        System.out.println("input the numbers (only positive integers):");
        for (int i=0;i<n;i++)
        {
            num[i]=in.nextInt();
        }
         Arrays.sort(num);
         min = num[0];
         max = num[n-1];
         counter=0;
         counter1=0;
         
         
      //Υπολογισμός ΜΚΔ θετικών ακέραιων αριθμών
       
         
       while (counter<n)
     {       
           counter=0;
         
         for (int j=0;j<n;j++)
         {  
              if ((num[j]%min)==0)
              {
               counter=counter+1; 
              }
               
           }
            
         if(counter!=n)
           {
             min=(min-1);
           }   
            
      }
       
      
     //υπολογισμός ΕΚΠ για θετκούς ακέραιους αριθμούς
       
     
         while(counter1<n)
       {
           counter1=0;
          for (int j=0;j<n;j++)
          {
              if (max%num[j]==0)
              {
                  counter1=counter1+1;
              }
              
          }
            if (counter1!=n)
            {
                max=max+1;
            }
       }
       
         
       lcm=max;
       gcd=min;
       
       System.out.println("Initialism for greatest common divisor GCD is:"+gcd);
       System.out.println("Initialism for least common multiple LCM is:"+lcm);
       
       
        
         
        
        
    }
    
        
 }
    
