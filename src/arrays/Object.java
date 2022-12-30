package arrays;

import java.util.Arrays;
import java.util.Collections;

public class Object {

    public static void leftRotate(int a[])
    {

        for (int k=0;k<4;k++)
        {
            int first = a[0];

            for (int i = 0; i < a.length - 1; i++)
            {
                a[i] = a[i + 1];
            }

            a[a.length - 1] = first;
        }

        for (int i=0;i<a.length;i++)
        {
            System.out.println(i+" "+a[i]);
        }
    }

    public static int[] sortByFunction(int a[])
    {
        Arrays.sort(a);
        return a;
    }

    public static void smallest(int a[])
    {
        int min = 99999;

        for(int i=0;i<a.length;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println("Smallest is "+min);
    }

    public static void maximum(int a[])
    {
        int max = -99999;

        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println("Biggest is "+max);
    }

    public static void nSmallest(int a[],int n)
    {
        int temp;

        for (int i = 0; i <a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(i+" : "+a[i]);
        }

        System.out.println("*******************************************");

        System.out.println("The "+n+"th smallest value is "+a[n-1]);

    }

    public static void nGreatest(int a[],int n)
    {
        int temp;

        for (int i = 0; i <a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(i+" : "+a[i]);
        }

        System.out.println("*******************************************");

        System.out.println("The "+n+"th largest value is "+a[n-1]);
    }

    public static void removeDuplicate(int a[])
    {
        int[] twin = new int[a.length];
        int stop=0;

        for(int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                System.out.println("************************************************");
                System.out.println(a[i]);
                System.out.println(a[j]);
                if(a[i]!=a[j])
                {
//                    System.out.println(a[i]);
//                    System.out.println(a[j]);
                    continue;
                }
                else
                {
                    stop++;
                    System.out.println(stop);
                }
            }
            System.out.println("Line # "+139+" "+i+"  "+stop);
            if(stop==0)
                twin[i] = a[i];
                stop=0;
        }

        for(int i=0;i<twin.length;i++)
        {
            System.out.println(i+" : "+twin[i]);
        }
    }

    public static void main (String args[])
    {
       int [] arr = new int[]{100,2000,30,100,100,60,1700};

//        leftRotate(arr);
//        int [] sortedArr = sortByFunction(arr);
//        for (int i=0;i<sortedArr.length;i++)
//        System.out.println(sortedArr[i]);
//        smallest(arr);
//        maximum(arr);
//        nSmallest(arr,3);
//        nGreatest(arr,3);
          removeDuplicate(arr);
    }
}
