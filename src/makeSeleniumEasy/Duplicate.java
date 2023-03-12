package makeSeleniumEasy;

import java.util.Scanner;

public class Duplicate {

    static int[][] intArray = new int[3][3];

    public static void acceptString()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                intArray[i][j] = sc.nextInt();
            }
        }
    }

    public static void reverse()
    {
        int num = 123456,rem=0,mod=0;

        while(num>0)
        {
            mod = num % 10;
            rem = (rem*10) + mod;
            num =  num/10;
        }
        System.out.print(rem);
    }

    public static void primeUpto100()
    {
        int flag = 0;
        for(int i=2;i<101;i++)
        {
            flag = 0;
            for (int j = 2;j< (101/2);j++)
            {
                if ((i%j==0)&&(i!=j))
                {
                    flag=1;
                    break;
                }
            }
            if (flag==0)
            {
                System.out.println(i+" is a prime number");
            }
        }
    }

    public static void main(String[] args)
    {
      //  acceptString();
      //    reverse();
        primeUpto100();
    }

}
