package mergesort;
import java.util.*;
public class MergeSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first array size: ");
        int size1 = in.nextInt();
        int[] arr = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.println("Please enter first array values: ");
            arr[i] = in.nextInt();
        }
        System.out.println("Please enter second array size: ");
        int size2 = in.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.println("Please enter second array values: ");
            arr2[i] = in.nextInt();
        }
        int a1 = 0;
        int a2 = 0;
        int[] newArr = new int[size1 + size2];
        for (int n = 0; n < arr.length; n++) {
            System.out.print(arr[n] + " ");
        }
        System.out.println(" ");
        for (int n = 0; n < arr2.length; n++) {
            System.out.print(arr2[n] + " ");
        }
        
        int i;
        for ( i = 0; a1 < size1 && a2 < size2; i++) {
            
                if (arr[a1] < arr2[a2]){
                    newArr[i] = arr[a1];
                    a1++;
                }
                else //if(arr2[a2]<arr[a1]){
                {newArr[i]= arr2[a2];
                    a2++;
                }
            
        }
           
        if(a1 == size1){
                for (int m = i; m < newArr.length; m++) {
                    newArr[m] = arr2[a2];
                    a2++;
                }
        //        break;
                
            }
            else if(a2 == size2){
                for (int m = i; m < newArr.length; m++) {
                    newArr[m] = arr[a1];
                    a1++;
                }
                
            }
        
        System.out.println("");
        for (int n = 0; n < newArr.length; n++) {
            System.out.print(newArr[n] + " ");
        }
    }
}