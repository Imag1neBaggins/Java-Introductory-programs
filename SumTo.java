package javaapplication42;
import java.util.*;
public class JavaApplication42 {

    public static void main(String[] args) {
        System.out.println(sumTo(3));
    }
    
    public static double sumTo(int n){
        if (n<=1) return 1;
        return (1.0/n) + sumTo(n-1);
    }
}
