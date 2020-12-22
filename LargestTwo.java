//28. WAP to find largest and second largest element of an array
import java.util.Scanner;
public class LargestTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        System.out.print("Enter size of array : ");
        n  = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter elements of array : ");
        for(i = 0; i < n; i++)
        {
            ar[i] = sc.nextInt();
        }
        for(i = 0;i < n;i++)
        {
            for(j = 0; j < n-1; j++)
            {
                if(ar[j+1] > ar[j])
                {
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
        System.out.println("Largest : "+ar[0]);
        System.out.println("Second Largest : "+ar[1]);
    }
}
