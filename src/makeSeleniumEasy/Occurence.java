package makeSeleniumEasy;

import java.util.Scanner;

public class Occurence {

    static String str;
    static int[] str2;
    static char[] strArray;

    public static void acceptString()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        str = sc.nextLine();
    }

    public static void countOccurence()
    {
       str2 = new int[str.length()];
       strArray = str.toCharArray();

        for(int i=0;i<str.length();i++)
        {
            str2[i]++;
            for (int j=i+1;j<str.length();j++)
            {
                if(Character.toString(str.charAt(i)).equalsIgnoreCase(Character.toString(str.charAt(j))))
                {
                    str2[i]++;
                    strArray[j]='^';
                }
            }
        }
    }

    public static void displayOccurence()
    {
        for(int i=0;i<strArray.length;i++)
        {
            if(strArray[i]!='^')
            {
                    System.out.println(strArray[i] + "   " + str2[i]);
            }
        }
    }

    public static void main(String[] args)
    {
        acceptString();
        countOccurence();
        displayOccurence();
    }

}
