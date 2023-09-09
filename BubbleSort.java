package bubblesort;
import java.util.*;
public class BubbleSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter array size: ");
        int size = in.nextInt();
        int tmp = 0;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
           System.out.println("Please enter array values: ");
           array[i] = in.nextInt();
        }
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if ( array[j] > array[j+1] ){
                    tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
            }
            }
        }
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
}
