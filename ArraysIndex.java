//35. WAP to insert an element into an array at the position specified by the user.
import java.util.Scanner;
import java.util.Arrays;
public class ArraysIndex {
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] new_array = new int[11];
        Scanner sc  = new Scanner(System.in);
        int Index_position;
        int newValue;
        System.out.print("Enter a number to insert : ");
        newValue = sc.nextInt();
        System.out.print("Enter index : ");
        Index_position = sc.nextInt();
        System.out.println("Original Array : "+Arrays.toString(my_array));
        for(int i = 0;i < 11;i++)
        {
            if(i < Index_position)
            {
                new_array[i] = my_array[i];
            }
            else if(i == Index_position)
            {
                new_array[i] = newValue;
            }
            else
            {
                new_array[i] = my_array[i - 1];
            }
        }
        System.out.println("New Array: "+Arrays.toString(new_array));

    }
}
