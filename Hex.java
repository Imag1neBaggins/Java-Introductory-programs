package hex;
import java.util.*;
public class Hex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a hexadecimal digit");
        String hex = in.next().toUpperCase();
        char ch = hex.charAt(0);
        if (hex.length()>1){
            System.exit(1);
        }
        if (ch>='1' && ch<='9'){
            System.out.println("Your denary is: " + ch);
        }
        else if (ch>='A'&&ch<='F'){
            System.out.println("Your denary is: "+(ch - 55));
        }
    }
    
}
