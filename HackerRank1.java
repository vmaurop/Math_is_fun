
package Calculations;


import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;


public class HackerRank1 
{
    public void Mini_Max_Sum()
    {
        /*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
Input Format
A single line of five space-separated integers.
Constraints
Each integer is in the inclusive range .[1,10^9]
Output Format
Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than 32 bit integer.)
        */
         Scanner in = new Scanner(System.in);
         int[] arr = new int[5];
         ArrayList<Long> results = new ArrayList<>();
         long sum=0;
        
            for(int i=0; i < 5; i++)
            {
                
                
                arr[i] = in.nextInt();
                
            }
          
            for(int j=0;j<5;j++)
            {
               
                    
                for(int a=0;a<5;a++)
                {
                    if(a==j)
                    {
                        continue;
                    }
                    sum = sum +arr[a];
                }
                  if(arr[j]>=1&&arr[j]<Math.pow(10, 9))
                  {     
                    results.add(sum);
                    sum=0;
                  }
                  else
                  {
                      System.exit(1);
                  }
            }
            
            System.out.println(Collections.min(results)+" "+Collections.max(results));
            
         
    }
    
}
