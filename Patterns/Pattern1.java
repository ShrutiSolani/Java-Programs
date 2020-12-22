//14. WAP pattern.java that takes an integer, N and prints a 2D N*N pattern with alternating
//spaces and asterisks as follows:
//*****
// *****
//*****
// *****
import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        System.out.print("Enter n : ");
        n = sc.nextInt();
        for(i = 0;i < n;i++)
        {
            System.out.println();
            if(i % 2 == 0)
            {
                for(j = 1;j <= n;j++)
                {
                    System.out.print("*\t\t");
                }
            }
            else
            {
                for(j = 1;j <= n;j++)
                {
                    System.out.print("\t*\t");
                }
            }
        }
    }
}
