
//package Calculations;



import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Euler1{

    
    
    public  void palindrome()
    {
     /* 
        A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
     Find the largest palindrome made from the product of two 3-digit numbers.*/
       
        
   
        ArrayList<Integer> results = new ArrayList<>();
        
        String x = null;
        
        for(int i=100;i<1000;i++)
        {
            for(int j=100;j<1000;j++)
            {
                   
              
                x = Integer.toString(i*j);                     /*εξεταζουμε αν 
                                                                   αν ενας αριθμος ειναι
                                                                        παλινδρομικος*/
                int count=0;
                for(int k=0;k<(x.length()/2);k++)
                {
                    if(x.charAt(k)==x.charAt(x.length()-k-1))
                    {
                        count++;
                        if(count==x.length()/2)
                        {
                            
                                                                                      
                            results.add(i*j);
                           
                           
                            System.out.println(""+i+"*"+j+"="+results.get(results.size()-1));
                        }
                    }
                }
                
                
                
            }
        }
     
      System.out.println("---------------------");
       
        
       Collections.sort(results);
        System.out.println("The largest palindrome made from the product of two 3-digit numbers:"+results.get(results.size()-1));
         int r = results.get(results.size()-1);
        System.out.println(Mathematics.even_odd(r));
       
    }
    
    
    public void primary_nymbers()
    {
        
       /* 
        By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
        What is the 10 001st prime number?
        */
       ArrayList<Integer> primary = new ArrayList<>();
       
        int count;
        int i=1;
       
        do{
            count = 0;
            i++;
            for(int k =2;k<=i;k++)
            {    
                if(i%k==0)
                {
                    count++;
                    if(i==k&&count==1)
                    {
                    primary.add(i);
                    }
                    
                }
                    
            }
            
        }while(primary.size()<10001);
        
        
        
          
         // System.out.println(primary);
          System.out.println(primary.get(primary.size()-1));
          
        /* 
          The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
           Find the sum of all the primes below two million.*/
        
        BigInteger p1,p2,sum;     //δηλωνουμε
        p2 = BigInteger.valueOf(2000000);//αρχικοποιουμε
        p1 = BigInteger.valueOf(0);
        sum = BigInteger.valueOf(0);
           
        while(p1.compareTo(p2)<0)   //οσο ο μπιγκ ειναι μικροτερος απο 2μ
        {
            p1= p1.nextProbablePrime();  //βρες τον επομενο..
            
            if(p1.compareTo(p2)<0)     //το βαζουμε παλι για να μη περασει το 2μ!!
            {    
              //System.out.println(p1);
                sum = sum.add(p1);
            }
        }
            
        
        
        
        System.out.println(sum);
        
      
        
        
        
       /* 
        The prime factors of 13195 are 5, 7, 13 and 29.
        What is the largest prime factor of the number 600851475143 ? 6857
        */
        
        BigInteger a1 = new BigInteger("600851475143");  //αρχικοποιηση μεγαλου! μπιγκ a1
        BigInteger a2 = a1.divide(BigInteger.valueOf(2));//διαιρουμε το μπιγκ α1 με 2(BigInteger.valueOf(2))
       // System.out.println(a1);
       // System.out.println(a2);
       
       BigInteger a3= BigInteger.valueOf(1);
        System.out.println(""+a1+" "+a2+"  "+a3);
       
       
           while(a3.compareTo(a2)<0)
           {     
               a3=a3.nextProbablePrime();
            if(a1.mod(a3).equals(BigInteger.valueOf(0)))
            {
                
                System.out.println(a3);
            }
            
           }
        
        
       // System.out.println(a3);
        
        
          
    }
   
    
    
    
    
    public void multiples_of_3_5()
    {
      /*  If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
          Find the sum of all the multiples of 3 or 5 below 1000.*/
        
          int sum=0;
       for(int i=1;i<1000;i++)
       {
           if(i%3==0||i%5==0)
           {
               sum = sum +i;
               
           }
       }
       
        System.out.println(sum);
    }
    
    
   public void factorial_digit_sum()
   {
       /*
       n! means n × (n − 1) × ... × 3 × 2 × 1
       For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
       and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
       Find the sum of the digits in the number 100!
       */
       BigInteger f;
       
       
       f= Mathematics.factorial(100); //ετοιμη συναρτηση για το παραγοντικο...
       System.out.println(f);
       String x = f.toString(); //μετατροπη big σε string
       
      
       char digits[] = x.toCharArray();//μετατροπη string σε chararray
       int num[]= new int[digits.length];//βοηθητικο διανυσμα...για να αθροισω τα ψηφια
       int sum=0;
       for(int i=0;i<digits.length;i++)
       {    
            num[i]=Integer.parseInt(String.valueOf(digits[i]));//μεταροπη των χαρακτηρων απο chararray
                                                                //σεintegerarray
            sum = sum + num[i];
       }
        System.out.println(sum);
   }
    
   
   public void Even_Fibonacci_numbers()
   {
       /*
       Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
       1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
       By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
       */
       ArrayList<Integer> fibonacci = new ArrayList<>();
       int sum=0;
       fibonacci.add(1);
       fibonacci.add(2);
       while(sum<4000000)
       {
           
           sum = fibonacci.get(fibonacci.size()-1)+fibonacci.get(fibonacci.size()-2);
           fibonacci.add(sum);
            
       }
     //  System.out.println(fibonacci);
       long sum1=0L;
       for(int i=0;i<fibonacci.size()-1;i++)
       {
         if(fibonacci.get(i)%2==0)//if(Mathematics.even_odd(fibonacci.get(i))=="even")
           {   
            sum1=sum1+fibonacci.get(i);
           }
           
       }
       System.out.println(sum1);
       
   }
   
   
   public void smallest_multiple()
   {
       /*
       2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
       What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
       */
       int max;
       int counter1 = 0;
       int sm_mul;
       int [] num = new int[20];//{1,2,3,4,5,6,7,8,9,10....,20};
       for (int i=0;i<20;i++)
       {
           num[i]=i+1;
       }
       Arrays.sort(num);
       max = num[19];
       
       
          while(counter1<20)
       {
           counter1=0;
          for (int j=0;j<20;j++)
          {
              if (max%num[j]==0)
              {
                  counter1=counter1+1;
              }
              
          }
            if (counter1!=20)
            {
                max=max+1;
            }
       }
       
         
       sm_mul=max;
       
       System.out.println(sm_mul);
       
   }
   
   
   public void sum_square_difference()
   {
       /*
       The sum of the squares of the first ten natural numbers is, 1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,(1 + 2 + ... + 10)^2 = 55^2 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
       */
       
       int sum1=0;
      
       for(int i=1;i<101;i++)
       {
           sum1 = (int) (sum1 + Math.pow(i, 2));
       }
       
      // System.out.println(sum1);
       
       int sum2=0;
       for(int k=1;k<101;k++)
       {
           sum2=sum2 +k;
       }
     //  System.out.println(+(long)Math.pow(sum2,2));
       
       int dif;
       dif = (int)((int)Math.pow(sum2,2)-sum1);
       System.out.println(dif);
       
       
   }
   
   public void special_pythagorean_triplet()
   {
       /*
       A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
        a^2 + b^2 = c^2
        For example, 3^2 + 4^2 = 9 + 16 = 25 = 52.
        There exists exactly one Pythagorean triplet for which a + b + c = 1000.
        Find the product abc.
       */
       int a = 0,b = 0,c = 0;
       long x;
       for(int i=0;i<1001;i++)
       {
           for(int j=0;j<1001;j++)
           {
               for(int k=0;k<1001;k++)
               {
                   if(Math.pow(i,2)+Math.pow(j, 2)==Math.pow(k, 2) && i+j+k==1000 && i<j && j<k)
                   {
                       a=i;
                       b=j;
                       c=k;
                      
                   }
               }
           }
       }
       
       System.out.println("a:"+a+" b:"+b+" c:"+c);
       x=a*b*c;
       System.out.println(x);
       
   }
   
   public void power_digit_sum()
   {
       /*
       2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
       What is the sum of the digits of the number 2^1000?
       */
       
       BigInteger x = new BigInteger("2").pow(1000);
      /* BigInteger r = BigInteger.valueOf(2);
       r = r.pow(1000); εναλακτικα μπορουμε ετσι..*/
       
      
      // System.out.println(x);
          String y = x.toString();//μετατρεει το biginteger στρινγκ για να μπορεσουμε μετα να το κανουμε char array
          System.out.println(y);
      int sum=0;
      char[] arr = y.toCharArray();//μετατρεπει το στρινγκ σε διανυσμα χαρακτηρων
      int [] num = new int[arr.length];
      
        for(int i=0;i<arr.length;i++)
      {
         
         num[i]=Integer.parseInt(String.valueOf(arr[i]));//μεταρεπουμε το char array σε ακεραιο array
         sum = sum +num[i];                                //μπορουμε κ απλα int z=Integer.parseInt(String.valueOf(arr[i]));
      }
       System.out.println(sum);
       
       
 
       
   }
   
   public void powerfuldigitsum()
   {
       /*
        A googol (10^100) is a massive number: one followed by one-hundred zeros; 100^100 is almost unimaginably large: one followed by two-hundred zeros. Despite their size, the sum of the digits in each number is only 1.
        Considering natural numbers of the form, ab, where a, b < 100, what is the maximum digital sum?
       */
       ArrayList<Integer> results1 = new ArrayList<>();
         for(int i=1;i<100;i++)
         {
             for(int j=1;j<100;j++)
             {
                 BigInteger x = BigInteger.valueOf(i).pow(j);
                 String y = x.toString();
                 char arr[] = y.toCharArray();
                 int [] num = new int[arr.length];
                 
                 int sum =0;
                 for(int k=0;k<arr.length;k++)
                 {
                     num[k]=Integer.parseInt(String.valueOf(arr[k]));
                     sum = sum + num[k];
                    
                 }
                 results1.add(sum);
                 
                 
             }
         }
         
         Collections.sort(results1);
         System.out.println(results1.get(results1.size()-1));
          
       
   }
   
   public void selfpowers()
   {
       /*
       The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.
       Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
       */
       
       BigInteger a = BigInteger.valueOf(0);
       for(int i=1;i<1001;i++)
       {
           a=a.add(BigInteger.valueOf(i).pow(i));
       }
       
       //System.out.println(a);
       String r = a.toString();
       System.out.println(r.substring(r.length()-10, r.length()));
       
   }
   
   public void Large_non_Mersenne_prime()
   {
       /*
       The first known prime found to exceed one million digits was discovered in 1999, and is a Mersenne prime of the form 26972593−1; it contains exactly 2,098,960 digits. Subsequently other Mersenne primes, of the form 2p−1, have been found which contain more digits.
       However, in 2004 there was found a massive non-Mersenne prime which contains 2,357,207 digits: 28433×2^7830457+1.
       Find the last ten digits of this prime number.
       */
       
       BigInteger b = BigInteger.valueOf(28433).multiply(BigInteger.valueOf(2).pow(7830457)).add(BigInteger.valueOf(1));
       String x = b.toString();
       System.out.println(x.substring(x.length()-10,x.length()));
   }
   
   public void large_sum()
   {
       /*
       Work out the first ten digits of the sum of the following one-hundred 50-digit numbers
       */
       
       String s = "37107287533902102798797998220837590246510135740250\n" +
"46376937677490009712648124896970078050417018260538\n" +
"74324986199524741059474233309513058123726617309629\n" +
"91942213363574161572522430563301811072406154908250\n" +
"23067588207539346171171980310421047513778063246676\n" +
"89261670696623633820136378418383684178734361726757\n" +
"28112879812849979408065481931592621691275889832738\n" +
"44274228917432520321923589422876796487670272189318\n" +
"47451445736001306439091167216856844588711603153276\n" +
"70386486105843025439939619828917593665686757934951\n" +
"62176457141856560629502157223196586755079324193331\n" +
"64906352462741904929101432445813822663347944758178\n" +
"92575867718337217661963751590579239728245598838407\n" +
"58203565325359399008402633568948830189458628227828\n" +
"80181199384826282014278194139940567587151170094390\n" +
"35398664372827112653829987240784473053190104293586\n" +
"86515506006295864861532075273371959191420517255829\n" +
"71693888707715466499115593487603532921714970056938\n" +
"54370070576826684624621495650076471787294438377604\n" +
"53282654108756828443191190634694037855217779295145\n" +
"36123272525000296071075082563815656710885258350721\n" +
"45876576172410976447339110607218265236877223636045\n" +
"17423706905851860660448207621209813287860733969412\n" +
"81142660418086830619328460811191061556940512689692\n" +
"51934325451728388641918047049293215058642563049483\n" +
"62467221648435076201727918039944693004732956340691\n" +
"15732444386908125794514089057706229429197107928209\n" +
"55037687525678773091862540744969844508330393682126\n" +
"18336384825330154686196124348767681297534375946515\n" +
"80386287592878490201521685554828717201219257766954\n" +
"78182833757993103614740356856449095527097864797581\n" +
"16726320100436897842553539920931837441497806860984\n" +
"48403098129077791799088218795327364475675590848030\n" +
"87086987551392711854517078544161852424320693150332\n" +
"59959406895756536782107074926966537676326235447210\n" +
"69793950679652694742597709739166693763042633987085\n" +
"41052684708299085211399427365734116182760315001271\n" +
"65378607361501080857009149939512557028198746004375\n" +
"35829035317434717326932123578154982629742552737307\n" +
"94953759765105305946966067683156574377167401875275\n" +
"88902802571733229619176668713819931811048770190271\n" +
"25267680276078003013678680992525463401061632866526\n" +
"36270218540497705585629946580636237993140746255962\n" +
"24074486908231174977792365466257246923322810917141\n" +
"91430288197103288597806669760892938638285025333403\n" +
"34413065578016127815921815005561868836468420090470\n" +
"23053081172816430487623791969842487255036638784583\n" +
"11487696932154902810424020138335124462181441773470\n" +
"63783299490636259666498587618221225225512486764533\n" +
"67720186971698544312419572409913959008952310058822\n" +
"95548255300263520781532296796249481641953868218774\n" +
"76085327132285723110424803456124867697064507995236\n" +
"37774242535411291684276865538926205024910326572967\n" +
"23701913275725675285653248258265463092207058596522\n" +
"29798860272258331913126375147341994889534765745501\n" +
"18495701454879288984856827726077713721403798879715\n" +
"38298203783031473527721580348144513491373226651381\n" +
"34829543829199918180278916522431027392251122869539\n" +
"40957953066405232632538044100059654939159879593635\n" +
"29746152185502371307642255121183693803580388584903\n" +
"41698116222072977186158236678424689157993532961922\n" +
"62467957194401269043877107275048102390895523597457\n" +
"23189706772547915061505504953922979530901129967519\n" +
"86188088225875314529584099251203829009407770775672\n" +
"11306739708304724483816533873502340845647058077308\n" +
"82959174767140363198008187129011875491310547126581\n" +
"97623331044818386269515456334926366572897563400500\n" +
"42846280183517070527831839425882145521227251250327\n" +
"55121603546981200581762165212827652751691296897789\n" +
"32238195734329339946437501907836945765883352399886\n" +
"75506164965184775180738168837861091527357929701337\n" +
"62177842752192623401942399639168044983993173312731\n" +
"32924185707147349566916674687634660915035914677504\n" +
"99518671430235219628894890102423325116913619626622\n" +
"73267460800591547471830798392868535206946944540724\n" +
"76841822524674417161514036427982273348055556214818\n" +
"97142617910342598647204516893989422179826088076852\n" +
"87783646182799346313767754307809363333018982642090\n" +
"10848802521674670883215120185883543223812876952786\n" +
"71329612474782464538636993009049310363619763878039\n" +
"62184073572399794223406235393808339651327408011116\n" +
"66627891981488087797941876876144230030984490851411\n" +
"60661826293682836764744779239180335110989069790714\n" +
"85786944089552990653640447425576083659976645795096\n" +
"66024396409905389607120198219976047599490197230297\n" +
"64913982680032973156037120041377903785566085089252\n" +
"16730939319872750275468906903707539413042652315011\n" +
"94809377245048795150954100921645863754710598436791\n" +
"78639167021187492431995700641917969777599028300699\n" +
"15368713711936614952811305876380278410754449733078\n" +
"40789923115535562561142322423255033685442488917353\n" +
"44889911501440648020369068063960672322193204149535\n" +
"41503128880339536053299340368006977710650566631954\n" +
"81234880673210146739058568557934581403627822703280\n" +
"82616570773948327592232845941706525094512325230608\n" +
"22918802058777319719839450180888072429661980811197\n" +
"77158542502016545090413245809786882778948721859617\n" +
"72107838435069186155435662884062257473692284509516\n" +
"20849603980134001723930671666823555245252804609722\n" +
"53503534226472524250874054075591789781264330331690";
       
       
        // System.out.println(s.length());
      // System.out.println(s);
      
       String w =s.replaceAll("\\s", "");//σβήνει ολα τα κενα..new String with all whitespace characters removed
      // System.out.println(w.length());
     
     //  StringBuilder sb = new StringBuilder(w.substring(0,3));
       
       
       BigInteger d = new BigInteger("0");
       
       
           int k =0;     
          do
          {    
           d = d.add(new BigInteger(w.substring(k,k+50)));//αθροιζει τη τιμη στο μπιγκ τη τιμη του στρινγκ απο εκει ως εκει..
         //  System.out.println(d);
           k=k+50;
          }while(k<5000);
          
          System.out.println(d);
          String r = d.toString();
          System.out.println(r.substring(0, 10));
           
     }
   
 }
