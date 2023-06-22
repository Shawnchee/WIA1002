import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("For x^y,\nenter your x: ");
        int x  = sc.nextInt();
        System.out.print("enter your m: ");
        int m = sc.nextInt();
        System.out.println("exponent("+x+","+m+") ---> will produce an output of "+ exponent(x, m));
    }

    
    public static long exponent(int x, int m) {
        if (m==0){ 
            return 1 ; 
        }

        else if (m==1){
            return x ;
        }

        else {  
            return x*exponent(x, m-1); 
            }
        }

}

