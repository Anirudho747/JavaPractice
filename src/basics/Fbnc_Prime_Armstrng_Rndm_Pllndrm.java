package basics;

import java.util.Random;

public class Fbnc_Prime_Armstrng_Rndm_Pllndrm {

    public static void fbnc(int count)
    {
        System.out.println("**************** Fibonacci Series **********");
        int a=1;
        int b=1;

        int count1 = count;
        int arr[] = new int[count];

        arr[0]=1;
        System.out.println(arr[0]);
        arr[1]=1;
        System.out.println(arr[1]);


        for(int i =2;i<count;i++)
        {
            arr[i] = arr[i-1] + arr[i-2];
            System.out.println(arr[i]);
        }
    }

    public static void prime(int limit)
    {
        System.out.println("**************** Prime Number Series **************");

        int number = 2;

        while (number<limit)
        {
            if((number%2!=0) && (number%3!=0) && (number%5!=0))
            {
                System.out.println( number+" is a prime number");
            }
            number++;
        }
    }

    public static void armstrong(int number)
    {
        System.out.println("**************** Is Number Armstrong? **************");

        int digit = 0,sum=0;

        while(number>0)
        {
            digit = number%10;
            number = number/10;
            sum += Math.pow(digit, 3);
            System.out.println(sum);
        }

        System.out.println("**************** "+sum+" **************");
        //System.out.println("**************** "+ +"**************");

    }

    public static void random()
    {
        System.out.println("**************** Generate Random Number **************");
        Random random = new Random();

        // Generates random integers 0 to 999
        System.out.println(random.nextInt(1000));
// Generates Random doubles values
        double a = random.nextDouble();
        double b = random.nextDouble();
// Prints random double values
        System.out.println("Randomly Generated Double Values");
        System.out.println(a);
        System.out.println(b);
// Generates Random float values
        float f=random.nextFloat();
        float i=random.nextFloat();
// Prints random float values
        System.out.println("Randomly Generated Float Values");
        System.out.println(f);
        System.out.println(i);
// Generates Random Long values
        long p = random.nextLong();
        long q = random.nextLong();
// Prints random long values
        System.out.println("Randomly Generated Long Values");
        System.out.println(p);
        System.out.println(q);
// Generates Random boolean values
        boolean m=random.nextBoolean();
        boolean n=random.nextBoolean();
// Prints random boolean values
        System.out.println("Randomly Generated Boolean Values");
        System.out.println(m);
        System.out.println(n);
    }

    public static void pallindrome(String txt)
    {
        System.out.println("**************** Pallindrome String **************");
        String revTxt="";

        for(int i=txt.length()-1;i>=0;i--)
        {
            revTxt=revTxt+txt.charAt(i);
        }

        if(txt.equalsIgnoreCase(revTxt))
        {
            System.out.println("Pallinndrome");
        }
        else
        {
            System.out.println("Not Pallinndrome");
        }

    }

    public static void numberPallindrome(int number)
    {
        System.out.println("**************** Pallindrome Number **************");
        int revNumber = 0;
        int mod=0;

        while(number>0)
        {
                mod = number % 10;
                revNumber = (revNumber*10) + mod;
                number = number / 10;
        }

        System.out.println(revNumber);

    }

    public static void main(String [] args)
    {

        //fbnc(10);
        //prime(100);
        //armstrong(371);
        //random();
        //pallindrome("MadamAdam");
        numberPallindrome(1111);
    }
}
