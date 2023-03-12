package makeSeleniumEasy;

import java.util.Scanner;

public class ReverseString {

    static String sentence;
    static String[] sentArray;

    public static void acceptString()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter String");
        sentence = sc.nextLine();
    }

    public static void changeToArray()
    {
        sentArray = sentence.split(" ");
    }

    public static void revWord()
    {
        for(int i=sentArray.length-1;i>=0;i--)
        {
            for(int j=sentArray[i].length()-1;j>=0;j--)
            {
                System.out.print(sentArray[i].charAt(j));
            }
            System.out.print(" ");
        }
    }

    public static void main(String[] args)
    {
        acceptString();
        changeToArray();
        revWord();
    }

}
