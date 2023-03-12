package makeSeleniumEasy;

import java.util.Scanner;

public class CircularList {

    static String str1;
    static String[] strArray;
    static int strt;

    public static void acceptString()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");

        str1 = sc.nextLine();

        strt = sc.nextInt();

    }

    public static void changeToArray()
    {
        strArray = str1.split(" ");
    }

    public static void makeCircular()
    {
        for (int i=strt;i<strArray.length;i++)
        {
            System.out.print(strArray[i]+" ");
        }

        for(int i=0;i<strt;i++)
        {
            System.out.print(strArray[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        acceptString();
        changeToArray();
        makeCircular();
    }
}
