import java.util.Scanner;
public class SumOfList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        System.out.println("Enter sequence if digits : ");
        while(true){
            try{
                sum +=sc.nextInt();
        }
        catch(Exception e){
            break;
            }
	    }
	        System.out.println("Sum of the list of numbers is  : "+sum);

    }
}
