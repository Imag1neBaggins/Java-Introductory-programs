package labtask5;
import java.io.*;
import java.util.*;
public class LabTask5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter main string: ");
        String s = in.next();
        System.out.println("Enter sub string: ");
        String sub = in.next();
        for (int i = 0; i < s.length() - sub.length(); i++) {
            boolean has = true;
            for (int j = 0; j < sub.length(); j++) {
                if (s.charAt(i + j) != sub.charAt(j)){
                    has = false;
                    break;
                }
            }
                if (has){
                    System.out.println(i);
                    break;
                }
                else System.out.println(-1);
        }
    }
}
