/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author shnag4707
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //introduce scanner
        Scanner input = new Scanner(System.in);
        
        
        // collect the list of marks
        System.out.println("please enter the amount of students in your class:");
        
        //get the answer form the user
        int students = input.nextInt();
        
        //store the marks in an arrey depending on the amount of students set by user
        double[] marks = new double[students];
        
        //ask the user for the marks of his class
        System.out.println("please enter the marks of your class:");
        
        //crete the sum of all marks and set equal to zero
        double sum = 0;
        
        //create a for toop to store the marks in the arrey
        for (int i = 0; i < students; i++) {
            marks[i] = input.nextInt();
            
            //add the mark that was typed by user to the sum of al the marks
            sum = sum + marks[i];
            
        }
        //once calculated the sum of all marks, divide by the number of syudents to get average
        double average = sum/students;
        
        //round the average to 2 decimal places using printf command and print is out
        System.out.printf("The average of your class is aprox. %.2f \n", average);
        
    }
}
