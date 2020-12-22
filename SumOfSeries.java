//24. WAP to print the sum of following series
//1+1/2+1/3+......................+1/n
//1-1/2+1/3-1/4+…………...1/n (take value of n from the user)
//1+1/2^2+1/3^2+1/4^2……+1/n^2
//1+1/x+1/x^2+…..+1/x^n

import java.util.Scanner;
import java.lang.Math;
public class SumOfSeries {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        n = sc.nextInt();
        SumOfSeries pat1 = new SumOfSeries();
        pat1.pattern1(n);
        pat1.pattern2(n);
        pat1.pattern3(n);
        System.out.print("Enter value of x : ");
        int x = sc.nextInt();
        pat1.pattern4(n,x);
    }

    void pattern1(int n)
    {
        int i;
        double sum = 0.0;
        for(i = 1;i <=n;i++)
        {
            sum += 1/(double)i;
        }
        System.out.println("1 + 1/2 + 1/3 +..... + 1/n = "+sum);
    }
    void pattern2(int n)
    {
        int i;
        double sum = 0.0;
        for(i = 1;i <= n;i++)
        {
            if(i%2 == 0)
            {
                sum = sum - 1/(double)i;
            }
            else
            {
                sum = sum + 1/(double)i;
            }
        }
        System.out.println("1 - 1/2 + 1/3 - 1/4.....1/n = "+sum);
    }
    void pattern3(int n)
    {
        int i;
        double sum = 0.0;
        for(i = 1;i <= n;i++)
        {
            sum += 1/(double)Math.pow((double)i,2);
        }
        System.out.println("1 + 1/2^2 + 1/3^2 +.... + 1/n^2 = "+sum);
    }
    void pattern4(int n, int x)
    {
        int i;
        double sum = 0.0;
        for(i = 0;i <= n;i++)
        {
            sum += 1/(double)Math.pow((double)x,(double)i);
        }
        System.out.println("1 + 1/x + 1/x^2 + 1/x^3....+ 1/x^n = "+sum);
    }
}
