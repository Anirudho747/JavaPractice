package makeSeleniumEasy;

import java.util.Scanner;

public class ExtractNumbers {

    static String str ="",str2;

    public static void inputString()
    {
        System.out.println("Enter a string with few numbers");
        Scanner sc = new Scanner (System.in);
        str = sc.nextLine();
    }

    public static void extractNumbers()
    {
        for(int i=0;i<str.length();i++)
        {
           if(Character.isDigit(str.charAt(i)))
           {
              System.out.println(str.charAt(i));
     //         str.replace(Character.toString(str.charAt(i)),"0");

              str.replaceAll(Character.toString(str.charAt(i)),"abc");
           }
        }
        System.out.println(str);
    }

    public static void main (String[] args)
    {
        inputString();
        extractNumbers();
    }

}
