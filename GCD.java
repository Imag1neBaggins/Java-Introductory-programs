package gcd;
import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n2 = in.nextInt();
        int num = Math.max(n,n2);
        int num2 = Math.min(n, n2);
        System.out.println(gcd(num, num2));
    }
    
    public static int gcd(int n, int n2){
        if (n2 == 0) return n;
        return gcd(n2, n%n2);
    }
    
}
