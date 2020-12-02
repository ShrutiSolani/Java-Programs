//sum of list of integers.
// End of data signalled by -999
//This value is not used in sum
import java.util.Scanner;
public class SumOfList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        System.out.println("Enter sequence if digits : ");
        n = sc.nextInt();
        sum += n;
        while(n != -999)
        {
            n = sc.nextInt();
            sum += n;
        }
        sum = sum + 999;
        System.out.println("Sum of list of numbers is  : "+sum);
    }
}
