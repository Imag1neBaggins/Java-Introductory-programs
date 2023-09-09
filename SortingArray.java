package javaapplication36;
import java.util.*;
public class JavaApplication36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[20];
        System.out.println("Enter the number of elements <= 20: ");
        int i = input.nextInt();
        if (i == 0){
            System.out.println("Enter element to be inserted: ");
            int f = input.nextInt();
            System.out.println(f);
        }
        else{
            for (int j = 0; j < i; j++) {
                System.out.println("Enter the elements in ascending order: ");
                arr[j] = input.nextInt();
            }
            System.out.println("Enter the element to be inserted: ");
            int k = input.nextInt();
            sor(arr, k, i);
        }
    }
    
    public static void sor(int[] array, int n, int n2){
        int temp = 0;
        if(n > array[n2 - 1]){
            array[n2] = n;
        }
        else{
        for (int i = 0; i < n2; i++) {
            if(n >= array[i] && n <= array[i+1] && i+1 <= n2)
                temp = i+1;
        }
        for (int k = n2 + 1; k >= temp; k--) {
            array[k+1] = array[k];
        }
        array[temp] = n;
        }
        System.out.println("Array after insertion is: " );
        for (int i = 0; i < n2+1; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
