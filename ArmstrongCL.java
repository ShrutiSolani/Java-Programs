//11. WAP to accept a number from command line and check whether it is Armstrong or not

public class ArmstrongCL {
    public static void main(String[] args) {
        int n,sum = 0;
        n = Integer.parseInt(args[0]);
        int copy = n;
        while(n != 0){
            int temp = n % 10;
            temp = temp*temp*temp;
            sum += temp;
            n = n/10;
        }
        if(sum == copy)
        {
            System.out.println(copy+" is Armstrong number.");
        }
        else
        {
            System.out.println(copy+" is not Armstrong number.");
        }
    }
}
