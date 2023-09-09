package factorialrecursion;
import java.util.*;
public class Factorialrecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));
    }
    
    public static int factorial(int n){
        int sum;
        if(n>1){
            sum = factorial(n-1) * n; 
        }
        else{
            sum = 1;
        }
        return sum;
    }
    
}
