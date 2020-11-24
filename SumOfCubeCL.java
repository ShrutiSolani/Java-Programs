//10. WAP to accept a number from command line and print the sum of cube of individual digits

public class SumOfCubeCL {
    public static void main(String[] args) {
        int n,sum = 0;
        n = Integer.parseInt(args[0]);
        while(n != 0){
            int temp = n % 10;
            temp = temp*temp*temp;
            sum += temp;
            n = n/10;
        }
        System.out.println("Sum of cube : "+sum);
    }
}
