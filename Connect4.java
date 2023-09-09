package connect4;
import java.util.*;
/**
 * Task: Create a 2 player game Connect4 in java
 * Approach:
 * 1- Declare a 6x7 character array, the reason for char is so it becomes easier to display 
 *    the board as empty spaces rather than numbers. 
 * 
 * 2- Ask users to enter the number of column in turn, create methods to check if the row,
 *    column or diagonal have four matching colors, if they do declare winner, else continue
 *    until board finishes or one wins
 */
public class Connect4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] game = {{' ',' ',' ',' ',' ',' ',' '},  //Declaration of array
                         {' ',' ',' ',' ',' ',' ',' '},
                         {' ',' ',' ',' ',' ',' ',' '},
                         {' ',' ',' ',' ',' ',' ',' '},
                         {' ',' ',' ',' ',' ',' ',' '},
                         {' ',' ',' ',' ',' ',' ',' '}};
        display(game);  //initial printing
        char player = 'W';
        boolean winner = false;
        int turn = 0, col = 0;
        while(turn < 42 && !winner){  //Loop runs until either a player wins or board is full
            if (turn%2 == 0) player = 'W';  //Switch players
            else player = 'B';
            boolean contInput = true;
            do{  //Input and exception handling loop
                try{
                    System.out.println("Player " + player + ", please enter the column you want to add to");
                    col = in.nextInt() - 1; //User display will show (0,0) as (1,1) so -1 is needed
                    if (validate(game, col)) contInput = false;
                    else System.out.println("This column is not valid");
                }
                catch(Exception e){
                    System.out.println("This column is not valid");
                    in.nextLine();  //Clearing buffer
                }
            }while(contInput);
            for (int row = game.length - 1; row >= 0 ; row--) {  //fills the vacant spots starting from the bottom 
                if (game[row][col] == ' '){
                    game[row][col] = player; 
                    break;
                }
            }
            display(game);
            winner = win(game, player);
            turn++;
        }
        if (winner)System.out.println("Congratulations player " + player + " for winning the game");
        else System.out.println("Tie");
    }
    
    public static boolean validate(char[][] game, int col){ //Checks if column is not full by checking the first row i.e the top most entry of the column
	if (col < 0 || col > game[0].length) return false;
	if (game[0][col] != ' ') return false;
	return true;
    }
    
    public static boolean win(char[][] game, char a){  //Checks whole board to see if 4 have been connected anywhere
        for (int row = 0; row < game.length; row++) 
            for (int col = 0; col < game[0].length; col++) 
                if(rowCheck(game, row,a) || columnCheck(game,col,a) || diagonalCheck(game, a) ) return true;
        return false;
    }
    
    public static boolean rowCheck(char[][] game, int row, char a){ //Checking if 4 match in a row
        for (int col = 0;col < game[0].length - 3;col++)
            if (game[row][col] == a && game[row][col+1] == a && game[row][col+2] == a && game[row][col+3] == a)
                return true;
        return false;
    }
    
    public static boolean columnCheck(char[][] game, int col, char a){  //Checking if 4 match in a column
        for(int row = 0; row < game.length - 3; row++)
            if (game[row][col] == a && game[row+1][col] == a && game[row+2][col] == a && game[row+3][col] == a)
                return true;
        return false;
    }
    
    public static boolean diagonalCheck(char[][] game, char a){  //Checking if 4 match diagonally
        for(int row = 3; row < game.length; row++)  //Diagonal going rightwards
            for(int col = 0; col < game[0].length - 3; col++)
		if (game[row][col] == a   && game[row-1][col+1] == a && game[row-2][col+2] == a && game[row-3][col+3] == a)
                    return true;
            
        for(int row = 3; row < game.length; row++)  //Diagonal going leftwards
            for(int col = game[0].length - 1; col > 3 ; col--)
		if (game[row][col] == a   && game[row-1][col-1] == a && game[row-2][col-2] == a && game[row-3][col-3] == a)
                    return true;
        return false;  //seperated from the for loops
    }
    
    public static void display(char[][] grid){  //Main printing method
	System.out.println("   1 2 3 4 5 6 7");
	System.out.println("------------------");
	for (int row = 0; row < grid.length; row++){
            System.out.print(row + 1 + " |");
            for (int col = 0; col < grid[0].length; col++){
                System.out.print(grid[row][col]);
		System.out.print("|");
            }
            System.out.println();
	}
        System.out.println("------------------");
	System.out.println();
    }
    
}
