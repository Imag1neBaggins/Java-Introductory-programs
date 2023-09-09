package javaapplication11;
import java.util.*;
public class JavaApplication11 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in) ;
        int num = (int)(Math.random()*101);
        int count = 1;
        for(count=1;count<=5 ; count++){
            System.out.println("Please enter a guess: ");
            int guess = input.nextInt();
            if (guess == num){
                System.out.println("Congratulations...You took " + count + " guesses to get the correct answer");
                System.out.println("Press 1 if you want to continue, 0 if you want to end: ");
                int i = input.nextInt();
                if(i == 1){
                    count = 1;
                    num = (int)(Math.random()*100);
                }
                else{ 
                    break;
                }    
            }
            else if(guess > num){
                System.out.println("Too high");
            }
            else if(guess < num){
                System.out.println("Too low");
            }
        }
        System.out.println("The correct number was: " + num);

    }
    
}
