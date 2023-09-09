package ramanujan2;
import java.util.*;
public class Ramanujan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        System.out.println();
        int number = input.nextInt();
        int a,b,c,d;
        int a3,b3,c3,d3;
        int num1, num2;
        int Rnumbers = 0;
        for (a = 1; a<(int)Math.cbrt(number)+1; a++) { //Initialising a and keeping it lesser than the cube root of the number input
            a3 = a*a*a;
            for (b = a+1; b<(int)Math.cbrt(number)+1; b++) {  //Initialising b with a+1 to make sure no duplication occurs
                b3 = b*b*b;
                for (c = a+1; c<(int)Math.cbrt(number)+1; c++) {
                    c3 = c*c*c;
                    for (d = c; d<(int)Math.cbrt(number)+1; d++) {
                        d3 = d*d*d;
                        num1 = a3 + b3;
                        num2 = c3 + d3;
                        if (a3 != b3 && a3 != c3 && a3 != b3 && b3 != c3 && b3 != d3 && c3 != d3) {  //Checking to make sure we don't get faulty numbers where both sides have the same numbers
                            if (num1 == num2 && num1 == number) {
                            System.out.println("Your number is a Ramanujan's number");
                            System.out.println(num1 + "= " + a3 + "+" + b3 + " = " + c3 + "+" +d3);
                            System.out.println();
                            Rnumbers++;
                         }   else if (num1 == num2 && num1<number) {
                            System.out.println(num1 + " is a Ramanujan's number!");
                            System.out.println(num1 + "= " + a3 + "+" + b3 + " = " + c3 + "+" +d3);
                            System.out.println();
                            Rnumbers++;
                            }
                        }
                    }
                }
            }
        }
                if (Rnumbers == 0) {   //Checking if any number was found
            System.out.println();
            System.out.println("No Ramanujan's numbers exist between 0 and your number");
        }
                System.out.println("The total taxicab numbers that exist in between 0 and the number you entered is: " + Rnumbers);
    }
    
}
