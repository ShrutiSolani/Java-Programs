//WAP to find roots of a Quadratic equation. Take care of imaginary values.
//No solution, if a, b are zero.
//There is only one root if b2-4ac=0
//There are no real roots, if b2-4ac is negative
//Otherwise there are two roots
import java.util.*;
public class QuadraticRoots {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        double r1,r2,d;
        System.out.println("Enter a : ");
        a = sc.nextInt();
        System.out.println("Enter b : ");
        b = sc.nextInt();
        System.out.println("Enter c : ");
        c = sc.nextInt();
        if(a == 0 && b == 0)
            System.out.println("No solution.");
        else {
            d = ((b * b) - (4 * a * c));
            System.out.println(d);
            if (d == 0){
                r1 = -b /(double) (2 * a);
            System.out.println("Only one root : " + r1);}
            else if (d > 0) {
                d = Math.sqrt(d);
                r1 = (-b + d) / (2 * a);
                r2 = (-b - d) / (2 * a);
                System.out.println("Root one : " + r1);
                System.out.println("Root two : " + r2);
            } else {
                System.out.println("No real roots.");
            }

        }
    }
}
