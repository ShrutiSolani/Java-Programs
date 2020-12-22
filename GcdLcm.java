//15. WAP in JAVA to find GCD and LCM of two non-negative numbers using EUCLID's
//Algorithm

import java.util.Scanner;

import static java.lang.System.exit;

public class GcdLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,x,y;
        System.out.println("Enter two non-negative numbers : ");
        a = sc.nextInt();
        if(a < 0)
        {
            System.out.println("number should be non-negative!");
            exit(0);
        }
        b = sc.nextInt();
        if(b < 0)
        {
            System.out.println("number should be non-negative!");
            exit(0);
        }
        x = gcd(a,b);
        System.out.println("GCD is : "+x);
        y = (a * b)/x;
        System.out.println("LCM is : "+y);
    }
    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        else if(b == 0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
}
