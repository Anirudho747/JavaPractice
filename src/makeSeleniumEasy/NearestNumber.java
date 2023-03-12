package makeSeleniumEasy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NearestNumber {

    public static void getNumbers()
    {
        int[] arr = new int[7];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array Number");

        for (int i=0;i<7;i++)
        {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
    }

    public static void getFinder()
    {
        int nmbr;

        Scanner sc = new Scanner(System.in);
        nmbr = sc.nextInt();
    }

    public static void findClosest()
    {

    }

}
