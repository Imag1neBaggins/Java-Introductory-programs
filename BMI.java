package bmi;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in) ;
         System.out.println("Please enter your weight in KG");
         double weight = input.nextDouble();
         System.out.println("Please enter your height in metres");
         double height = input.nextDouble();
         double BMI = weight/(Math.pow(height,2));
         System.out.println("Please enter your age");
         int age = input.nextInt();
         if (age<16){
             System.out.println("You are not at the required age");
             System.exit(1);
         } 
         else if (BMI < 18.5){
             System.out.println("You are underweight");
         }
         else if (BMI>=18.5 && BMI<25.0){
             System.out.println("You are Normal weight");
         }
         else if (BMI>=25.0 && BMI<30.0){
             System.out.println("You are overweight");
         }
         else if (BMI>=30.0){
             System.out.println("You are Obese");
         }
    }
    
}
