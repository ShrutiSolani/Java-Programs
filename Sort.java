//26. WAP to accept 5 integers from user and sort in ascending order
import java.util.*;
public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int i,min,j;
        for(i = 0;i < 5;i++)
        {
            a[i] = sc.nextInt();
        }
        for(i = 0;i < 5;i++)
        {
           for(j = 0; j < 4; j++)
           {
               if(a[j+1] < a[j])
               {
                   int temp = a[j];
                   a[j] = a[j+1];
                   a[j+1] = temp;
               }
           }
        }
        System.out.println("Sorted array is : ");
        for(i = 0;i < 5;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
