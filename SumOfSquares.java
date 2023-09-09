package labtask2;
import java.io.*;
import java.util.*;
public class LabTask2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean cont = true;
        while(cont){
            System.out.println("Please enter a number: ");
            System.out.println(sumSquares(in.nextInt()));
            System.out.println("Press 1 if you want to continue, enter any other key if you want to stop: ");
            if (in.nextInt() != 1){
                cont = false;
            }
        }
    }
    
    public static int sumSquares(int i){
        if (i == 1) return 1;
        return i*i + sumSquares(i-1);
    }
    
}
