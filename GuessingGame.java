package labtask7;
import java.io.*;
import java.util.*;
public class LabTask7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = (int)(Math.random() * 101);
        boolean correct = false;
        while(!correct){
            System.out.println("enter your guess: ");
            int i = in.nextInt();
            if (i>n) System.out.println("Number is lower");
            if (i<n) System.out.println("Number is higher");
            if (i == n){
                System.out.println("Correct!");
                break;
            }
        }
    }
    
}
