package basics;

import java.util.Scanner;

public class Input {

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String text = sc.nextLine();

        System.out.println("Enter an Integer");
        int nmbr = sc.nextInt();

        System.out.println("Enter a Double");
        double decimal = sc.nextDouble();

        System.out.println(text);
        System.out.println(nmbr);
        System.out.println(decimal);
    }
}
