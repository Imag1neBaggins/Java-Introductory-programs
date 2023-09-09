package labquiz;
 import java.util.*;
public class LabQuiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String str = input.nextLine().toUpperCase();
        int x = str.length()-1;
        int match = 0;
        boolean p = true;
        for (int i = 0; i <= x; i++) {
            char check = str.charAt(i);
            for (char j = 'A'; j <= 'Z'; j++) {
                if (check == j){
                    p = true;
                    str = str.replace(check, ' ');
                    match++;
                    break;
                }
                else if(check != j){
                    p = false;
                }
            }
        }
        if (p && match == 26){
            System.out.println(p);
        }
        else {
            p = false;
            System.out.println(p);
        }
    }
    
}
