package sudoku2;
import java.util.*;
/**
 * Task: Make a sudoku game in which player can insert their answers and rewrite numbers that are not hardcoded.
 * Approach:
 * 1.Declare a 9x9 array and hard code initial values and print it.
 * 
 * 2.Take user input element by element and check whether the input is valid
 *      -Checking validity:
 *      -Checking if the element is in between 1 and 9 and there is none of the same element in the row,
 *       column or 3x3 box
 * 
 * 3.-If user input is valid, insert into array and print:
 *      -then ask if user wants to continue and 
 *          -if yes, give user option to input again,
 *          -if no, then print current array and end.
 *   -If array is full and valid, print array and "You win", then end program
 * 
 * 4.if user input is not valid, give user option to:
 *      -input another element or, quit or
 *      -rewrite an element that user has inserted before and print array
 * 
 * 5.After rewrite:
 *      -If array is full and valid, print array and "You win", then end program,
 *      -take new input from user and repeat form step 3
 * 
 */

public class Sudoku2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //0,0,0,0,0,0,0,0,0
        int [][] board = {{0,0,0,0,0,0,0,0,0},  //4,3,5,2,6,9,7,8,1
                          {0,0,0,0,0,0,0,0,0},  //6,8,2,5,7,1,4,9,3
                          {0,0,0,0,0,0,0,0,0},  //1,9,7,8,3,4,5,6,2
                          {0,0,0,0,0,0,0,0,0},  //8,2,6,1,9,5,3,4,7
                          {0,0,0,0,0,0,0,0,0},  //3,7,4,6,8,2,9,1,5
                          {0,0,0,0,0,0,0,0,0},  //9,5,1,7,4,3,6,2,8
                          {0,0,0,0,0,0,0,0,0},  //5,1,9,3,2,6,8,7,4
                          {0,0,0,0,0,0,0,0,0},  //2,4,8,9,5,7,1,3,6
                          {0,0,0,0,0,0,0,0,0}}; //7,6,3,4,1,8,2,5,9
        
        int [][] game = copy(board); 
        print(game); //creating duplicate array and printing initial grid
        
        int  count;
        count = 0;
        
        while(count < 81){
            if(game[count/9][count%9] == 0){ // using count/9 for rows and count%9 for columns
                System.out.println("Enter a number for (" + (count/9) + ", " + (count%9) + ") : ");
                int num = input.nextInt();
                if( valid(game, num, count/9, count%9)){ //validity check
                    game[count/9][count%9] = num;
                    print(game);
                    count++; // increasing counter after adding element to grid
                }
                else{
                    boolean rewrite = true;
                    while (rewrite){ //loop to take values until one value fits
                        System.out.println("Your number is invalid, press 1 to re-enter, 2 to edit a previous entry: ");
                        int f = input.nextInt();
                        if (f == 1){
                            System.out.println("Enter a number for (" + (count/9) + ", " + (count%9) + ") : ");
                            int n = input.nextInt();
                            if( valid(game, n, count/9, count%9) ){
                                game[count/9][count%9] = n;
                                print(game);
                                count++;
                                rewrite = false; // breaking loop
                            }
                        }
                        else if(f == 2){
                            System.out.println("Enter the row you want to edit: "); // user input for row, column, number
                            int row = input.nextInt();
                            System.out.println("Enter the column you want to edit: ");
                            int col = input.nextInt();
                            System.out.println("Enter the number you want to rewrite: ");
                            int num2 = input.nextInt();
                            if (!(rewritecheck(board, num2, row, col)) && row>=0 && row<=8 && col>=0 && col <= 8){ //rows and columns muct be valid 
                                if( valid(game, num2, row, col)){
                                    game[row][col] = num2;
                                    print(game);
                                    rewrite = false;
                                }
                            }
                        }
                    }
                }
            }
            else //Brings count to initial 0 in the grid
                count++;
        }
        System.out.println("Congratulations, you won"); // ending message which triggers when grid is full and all numbers are valid
    }
    
    
    
    
    
    public static boolean valid(int arr[][] , int num, int row, int col){   //Checking if an input is valid
        if (rowCheck(arr, num, row) && columnCheck(arr, num, col) && boxCheck(arr, num, row, col) && numCheck(num)){
            return true;
        }
        return false;
    }
    
    public static boolean rowCheck(int arr[][], int num, int row){ // Checking a row 
        for (int col = 0; col < arr.length; col++) {
            if (arr[row][col] == num){
                return false;
            }
        }
        return true;
    }
    
    public static boolean columnCheck(int arr[][], int num, int col){  //Checking a column
        for (int row = 0; row < arr.length; row++) {
            if (arr[row][col] == num){
                return false;
            }
        }
        return true;
    }
    
    public static boolean boxCheck(int arr[][], int num, int row, int col){  //Checking a 3x3 box
        for (int row1 = (row/3)*3 ; row1 < ((row/3)*3)+3; row1++) {
            for (int col1 = (col/3)*3; col1 < ((col/3)*3)+3; col1++) {
                if (arr[row1][col1] == num){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean numCheck(int num){ //Checking if a number is valid
        if (num >=1 && num<=9)
            return true;
        return false;
    }
    
    public static void print(int[][] array){                //printing method
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
        }
            System.out.println();
        }
    }
    
    public static boolean rewritecheck(int[][] arr, int num, int row, int col){  //Check to ensure wheter number can be rewritten at pos
        if (arr[row][col] != 0 ){
            System.out.println("You cannot alter this value");
            return true;
        }
        return false;
    }
    
    public static int[][] copy(int[][] arr){ // 2D array copy method
        int[][] arr2 = new int[9][9];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j] = arr[i][j];
            }
        }
        return arr2;
    }
    
}
