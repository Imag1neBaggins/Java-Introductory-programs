package isbn;

import java.util.*;
public class ISBN {
    public static void main(String[] args) {
    
        Scanner input =  new Scanner(System.in) ; //Asking user to input first 9 digits
        System.out.print(">");
        int x = input.nextInt(); 
        int d2 = x % 10; //Seperating all the digits by taking remainder 
        int d3 = (x%100)/10;
        int d4 = (x%1000)/100;
        int d5 = (x%10000)/1000;
        int d6 = (x%100000)/10000;
        int d7 = (x%1000000)/100000;
        int d8 = (x%10000000)/1000000;
        int d9 = (x%100000000)/10000000;
        int d10 = (x%1000000000)/100000000;
        int d1 = ((d2*2 + d3*3 + d4*4 + d5*5 +d6*6 + d7*7 +d8*8 +d9*9 + d10*10)*10)%11; //Multiplying by ten so that we get all 10 digits and then taking remainder by 11 to know what the last digit must be
        System.out.println("Your checksum digit is: " + d1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
