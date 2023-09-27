package arrays;

import java.util.Scanner;

public class Xavier {

    static int size;
    static int a[];

    public static void main(String[] args)
    {
        //printArray();
        //printRevArray();
        //printSumOfArray();
        //printLargestElementInArray();
        //printSmallestElementInArray();
        //duplicate();
        //sortArray();
        //revSortArray();
        //revString();
        camelCase();
    }

    public static int getNumber()
    {
        int n;
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        return n;
    }

    public static int getArraySize()
    {
        System.out.println("Enter Array Size");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void formArray()
    {
        size = getArraySize();
        a = new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter Value for "+(i+1)+" position");
            a[i] = getNumber();
        }
    }

    public static void printArray()
    {
        formArray();
        System.out.println("----Array----");
        for(int i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void printRevArray()
    {
        formArray();
        System.out.println("----Reverse Array----");
        for(int i=size-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }

    public static void printSumOfArray()
    {
        formArray();
        int sum=0;
        System.out.println("----Sum Of Array----");
        for(int i=size-1;i>=0;i--)
        {
            sum=sum+a[i];
        }
        System.out.println(sum);
    }

    public static void printLargestElementInArray()
    {
        formArray();
        int max=a[0];
        int pos=0;
        System.out.println("----Largest Element In Array----");
        for(int i=1;i<=size-1;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
                pos=i;
            }
        }
        System.out.println("Max element in array is "+ max+" at "+(pos+1));
    }

    public static void printSmallestElementInArray()
    {
        formArray();
        int min=a[0];
        int pos=0;
        System.out.println("----Smallest Element In Array----");
        for(int i=1;i<=size-1;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
                pos=i;
            }
        }
        System.out.println("Min element in array is "+ min+" at "+(pos+1));
    }

    public static void sortArray()
    {
        int[] arra = {70,20,10,90,50,60,30};
        int med;

        for(int i=0;i<arra.length-1;i++)
        {
            for(int j=i+1;j<arra.length-1;j++)
            {
                if(arra[i]>arra[j])
                {
                med = arra[i];
                arra[i] = arra[j];
                arra[j] = med;
                }
            }
        }

        for(int i=0;i<arra.length-1;i++)
        {
            System.out.println(arra[i]);
        }
    }

    public static void revSortArray()
    {
        int[] arra = {70,20,10,90,50,60,30};
        int med;

        for(int i=0;i<arra.length-1;i++)
        {
            for(int j=i+1;j<arra.length-1;j++)
            {
                if(arra[i]<arra[j])
                {
                    med = arra[i];
                    arra[i] = arra[j];
                    arra[j] = med;
                }
            }
        }

        for(int i=0;i<arra.length-1;i++)
        {
            System.out.println(arra[i]);
        }
    }

    public static void duplicate()
    {
        int[] arra = {10,20,30,10,50,60,70,10,90,100,10,120,130,30,140,150,160,20,170,180,190,30};
        int cnt=0;

        for(int i=0;i<arra.length-1;i++)
        {
            cnt=1;
            for(int j=i+1;j<arra.length-1;j++)
            {
                if((arra[i]==arra[j]))
                {
                    cnt++;
                    arra[j]=-234567;
                }
            }
            if(arra[i]!=-234567)
            {
                System.out.println(arra[i] + " at " + i + " is mentioned " + cnt + " number of times");
            }
        }
    }

    public static void revString()
    {
        String str = "Reverse me if you can";

        String[] strArray = str.split(" ");

        for(int i=0;i<strArray.length;i++)
        {
            System.out.print(strArray[i]+"    ");
        }

        for(int i=strArray.length-1;i>=0;i--)
        {
            System.out.print(strArray[i]+"    ");
        }
    }

    public static void camelCase()
    {
        String sntnc = "make this as camel case";

        String[] arraySntnc = sntnc.split(" ");

        for(int i=0;i<arraySntnc.length;i++)
        {
            String wrd = arraySntnc[i];
            for(int j=0;j<wrd.length();j++)
            {
                if(j==0)
                {
                    System.out.print(Character.toUpperCase(wrd.charAt(j)));
                }
                else
                {
                    System.out.print((wrd.charAt(j)));
                }
            }
            System.out.print("   ");
        }
    }

}
