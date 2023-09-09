
package centeredavg;
import java.util.*;

public class CenteredAvg {

    public static void main(String[] args) {
        int [] arr = new int []{1,2,3,4,5,6,7};
        System.out.println(average(arr));
    }
    
    public static int average(int[] arr){
        int sum = 0, max = 0, min = 0;
        if (arr.length <= 2) return 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max = (int)(Math.max(max, arr[i]));
            min = (int)(Math.min(min, arr[i]));
        }
        return (sum - max -min)/(arr.length-2);
    }
    
}
