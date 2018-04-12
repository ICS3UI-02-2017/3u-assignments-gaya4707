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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // introduce scanner here
        Scanner input = new Scanner(System.in);
        
        //ask the user how many marks does to reagrange
        System.out.println("How many studants are in the class? ");

        //save the number of marks decided by the user
        int num = input.nextInt();
        //create avariable to store the sum of all the marks
        double sumMarks = 0;

        //crete an arrey for the marks
        double[] marks = new double[num];

        //ask the user to write in their 10 marks
        System.out.println("Enter the " + num + " marks: ");

        //create a loop to store the marks in an arrey
        for (int i = 0; i < num; i++) {
            marks[i] = input.nextDouble();
            //add each new mark being put in to the sum of all marks
            sumMarks = sumMarks + marks[i];
        }

        //cretae an integer to store the bigger number there temporarely
        double temp = 0;

        //crete a loop to check the last number in the arrey to first
        for (int n = 0; n < marks.length - 1; n++) {
            //for loop to ckeck the first number in the arrey to last
            for (int k = n + 1; k < marks.length; k++) {
                //if the first is bigger than the second one, swap them.
                if (marks[n] > marks[k]) {
                    temp = marks[n];
                    marks[n] = marks[k];
                    marks[k] = temp;
                }
            }
        }

        

        
        System.out.println();
        
        //calculate the last spot in the array
        int lastSpot = num-1;
        //calculate the average(sum of all marks devided by the amount of studants in the class
        double average = sumMarks/num;
        
        //output the lowest mark, the highest mark and the average
        System.out.println("The average of the class is: " + average);
        System.out.println("The lowest mark is: " + marks[0]);
        System.out.println("The highest mark is: "+ marks[lastSpot]);
    }
}
