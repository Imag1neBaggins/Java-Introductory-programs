package removex;
import java.util.*;
public class RemoveX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(removeX(str));
        System.out.println(str.length() - removeX(str).length() + " x's have been removed");
    }
    
    public static String removeX(String str){
        if (str.length() == 0 || str.equals("")) return str;
        if (str.charAt(0) == 'x') return removeX(str.substring(1));
        return str.charAt(0) + removeX(str.substring(1));
    }
    
}
