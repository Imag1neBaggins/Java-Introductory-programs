package finallab3;
import java.util.*;
import java.io.*;
public class FinalLab3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        boolean contInput = true;
        do{  //Input and exception handling loop
            try{
                System.out.println("Please enter a number");
                n = in.nextInt(); 
                contInput = false;
            }
            catch(Exception e){
                System.out.println("This number is not valid");
                in.nextLine();  //Clearing buffer
            }
        }while(contInput); 
        System.out.println(fizzbuzz(n));
    }
    
    public static String fizzbuzz(int n){
        if (n <= 1) return "0, 1, ";
        if (n%3 == 0 && n%5 == 0) return fizzbuzz(n-1) + "fizzbuzz, ";
        if (n%3 == 0) return fizzbuzz(n-1) + "fizz, ";
        if (n%5 == 0) return fizzbuzz(n-1) + "buzz, ";
        return fizzbuzz(n-1) + String.valueOf(n) + ", ";
    }
    
}
