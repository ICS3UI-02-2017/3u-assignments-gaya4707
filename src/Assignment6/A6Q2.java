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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // introduce scanner
        Scanner input = new Scanner(System.in);

        //ask the user how many people are going to be measured
        System.out.print("How many people are measured? ");

        //the input is the size of the array
        int size = input.nextInt();


        //create array of the size of that many people
        double[] height = new double[size];
        //create an array of name the size of that many people
        String[] names = new String[size];
        //create an integer to calculate the sum of all the heights
        double sum = 0;

        //ask the user of the name of the person each time(loop)
        for (int n = 0; n < height.length; n++) {
            System.out.println("Enter the name of the person:");
            //store the name in the names array
            input.nextLine();
            names[n] = input.nextLine();


            //ask the user for that person's height
            System.out.println("How tall is he/she? (in meters)");
            //record that height in the height array
            height[n] = input.nextDouble();


            //add that height to the sum
            sum = sum + height[n];

        }
        //calculate the average 
        double ave = sum / height.length;

        //create a loop to check eack place in te array
        for (int i = 0; i < height.length; i++) {
            //create a number to use if the height is more than the average
            double num = height[i] - ave;

            // check each height in the array
            if (num > 0) {
                //if taller than avrage, let the user know
                System.out.println("" + names[i] + "'s height is above average");


            }

        }










    }
}
