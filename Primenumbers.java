package primenumbers;

public class Primenumbers {

    public static void main(String[] args) {
        int n =2;
        int nP=0;
        int nF = 0;
        int count=0;
        while ( nP<50) {
           for (int j = 1; j <=n; j++) {
               if(n%j == 0){
                   nF++;
               }
            }
            if(nF==2){
                System.out.print(n);
                System.out.print(" ");
                nP++;
                count++;
            }
            if(count==10){
               System.out.println();
               count = 0;
               }
            n++;
            nF=0;
        }
    }
}
    
