//29. WAP to check whether the entered 4 digit number is vampire or not. Combination of digits
//    from this number forms 2 digit number. When they are multiplied by each other we get the
//    original number. (1260=21*60)

import java.util.Scanner;
public class VampireNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,j;
        System.out.print("Enter a 4-digit number : ");
        n = sc.nextInt();
        int copy = n;
        int a[] = new int[4];
        int i = 0;
        while(n != 0)
        {
            a[i] = n % 10;
            n = n/10;
            i++;
        }
        int num[] = new int[12];
        for(i = 0;i < n;i++)
        {
            for(j = 0;j < n;j++)
            {
                if(i != j)
                {
                    //num[].append(a[i]*10 + a[j]);
                }
            }
        }
        /*
        int n1 = a[0]*10 + a[1];
        int n2 = a[0]*10 + a[2];
        int n3 = a[0]*10 + a[3];
        int n4 = a[1]*10 + a[0];
        int n5 = a[1]*10 + a[2];
        int n6 = a[1]*10 + a[3];
        int n7 = a[2]*10 + a[0];
        int n8 = a[2]*
        */

    }
}
