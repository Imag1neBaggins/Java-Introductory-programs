package fibonaccirecursion;
import java.util.*;
public class FibonacciRecursion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fib(n));
    }
    
    public static int fib(int n){
        int sum, first, second;
        sum = first = second = 0;
        if (n>2){
            first = fib(n-2);
            second = fib(n-1);
        }
        else if(n == 1){
            return 0;
        }
        else if(n == 2){
            return 1;
        }
        sum = first + second;
        return sum;
    }
}
