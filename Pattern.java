package pattern;

import java.util.*;
public class Pattern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1;i<=n; i++){
            sum = 0;
            for(int x=1 ; x<=i;x++){
                sum += x;
                System.out.print(x);
                if(i==x){
                    continue;
                }
                System.out.print("+");
            }
            System.out.println("=" + sum);
        }
    }
    }

