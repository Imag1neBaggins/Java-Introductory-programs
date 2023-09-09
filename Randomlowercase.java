package randomlowercase;
import java.util.*;
public class Randomlowercase {
    
    public static void main(String[] args) {
        char[] arr = randomchar();
        int[] freq = new int[26];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            int j = arr[i] - 'a';
            freq[j]++;
        }
        for (int i = 0; i < freq.length; i++) {
            char a = (char)(97+i);
            System.out.println("The freq of " + a + " is " + freq[i]);
        }
    }
    
    public static char[] randomchar(){
        char[] array = new char[100];
        for (int i = 0; i < array.length; i++)
            array[i] =  (char)('a'+(int)((Math.random()*('z' - 'a'))));
        return array;
    }
}
