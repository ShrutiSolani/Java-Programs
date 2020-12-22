//27.  Given an unsorted array, find the majority element (element which occurs for more than N/2 times).

import java.util.Scanner;
public class Mode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.print("Enter number of elements : ");
        n = sc.nextInt();
        int ar[] = new int[n];
        for(i = 0;i < n;i++)
        {
            System.out.print("Enter element : ");
            ar[i] = sc.nextInt();
        }
        System.out.print("Mode : "+mode(ar,n));
    }
    static int mode(int a[],int n) {
        int maxValue = 0, maxCount = 0, i, j;
        for (i = 0; i < n; ++i)
        {
            int count = 0;
            for (j = 0; j < n; ++j)
            {
                if (a[j] == a[i])
                    ++count;
            }
            if (count > maxCount)
            {
                maxCount = count;
                maxValue = a[i];
            }
        }
        return maxValue;
    }
}
