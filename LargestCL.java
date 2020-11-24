//WAP to find largest of 3 integers accepted form command line
public class LargestCL {
    public static void main(String[] args) {
        int a, b, c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        if(a > b)
        {
            if( a > c){
                System.out.println(a+" is largest.");
            }
            else{
                System.out.println(c+" is largest.");
            }
        }
        else if(a < b){
            if(b > c){
                System.out.println(b+" is largest.");
            }
            else{
                System.out.println(c+" is largest.");
            }
        }
    }
}
