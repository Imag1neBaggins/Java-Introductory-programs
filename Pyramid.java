package pyramid;
import java.util.*;
public class Pyramid {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = input.nextInt();
        for (int i =1;i<=n;i++){
            for(int j = n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int x = 1;x<=i;x++){
                System.out.print(x);
            }
            for(int k = i-1;k>0;k--){
                System.out.print(k);
            }
            System.out.println();
            }
        }
    }

