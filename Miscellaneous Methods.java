package practice;
import java.util.*;
public class Practice {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println();
        int[] arr = {1, 2, 5};
        int x =10;
        int y = 3;
        int d = slide(2,5,3);
        int n =54321;
        String str = new String("dryuuyyyy");
        System.out.println(func("cathartic", "hac"));
        System.out.println(palindrome(7));

    }
    
    public static String palindrome(int i) {
if (i == 0) return "S";
if (i == 1) return "T";
return palindrome(i-2) + palindrome(i-1) + palindrome(i-2);
}

    public static boolean func(String str, String str2){
        if (str2.length() > str.length()) return false;
        if (str.length()<1) return str2.length() == 0;
        if (str.charAt(0) == str2.charAt(0))
            return func(str.substring(1), str2.substring(1));
        return func(str.substring(1), str2);
    }
    
    public static int restless(int[] arr) {
int sum = 0;
for (int i = 0; i < arr.length; i++)
sum = sum + arr[i];
return sum / arr.length;
}

    
    public static String sandbox() {
String[] arr = {"N", "U", "3", "R", "F"};
return arr[4] + arr[1] + arr[Integer.parseInt(arr[2]) -
Integer.parseInt(arr[2])];
}

    
    public static int slide(int a, int b, int c) {
if (b < 1) return (a + c);
a *= 2;
return slide(a, b-1, c);
}

    
    public static int hamming(int u, int v){
        if (u==0 && v==0) return 0;
        if (u%2 == 1 && v%2 == 0)
            return 1 + hamming(u/2, v/2);
        else if(v%2 == 1 && u%2 == 0)
            return 1 + hamming(u/2, v/2);
        return 0 +hamming(u/2, v/2);
    }

    
    
    
    public static void printStrings(String input) {
	if (input.length() == 0) System.exit(1);
        String[] words = input.split(" ");
        for (int i = 0; i<words.length - 1; i++){
            for (int j = 0; j < Integer.parseInt(words[i]); j++){
                System.out.print(words[i+1]);
            }
            System.out.println("");
        }
    }
    
    public static void arrayMystery(int[] a) {
        for (int i = 1; i < a.length - 1; i++) {
            a[i] = (a[i - 1] + a[i + 1]) / 2;
        }
        display(a);
    } 
    public static void display(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
