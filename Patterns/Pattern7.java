//21. Write a program to generate following pattern
//      0
//     101
//    21012
//   3210123
import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,j,k,l;
        System.out.print("Enter end number : ");
        n = sc.nextInt();
        for(i = 0;i <= n;i++)
        {
            for(j = 0;j < n-i;j++)
            {
                System.out.print(" ");
            }
            for(k = i;k >= 0;k--)
            {
                System.out.print(k);
            }
            for(l = k+2;l <= i;l++)
            {
                System.out.print(l);
            }
            System.out.println("\n");
        }
    }
}
