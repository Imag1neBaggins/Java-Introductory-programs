package counting0srecursion;
import java.util.*;
public class Counting0sRecursion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(nOfZeros(n));
    }
    
    public static int nOfZeros(int n){
        int num = 0;
        if (n > 99){
            if(n%10 == 0){
                num++;
            }
            num += nOfZeros(n/10);
        }
        else if(n<100 && n%10==0){
            num++;
        }
        return num;
    }
}
