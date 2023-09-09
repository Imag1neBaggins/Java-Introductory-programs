
package binarycoins;
import java.util.*;

public class BinaryCoins {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 511: ");
        boolean cont = true;
        int i = 0;
        do{
            try {
                i = in.nextInt();
                if (i >= 0 && i<=511){
                    cont = false;
                }
                else{
                    System.out.println("You have not entered a valid number, try again");
                }
            }
            catch(InputMismatchException e) {
                System.out.println("You have not entered a valid number, try again");
                in.nextLine();
            }
        }while(cont);
        print(conversion(i));
    }
    
    public static String[][] conversion(int i){
        String [][] matrix = new String[3][3];
        int count = 0, j = i, fill = 9;
        while (fill > 0){
            if (j%2 == 1){
                matrix[count/3][count%3] = "T";
                j /= 2;
                count++;
                fill--;
            }
            else{
                matrix[count/3][count%3] = "H";
                j /= 2;
                count++;
                fill--;
            }
        }
        return matrix;
    }
    
    public static void print(String[][] array){                //printing method
        for (int row = array.length - 1; row >= 0 ; row--) {
            for (int column = array[row].length - 1; column >=0 ; column--) {
                System.out.print(array[row][column] + " ");
        }
            System.out.println();
        }
    }
    
    
    
}
