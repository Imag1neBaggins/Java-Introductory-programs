package maxrowcolumn;
import java.util.*;
public class MaxRowColumn {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = random4();
        print(arr);
        System.out.println("Max row: " + maxRow(arr) + ", Max column: " + maxColumn(arr));
    }
    
    public static int[][] random4(){
        int[][] arr = new int [4][4];
        for (int j = 0; j < arr.length * arr.length; j++) {
            int i = (int)(Math.random()*100);
            arr[j/4][j%4] = i/50;
        }
        return arr;
    }
    
    public static int maxRow(int[][] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) a++;
            }
            if (a>max) max = i;
        }
        return max + 1;
    }
    
    public static int maxColumn(int[][] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[j][i] == 1) a++;
            }
            if (a>max) max = i;
        }
        return max + 1;
    }
    
    public static void print(int[][] array){                //printing method
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
        }
            System.out.println();
        }
    }
}
