
//package Calculations;

import java.util.Arrays;
import java.util.Scanner;

      
public class Statistic 
{
    
    
    public static void stat()
    {
        int n;
        double sum=0.0,average,standard_deviation,variance,median;
        
        System.out.println("please give me how many numbers");
        Scanner in = new Scanner(System.in);
        n= in.nextInt();
        double[] array = new double[n];
        
        //εισάγουμε τα δεδομένα(τις τιμές)
        System.out.println("input  the numbers:");
        for (int i=0;i<n;i++)
        {
            array[i]=in.nextDouble();
            sum = sum + array[i];
        }
       
        //βρήσκουμε το μέγιστο και το ελάχιστο
        Arrays.sort(array);
        System.out.println("Minimum = " + array[0]);
        System.out.println("Maximum = " + array[array.length-1]);
 
         
        
 
        
        //μέση τιμή
        average = sum/n;
        System.out.println("the average of numbers is:"+average);
        
        
        
        //διάμεσος
        if (n%2==0)
        {
            median = (array[n/2-1]+array[n/2])/2.0;
        }
        else
        {
            median = array[n/2];
        }
        System.out.println("the median is:"+median);
        
        
        
        double sum2=0.0;
        for (int i=0;i<n;i++)
        {
            array[i]=Math.pow((array[i]-average),2);
            sum2=sum2+array[i];
        }
        
        //διακύμανση
        variance=sum2/n;
        System.out.println("the fluctuation is:"+variance);
        
        
        //τυπική απόκλιση
        standard_deviation=Math.sqrt(variance);
        System.out.println("the diveerence of numbers is:"+standard_deviation);
        
        
     }
    
}
