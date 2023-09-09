package javaapplication12;
import java.util.*;
public class JavaApplication12 {

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in) ;
        System.out.println("Please enter a number: ");
        int num = input.nextInt();
        int count = 1;
        int reverse = 0;
        int lastdigit;
        int remainder = 0;
        int original = num;
        while(original!=0){
            lastdigit = original%10;
            reverse = reverse*10 + lastdigit ;
            original /= 10;
        }
        System.out.println("Reverse is: " + reverse);
        if (reverse == num){
            System.out.println("This number is a palindrome");
        }
        else{
            System.out.println("This number is not a palindrome");
        }
    }
    
}
