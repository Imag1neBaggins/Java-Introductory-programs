package labquiz2;
import java.util.*;
public class LabQuiz2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an alphanumeric sentence: ");
        String string1 = input.nextLine().toLowerCase();
        string1=string1.toLowerCase();
        String[] processing=string1.split("[ ,a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z]");
        int max=0;
        for (int y = 0; y < processing.length; y++) {
            if (processing[y].equals("")==false)
            if (Integer.valueOf(processing[y])>max){
            max=Integer.valueOf(processing[y]);
            }
            
            
        }
        System.out.println(max);
        }
    }

