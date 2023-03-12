package strings;

import java.io.StringBufferInputStream;
import java.util.Arrays;
import java.util.Locale;

public class StringProbs {

    public static void anagram(String string1, String string2)
    {
        int breaker=0;
        if(string1.length()!=string2.length())
        {
            System.out.println("Not an anagram");
        }
        else
        {
            string1 = string1.toLowerCase();
            string2 = string2.toLowerCase();

            char[] str1 = string1.toCharArray();
            char[] str2 = string2.toCharArray();

            Arrays.sort(str1);
            Arrays.sort(str2);

            for(int i =0;i<str1.length;i++)
            {
                if(str1[i]!=str2[i])
                {
                    breaker++;
                    break;
                }
            }
            if(breaker>0)
            {
                System.out.println("Not an Anagram");
            }
            else
            {
                System.out.println("Its an Anagram");
            }
        }

    }

    public static void equalParts(String string1,int n)
    {
        int cntr=0;
        if((string1.length()%n)!=0)
        {
            System.out.println("Can't divide in equal parts");
        }
        else
        {
            for(int i=0;i<string1.length();i++)
            {
                cntr++;
                System.out.print(string1.charAt(i)+"");
                if(cntr%n==0)
                {
                    System.out.println();
                }
            }
        }
    }

    public static void changeCase(String str1)
    {
        StringBuffer replace = new StringBuffer(str1);
        for (int i=0;i<str1.length();i++)
        {
            if (Character.isLowerCase(str1.charAt(i)) )
            {
              replace.setCharAt(i,Character.toUpperCase(str1.charAt(i)));
            }
            else if (Character.isUpperCase(str1.charAt(i)) )
            {
                replace.setCharAt(i,Character.toLowerCase(str1.charAt(i)));
            }
        }

            System.out.println(replace);

    }

    public static void pllndrm(String str1)
    {
        str1 = str1.toLowerCase();
        int cntr = 0;

        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)!=str1.charAt(str1.length()-1-i))
            {
                cntr++;
                break;
            }
        }
            if(cntr>0)
            {
                System.out.println("Not a Pallindrome");
            }
            else
            {
                System.out.println("Its a pallindrome");
            }
    }

    public static void pllndrm2(String str1)
    {
        String str2="";
//        StringBuffer str3 = new StringBuffer(str1);
//        str3.reverse();
        for(int i=str1.length()-1;i>=0;i--)
        {
            str2=str2+str1.charAt(i);
        }

        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println("Its a Pallindrome");
        }
        else
        {
            System.out.println("Not a Pallindrome");
        }
    }

    public static void charFrqncy(String str1)
    {
        char[] char1 = str1.toCharArray();
        int[] count = new int[char1.length];

        for(int i=0;i<char1.length;i++)
        {
            count[i]=1;
            for(int j=i+1;j<char1.length;j++)
            {
                if(char1[i]==char1[j])
                {
                    count[i]++;
                    char1[j]='0';
                }
            }
        }

        for(int i=0;i<char1.length;i++)
        {
            if(char1[i]!='0')
            {
                System.out.println(char1[i]+"--"+count[i]);
            }
        }

    }

    public static void wordFrqncy(String str1)
    {
        str1 = str1.toLowerCase();
        String[] words = str1.split(" ");
        int[] count = new int[words.length];


        for(int i=0;i<words.length;i++)
        {
            count[i]=1;
            for(int j=i+1;j<words.length;j++)
            {
                if(words[i].equalsIgnoreCase(words[j]))
                {
                    count[i]++;
                    words[j]="0";
                }
            }
        }

        for(int i=0;i<words.length;i++)
        {
            if(words[i]!="0")
            {
                System.out.println(words[i]+"-"+count[i]);
            }
        }
    }

    public static void largestWordInString(String str1)
    {
        String[] words = str1.split(" ");
        int[] count  = new int[words.length];

        for(int i=0;i<words.length;i++)
        {
            count[i] = words[i].length();
        }

        for(int i=0;i<words.length;i++)
        {
            count[i] = words[i].length();
        }

        Arrays.sort(count);

        System.out.println("Length of smallest word is "+count[0]);
        System.out.println("Length of largest word is "+count[words.length-1]);

    }

    public static void swapWithoutThirdVariable(String str1,String str2)
    {
        str1 = str1+str2;
        System.out.println(str1);

        str2 = str1.substring(0, str1.length()-str2.length());

   //     System.out.println(str2);

        str1 = str1.substring(str2.length());

  //      System.out.println(str1);

        System.out.println(str1+str2);
    }

    public static void reverseStringWordByWord(String str1)
    {
       String[] strarray = str1.split(" ");

      for(int j=strarray.length-1;j>=0;j--)
      {
          for(int i=strarray[j].length()-1;i>=0;i--)
          {
              System.out.print(strarray[j].charAt(i));
          }
          System.out.print(" ");
      }

    }

    public static void main(String[] args)
    {
//        anagram("Kolkata","atakokl");
//        equalParts("Customers123",3);
//        changeCase("Today is Last day Of The Year");
//        pllndrm("CDMadamdc");
//        pllndrm2("BAMadamab");
//        charFrqncy("The quick brown fox jumped over the lazy cat");
//        wordFrqncy("Big black bug bit a big black dog on his big black nose");
//        largestWordInString("largestMetro is not delhi");
//        swapWithoutThirdVariable("2023","Awesome");
          reverseStringWordByWord("Ulta karke dikhao");
    }

}
