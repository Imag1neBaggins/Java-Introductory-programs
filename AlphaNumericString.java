package alphanumericstring;

import java.util.*;

public class AlphaNumericString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (alpNum(words[i])) 
                System.out.println(words[i]);
        }
    }
    
    public static boolean alpNum(String str){
        int j = 0, k = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))j++;
            else k++;
        }
        return (k>0 && j>0);
    }
    
}
