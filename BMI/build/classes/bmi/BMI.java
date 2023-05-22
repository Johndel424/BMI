/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import java.util.Scanner;
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter your weight(kg): ");
        double weigth = sc.nextDouble();
        System.out.println("Enter your height(meter): ");
        double height=sc.nextDouble();
        
        
        double bmi = weigth / (height * height); 
        System.out.println("Your bmi is: " + bmi + "kg/m2");
        
        if (bmi > 20){
        System.out.println("You are Under Weight");
        System.out.println("Your Daily recommend water intake per glass is 5 a day");
        }else if(bmi <21 || bmi > 40){
            System.out.println(" You are Normal");
            System.out.println("Your Daily recommend water intake per glass is 9 a day");
        }else{
        System.out.println("You are Obesse");
        System.out.println("Your Daily recommend water intake per glass is 10 a day");
        }
    }
    
}
