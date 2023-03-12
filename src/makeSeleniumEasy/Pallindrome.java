package makeSeleniumEasy;

public class Pallindrome {

    static int n=12321,reverse=0,rem;
    static int newNumber =n;
    static String str =  "AMadamA",revString="";

    public static int reverseInt()
    {
       while(newNumber>0)
       {
           reverse = (reverse * 10) + (newNumber % 10);
          newNumber = newNumber / 10;

       }

       System.out.println(reverse);
       return reverse;
    }

    public static String reverseString()
    {
        int len = str.length();

        for (int i=str.length()-1;i>=0;i--)
        {
            revString += str.charAt(i);
        }

        System.out.println(revString);

        return revString;
    }

    public static void main(String[] args)
    {
        if(reverseInt()!=n)
        {
            System.out.println("not a palindrome");
        }
        else
        {
            System.out.println("A palindrome");
        }


        if((reverseString().equalsIgnoreCase(str)))
        {
            System.out.println("A palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }

    }
}
