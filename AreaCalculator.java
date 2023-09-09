package labtask1;
import java.io.*;
import java.util.*;
public class LabTask1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean contInput = true;
        double radius = 0;
        do{  
            try{
                System.out.println("Please enter the radius: ");
                radius = in.nextDouble();
                contInput = false;
            }
            catch(Exception e){
                System.out.println("PLease enter a valid radius:");
                in.nextLine(); 
            }
        }while(contInput); 
        char f = ' ';
        do{  
            try{
                System.out.println("Enter C for circumference, D for Diameter, A for Area: ");
                f = in.next().toUpperCase().charAt(0);
                if (f == 'C' || f == 'D' || f =='A') contInput = true;
            }
            catch(Exception e){
                System.out.println("PLease enter a valid char:");
                in.nextLine(); 
            }
        }while(!contInput); 
        if (f == 'D'){
            System.out.println("The Diameter of a circle with radius " + radius + " is: " + 2 * radius);
        } 
        else if(f == 'C'){
            System.out.println("The Circumference of a circle with radius " + radius + " is: " + 2 * Math.PI * radius);
        } 
        else {
            System.out.println("The Area of a circle with radius " + radius + " is: " + Math.PI * radius * radius);
        }
    }
    
}
