//19. Write a program to display following pattern using nested loops
//       A
//     A B A
//   A B C B A
// A B C D C B A
import java.util.Scanner;
public class Pattern5 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            int alphabet = 65;
            for (int j = n; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++)
            {
                System.out.print((char) (alphabet + k));
            }
            for (int l = i - 1; l >= 0; l--)
            {
                System.out.print((char) (alphabet + l));
            }
            System.out.println();
        }
    }
}
