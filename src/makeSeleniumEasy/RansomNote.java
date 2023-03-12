package makeSeleniumEasy;

import java.util.Scanner;

public class RansomNote {

    static String note="";
    static String quote="";

    public static void acceptRansomNote()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string which needs to be found");
        note = sc.nextLine();
    }

    public static void acceptMagazineQuote()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string which needs to be matched");
        quote = sc.nextLine();
    }

    public static void matchRansom()
    {
        if(quote.contains(note))
        {
            System.out.println("Match found");
        }
        else
        {
            System.out.println("Match not found");
        }
    }

    public static void matchRansomManually()
    {
        int ok=0;

        if(note.length()>quote.length())
        {
            System.out.println("Match not found");
        }
        else
        {
           for(int j=0;j<note.length();j++)
           {
               if(quote.contains(Character.toString(note.charAt(j))))
               {
                   quote.replace(Character.toString(note.charAt(j)),"");
               }
               else
               {
                   ok++;
               }
           }
            if (ok>0)
            {
                System.out.println("not the ransom giver");
            }
            else if(ok==0)
            {
                System.out.println("Kidnapper found");
            }
        }


    }

    public static void main(String[] args)
    {
        acceptRansomNote();
        acceptMagazineQuote();
       //matchRansom();
        matchRansomManually();
    }

}
