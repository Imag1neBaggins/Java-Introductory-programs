package palindrome;
import java.util.*;
public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = input.next().toLowerCase();
        int x = word.length()-1; 
        boolean palindrome = true;
        for (int j = 0; j < x/2; j++) {
            if (word.charAt(j) != word.charAt(x-j)){
                palindrome = false;
                System.out.println("Your word is not a palindrome");
                break;
            }
        }
        if (palindrome == true)
            System.out.println("Your word is a palindrome");
    } 
}
