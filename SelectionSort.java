package selectionsort;
import java.util.*;
public class SelectionSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter array size: ");
        int size = in.nextInt();
        int minI = 0;
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
        for (int i = 0; i < array.length; i++) {
            minI = i;
            for (int j = i; j < array.length; j++) {
                if (array[j]<array[i]){
                    minI = j;
                }
            }
            if (minI != i){
                tmp = array[i];
                array[i] = array[minI];
                array[minI] = tmp;
            }
        }
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}