package arrays;

import java.util.Scanner;

public class LefRotate {

    static int[] array = new int[7];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<array.length;i++)
        {
            array[i] = sc.nextInt();
        }

        printArray();
        leftRotate();
    }

    public static void leftRotate()
    {
        for(int n=0;n<3;n++)
        {
            int temp = array[0];

            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = temp;
            printArray();
        }
    }

    public static void printArray()
    {
        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i]+"   ");
        }
        System.out.println();
    }
}
