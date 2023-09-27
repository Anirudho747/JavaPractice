package arrays;

import java.util.Scanner;

public class CharacterFrequency {

    static int[] array = new int[7];
    static int[] arrayCount = new int[7];

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<array.length;i++)
        {
            array[i] = sc.nextInt();
        }
        findFrequency();
        showFrequency();
    }
    public static void findFrequency()
    {
        int cnt=0;
        for(int i=0;i<array.length;i++)
        {   cnt=1;
                for(int j=i+1;j<array.length;j++)
                {
                      if(array[i]==array[j])
                    {
                      cnt++;
                      array[j] = -2345678;
                    }
                }
             arrayCount[i] = cnt;
        }
    }

    public static void showFrequency()
    {
        for(int i=0;i<array.length;i++)
        {
            if(array[i]!=-2345678)
            {
                System.out.println(array[i]+"   "+arrayCount[i]);
            }
        }
    }
}
