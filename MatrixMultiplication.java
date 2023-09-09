package matrixmultiplication;
import java.util.*;
public class MatrixMultiplication {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter row for first matrix's row and column: ");
        int r1 = in.nextInt();
        int c1 = in.nextInt();
        int [][] m1 = arrayCreate(r1,c1);
        
        System.out.println("Enter row for second matrix's row and column: ");
        int r2 = in.nextInt();
        int c2 = in.nextInt();
        int [][] m2 = arrayCreate(r2,c2);
        
        display(m1);
        display(m2);
        
        int [][] m3 = new int [r1][c2];
        if (c1 != r2){
            System.out.println("These matrices can not be multiplied");
        }
        else{
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k<c1; k++){
                        m3[i][j] += m1[i][k] * m2[k][j];
                    }
                }
            }
            display(m3);
        }
    }
    
    public static int[][] arrayCreate(int r, int c){
        Scanner in = new Scanner(System.in);
        int [][] arr = new int[r][c];
        int count = 1;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Please enter matrix number " + count);
                arr[i][j] = in.nextInt();
                count++;
            }
        }
        System.out.println("");
        return arr;
    }
    
    public static void display(int[][] arr){
        System.out.println("- - - - - - - - ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("| " + arr[i][j]);
            }
            System.out.println("");
        }
        System.out.println("- - - - - - - - ");
        System.out.println("");
    }
    
}
