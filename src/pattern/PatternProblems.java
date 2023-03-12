package pattern;

public class PatternProblems {

    public static void pattern1(int limit)
    {
        int star = 1;

        for(int j=0;j<limit;j++)
        {
            for (int i = limit; i > 0; i--)
            {
                if (i == star) {
                    System.out.print("*");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
            star++;
        }
    }

    public static void pattern2()
    {

        int lines=4;
        int i,j;
        for(i=1;i<=lines;i++){// this loop is used to print lines
            for(j=1;j<=lines;j++){// this loop is used to print * in a line
                if(i==j)
                    System.out.print("*");
                else
                    System.out.print("0");
            }
            j--;
            System.out.print("*");
            while(j>=1){// this loop is used to print * in a line
                if(i==j)
                    System.out.print("*");
                else
                    System.out.print("0");
                j--;
            }
            System.out.println("");
        }

    }

    public static void pattern3()
    {
        for(int i=1;i<11;i++)
        {
            for(int j=1;j<100;j++)
            {
                while(i>=j)
                {
                    if(j%i==0)
                    {
                        System.out.print(j);
                        i++;
                    }
                }
                System.out.println("");

            }
        }
    }

    public static void main(String[] args)
    {
     //   pattern1(5);
        // pattern2();
        pattern3();
    }
}
