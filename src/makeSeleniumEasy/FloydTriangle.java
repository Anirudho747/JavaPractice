package makeSeleniumEasy;

import java.util.Scanner;

public class FloydTriangle {

    static int lim;

    public static void enterLimit()
    {
        System.out.println("Enter the limit for Triangle");
        Scanner sc = new Scanner(System.in);
        lim = sc.nextInt();
    }

    public static void makeTriangle()
    {
      int k=1;
      for(int i=1;i<=lim;i++)
      {
          for(int j=1;j<=i;j++)
          {
              System.out.print(k+++" ");
          }
              System.out.println();
      }
    }

    public static void main(String[] args)
    {
        enterLimit();
        makeTriangle();
    }
}
