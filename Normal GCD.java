package itplab4;

import java.util.*;
public class ITPlab4 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in) ;
        System.out.println("Please enter a positive integer: ");
        int a = input.nextInt();
        System.out.println("Please enter a positive integer: ");
        int b = input.nextInt();
        int gcd = 0;
        int count = 2;
        while (count<=a && count<=b){
            if(a%count == 0 && b%count == 0){
                gcd = count;
            }
            count++;
        }
        System.out.println("The greatest common divisor is: " + gcd);
        
        
            
            
            
        
        
        
        
        
        
    }
    
}
