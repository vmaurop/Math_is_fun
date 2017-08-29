
package Calculations;


import com.sun.javafx.runtime.eula.Eula;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;

public class Mathematics extends Gcd_Lcm
{        
    
    public void gtd_an()  /*οταν θελω να συεχισω σε μια void συναρτηση*/
    {
        super.gdt_and_lcm();
        int x;
        x=gcd+1;
        System.out.println(x);
        
    }
    
    public static BigInteger factorial(int n)                         
    {
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++)
        {
           fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
  
   
    public static String even_odd(int n)
    {
        
        if (n%2==0)
        {
            
            return "even";
            
        }
        else
        {
            return "odd";
        }
       
    }
    
    public static void exponential_equation(double x,double y)  //x**n=y    finds n...
    {
        
        double n= Math.log(Math.abs(y))/Math.log(Math.abs(x));
        if (x==0)
        {
            if (y==0)
            {    
                  System.out.println("all numbers are solution except zero");
                  return;
            }
            else
            {
                  System.out.println("no solution in real numbers..");
                  return;
            }        
        }
        if(x==1)
        {
            if (y==1)
            {    
                System.out.println("all numbers are solution");
                return;
            }
            else
            {
                System.out.println("no solution in real numbers..");
                return;
            }
        }
        
            System.out.println(""+n);
            
    }
    
    public  void exponent_root(int n,double a)   //n-osti riza enos a arithmou...
    {
        
        if (n>0&&a>=0)
            System.out.println(""+(double)Math.round(Math.exp(Math.log(a)/n)*100000d)/100000d);
        else
            System.out.println("The root must be greater than or equal to zero and the expοnent of root only positive integer");
            
    }
    
   
    
 public void exponential_roots(double n,double y)  //x**n=y finds x...
 {
   
   
   double x = Math.exp(Math.log(Math.abs(y))/Math.abs(n));
   x = Math.round(x*100000d)/100000d;
              
    if(y!=0)
    {    
         
        if (y>0)
        {    
            if(n%2==0)
            {    
                if(n>0)
                {    
                    System.out.println(""+x+","+(-x));
                }    
                else if(n<0)
                {    
                    System.out.println(""+(1/x)+","+(-1/x));
                }    
                else
                {    
                    if (y==1)
                    {    
                        System.out.println("all real numbers are solutions");
                    }    
                    else
                    {    
                        System.out.println("no roots in real numbers");
                    }   
                }    
            }    
            else if(n%2==1)
            {    
                if (n>0)
                {    
                    System.out.println(""+x);
                }    
                else if (n<0)
                {    
                    System.out.println(""+(1/x));
                }    
            }    
            else
            {    
                if (n>0)
                {    
                    System.out.println(""+x);
                }    
                else if (n<0)
                {    
                    System.out.println(""+(1/x));
                }    
            } 
        }    
        if(y<0)
        {    
            if(n%2==0)
            {    
                System.out.println("no roots in real numbers");
            }    
            if(n%2==1)
            {    
                if(n>0)
                {    
                    System.out.println(""+(-x));
                }    
                else if (n<0)
                {    
                    System.out.println(""+(-1/x));
                }    
            }    
            else
                System.out.println("no roots in real numbers");
        }    
           
    }           
    else if (y==0)
    {    
        if (n==0)
        {
            System.out.println("no roots in real numbers");
        }
        else if(n>0)
        {    
            System.out.println(""+0);
        }
        else
        {    
            System.out.println("no roots in real numbers");
        }    
    }               
 }
 
    public  void equationX1(double a,double b)
    {
        
        double x = 0;
        if ((a>0&&b>0) || (a<0&&b<0))
        {
            System.out.println(""+(-Math.abs(b/a)));
        }
        else
        {
            if (a==0&&b==0)
            {
                System.out.println("all numbers are solutions in real numbers..");
                return;
            }
            else if(a==0)
            {
                System.out.println("no roots in real numbers..");
                return;
            }
            else
            {    
              System.out.println(""+Math.abs(b/a));
            }
           
        }
    }
    
    
    
}   
    
    


    

