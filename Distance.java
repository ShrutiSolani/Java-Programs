//25. WAP in JAVA to compute the distance S fallen by an object in free-fall. The formula is
//S=So+Vo*t+1/2*a*t*t
//make a table of S for t=0,5,10.............100

import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s0,v0,a,t;
        double s;
        System.out.print("Enter s0 : ");
        s0 = sc.nextInt();
        System.out.print("Enter v0 : ");
        v0 = sc.nextInt();
        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.println("t\ts");
        for(t = 0; t <= 100; t = t+5)
        {
            s = s0 + (v0*t) + (0.5*a*t*t) ;
            System.out.println(t + "\t" + s);
        }
    }
}
