package makeSeleniumEasy;

import java.util.Scanner;

public class Swapper {

    static int a,b;
    static String c,d;

    public static void acceptNumbers()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first Number");
        a = sc.nextInt();
        System.out.println("Enter second Number");
        b = sc.nextInt();
    }

    public static void acceptStrings()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first String");
        c = sc.nextLine();
        System.out.println("Enter second String");
        d = sc.nextLine();
    }

    public static void numberSwapper()
    {
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("First Number is "+a);
        System.out.println("Second Number is "+b);
    }

    public static void stringSwapper()
    {
        c = c.concat(d);
        d = c.substring(0,c.length()-d.length());
        c = c.substring(d.length());

        System.out.println("First String is "+c);
        System.out.println("Second String is "+d);
    }

    public static void main(String[] args)
    {
        acceptStrings();
        stringSwapper();

        acceptNumbers();
        numberSwapper();
    }
}
