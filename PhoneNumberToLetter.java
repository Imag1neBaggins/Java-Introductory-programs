package labtask3;
import java.io.*;
import java.util.*;
public class LabTask3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] alphabet = {{'A','B','C'},
                             {'D','E','F'},
                             {'G','H','I'},
                             {'J','K','L'},
                             {'M','N','O'},
                             {'P','Q','R','S'},
                             {'T','U','V'},
                             {'W','X','Y','Z'}};
        char alph = ' ';
            try{
                System.out.println("Please enter the char: ");
                alph = in.next().toUpperCase().charAt(0);
            }
            catch(Exception e){
                System.out.println("Invalid letter");
                in.nextLine(); 
            }
            if (alph < 'A' || alph > 'Z') {
                System.out.println("Invalid letter");
                System.exit(0);
            }
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < alphabet[i].length; j++) {
                if(alphabet[i][j] == alph){
                    System.out.println("The letter " + alph + " corresponds to " + (i+2) + " on the telephone");
                    break;
                }
            }
        }
    
    }
    
}
