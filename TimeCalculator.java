package labtask8;
import java.io.*;
import java.util.*;
public class LabTask8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the hours: ");
        int hours = in.nextInt();
        System.out.println("Please enter the minutes: ");
        int minutes = in.nextInt();
        System.out.println("Please enter the seconds: ");
        int sec = in.nextInt();
        System.out.println("the current time is " + hours + ":" + minutes + ":" + sec);
        int totalseconds = (hours*3600) + (minutes*60) + sec;
        System.out.println("Press 1 if you want to add, 2 if you want to subtract: ");
        int n = in.nextInt();
        if (n==1){
            System.out.println("How many seconds do you want to add");
            int p = in.nextInt();
            totalseconds += p;
            int hour = totalseconds/3600;
            int minute = (totalseconds%3600)/60;
            int sec2 = ((totalseconds%3600)%60)%60;
            System.out.println("The time is " + hour + ":" + minute + ":" + sec2);
        }
        else if (n == 2){
            System.out.println("How many seconds do you want to remove");
            int p = in.nextInt();
            totalseconds -= p;
            int hour = totalseconds/3600;
            int minute = (totalseconds%3600)/60;
            int sec2 = ((totalseconds%3600)%60)%60;
            System.out.println("The time is " + hour + ":" + minute + ":" + sec2);
        }
    }
    
}
