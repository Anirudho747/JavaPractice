package makeSeleniumEasy;

import java.util.Scanner;

public class Sort {

    static int[] arry =new int[7];

    public static void acceptValues()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Values for array");

        for(int i=0;i<7;i++)
        {
            arry[i] = sc.nextInt();
        }

        sc.close();
    }

    public static void displayValues()
    {
        System.out.println("**************************");
        for(int i=0;i<7;i++)
        {
            System.out.println(arry[i]);
        }
        System.out.println("**************************");
    }

    public static void sortArray()
    {
        int temp = Integer.MIN_VALUE;

        for (int i = 0; i < 7; i++)
        {
            for (int j = i + 1; j < 7; j++)
            {
                if(arry[i]>arry[j])
                {
                    temp = arry[i];
                    arry[i] = arry[j];
                    arry[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        acceptValues();
        displayValues();
        sortArray();
        displayValues();
    }

}
