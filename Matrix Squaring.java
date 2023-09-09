package finallab;
import java.util.*;
import java.io.*;
public class FinalLab {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matrix={{1,3,5,7,8},
                        {2,1,4,5,9},
                        {8,6,4,7,3},
                        {8,4,7,4,5},
                        {5,9,5,10,5}};
        boolean contInput = true;
        int n = 0;
        do{  //Input and exception handling loop
            try{
                System.out.println("Please enter number of rows: ");
                n = in.nextInt(); 
                if (n > 0 && n < matrix.length - 1) contInput = false;
                else System.out.println("This number of rows is not valid");
            }
            catch(Exception e){
                System.out.println("This number of rows is not valid");
                in.nextLine();  //Clearing buffer
            }
        }while(contInput); 
        display(matrix);
        System.out.println("");
        display(maxSquare(matrix, n));
    }
    
    public static int[][] maxSquare(int[][] arr, int p){
        int[][] matrix = new int[p][p];
        int max = 0;
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < p; j++) {
                int count = 0;
                while (count < (p * p)){
                    max = (int) (Math.max(arr[i + (count/p)][j + (count%p)], max));
                    count++;
                }
                matrix[i][j] = max;
                max = 0;
            }
        }
        return matrix;
    }
    
    public static void display(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
