package finallab2;
import java.util.*;
import java.io.*;
public class FinalLab2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = in.next();
        if (str.length() == 0) System.out.println("0");
        else System.out.println(largestBlock(str));
    }
    
    public static int largestBlock(String str){
        if (str.length() == 1) return 1;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            int temp = 1;
            char a = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == a) temp++;
                else break;
            }
            max = (int)(Math.max(max, temp));
        }
        return max;
    }
}
