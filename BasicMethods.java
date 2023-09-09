package labtask4;
import java.io.*;
import java.util.*;
public class LabTask4 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.next();
        System.out.println("Enter your age: ");
        int age = in.nextInt();
        System.out.println("Enter your height: ");
        float height = in.nextFloat();
        String s = name + " " + age + " " + height;
        System.out.println(getName(s));
        System.out.println(getAge(s));
        System.out.println(getHeight(s));
    }
    
    public static String getName(String s){
        return s.split(" ")[0];
    }
    
    public static int getAge(String s){
        return Integer.parseInt(s.split(" ")[1]);
    }
    
    public static float getHeight(String s){
        return Float.parseFloat(s.split(" ")[2]);
    }
    
}
