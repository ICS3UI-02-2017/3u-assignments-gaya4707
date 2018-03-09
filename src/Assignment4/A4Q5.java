/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author Gaya
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // introduce input scanner
        Scanner input = new Scanner(System.in);
        
        //ask user for their name
        System.out.print("Hello student, please write your name here: ");
        String name = input.nextLine();
        //add a space
        System.out.println("\n");
        
        // ask the user what each test is out of and what they got
        System.out.print("How much was the 1st test out of? ");
        double testOne = input.nextDouble();
        System.out.print("What mark did you get? ");
        double markOne = input.nextDouble();
        System.out.println("\n");
        System.out.print("How much was the 2nd test out of? ");
        double testTwo = input.nextDouble();
        System.out.print("What mark did you get? ");
        double markTwo = input.nextDouble();
        System.out.println("\n");
        System.out.print("How much was the 3rd test was out of? ");
        double testThree = input.nextDouble();
        System.out.print("What mark did you get? ");
        double markThree = input.nextDouble();
        System.out.println("\n");
        System.out.print("How much was the 4th test was out of? ");
        double testFour = input.nextDouble();
        System.out.print("What mark did you get? ");
        double markFour = input.nextDouble();
        System.out.println("\n");
        System.out.print("How much was the 5th test out of? ");
        double testFive = input.nextDouble();
        System.out.print("What mark did you get? ");
        double markFive = input.nextDouble();
        System.out.println("\n");
        
        //claculate the test averages and the total average
        double gradeOne = markOne/testOne*100;
        double gradeTwo = markTwo/testTwo*100;
        double gradeThree = markThree/testThree*100;
        double gradeFour = markFour/testFour*100;
        double gradeFive = markFive/testFive*100;
        double totalGrades = gradeOne + gradeTwo + gradeThree + gradeFour + gradeFive;
        double totalTotal = totalGrades/5;
        
        //present the average grade for each test 
        System.out.println("Test scores for " + name + ":" );
        System.out.println("Test 1:  " + gradeOne +" %");
        System.out.println("Test 2:  " + gradeTwo +" %");
        System.out.println("Test 3:  " + gradeThree +" %");
        System.out.println("Test 4:  " + gradeFour +" %");
        System.out.println("Test 5:  " + gradeFive +" %");
        System.out.println("\n");
        
        //present the total average 
        System.out.println("Your final average score is " + totalTotal + " %");
    }
    
}
