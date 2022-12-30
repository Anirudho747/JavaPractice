package romanNumerals;

import java.util.Scanner;

public class Solution {

    public static int romanToInt(String s)
    {
        int length = s.length();
        int sum = 0;

        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)=='i')||(s.charAt(i)=='I'))
            {
                if(i==length-1) {
                    sum++;
                    break;
                }

                else if ((s.charAt(i + 1) == 'v') || (s.charAt(i + 1) == 'V')) {
                    sum = sum + 4;
                    i++;
                    break;
                } else if ((s.charAt(i + 1) == 'x') || (s.charAt(i + 1) == 'X')) {
                    sum = sum + 9;
                    i++;
                } else
                    sum++;
            }

            else if((s.charAt(i)=='v')||(s.charAt(i)=='V'))
            {
                sum=sum+5;
            }

            else if((s.charAt(i)=='x')||(s.charAt(i)=='X'))
            {
                if(i==length-1) {
                    sum=sum+10;
                    break;
                }
                else if ((s.charAt(i + 1) == 'l') || (s.charAt(i + 1) == 'L')) {
                    sum = sum + 40;
                    i++;
                    break;
                } else if ((s.charAt(i + 1) == 'c') || (s.charAt(i + 1) == 'C')) {
                    sum = sum + 90;
                    i++;
                } else
                    sum=sum+10;
            }

            else if((s.charAt(i)=='l')||(s.charAt(i)=='L'))
            {
                sum=sum+50;
            }

            else if((s.charAt(i)=='d')||(s.charAt(i)=='D'))
            {
                sum=sum+500;
            }

            else if((s.charAt(i)=='m')||(s.charAt(i)=='M'))
            {
                sum=sum+1000;
            }

            else if((s.charAt(i)=='c')||(s.charAt(i)=='C'))
            {
                if(i==length-1) {
                    sum=sum+100;
                    break;
                }
                else if ((s.charAt(i + 1) == 'd') || (s.charAt(i + 1) == 'D')) {
                    sum = sum + 400;
                    i++;
                    break;
                } else if ((s.charAt(i + 1) == 'm') || (s.charAt(i + 1) == 'M')) {
                    sum = sum + 900;
                    i++;
                } else
                    sum=sum+100;
            }

            }

        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i   = sc.nextInt();
        System.out.println(romanToInt("MCDLXXVI"));
    }
}
