//22. Write a program to generate following pattern
//1
//12
//123
//1234
import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        System.out.print("Enter number of lines : ");
        n = sc.nextInt();
        for(i = 1;i <= n;i++)
        {
            for(j = 1;j <= i;j++)
            {
                System.out.print(j);
            }
            System.out.println("\n");
        }
    }
}
