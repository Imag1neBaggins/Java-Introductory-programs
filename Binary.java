package javaapplication13;
import java.util.*;
public class JavaApplication13 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in) ;
        System.out.println("Please enter a number");
        int n = input.nextInt();
        int binary = 0;
        int count = 128;
        for (count = 128;count>=1 ; count/=2){
            if((n/count)>0){
                binary = binary*10 + 1;
                n = n%count;
            }
            else{
                binary = binary*10;
            }
        }
        
        System.out.println(binary);
        
    }
    
}
