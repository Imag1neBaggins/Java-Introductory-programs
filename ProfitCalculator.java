package labtask6;
import java.io.*;
import java.util.*;
public class LabTask6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount: ");
        Double amount = in.nextDouble();
        System.out.println("Enter number of years: ");
        int y = in.nextInt();
        System.out.println("Enter rate: ");
        Double rate = in.nextDouble();
        System.out.println( profit(amount, y, rate) - amount);
    }
    
    public static double profit(double n, int y, double rate){
        if (y == 0) return n;
        for (int i = 0; i < y; i++) {
            n *= rate;
        }
        return n;
    }
    
}
