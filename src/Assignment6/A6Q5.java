/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author shnag4707
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // introduce scanner here
        Scanner input = new Scanner(System.in);

        //ask the user how many marks does to reagrange
        System.out.println("How many marks are being recorded? ");

        //save the number of marks decided by the user
        int num = input.nextInt();

        //crete an arrey for the marks
        double[] marks = new double[num];

        //ask the user to write in their 10 marks
        System.out.println("Enter the " + num + " marks: ");

        //create a loop to store the marks in an arrey
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
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

        //output the marks in an asending order
        System.out.println("your marks in an order from lowest to highest are: ");
        //cretae a for loop to output the numbers in order
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + ", ");

        }
        System.out.println();

        //calculate the median
        //create an if statement to find the median if the number of marks is odd(if devided by 2 remainder is not 0)
        if (!(num % 2 == 0)) {
            //claculate integer for the place in array
            int place = (num + 1) / 2;
            //name that place as the median
            double media = marks[place];

            //output the median to the user
            System.out.println("the median of these marks is: " + media + ".");
        }
        //crete an if statement if the number is even(remainder is 0)
        if (num % 2 == 0) {
            //calculate the first middle place in the array
            int placeOne = num / 2;
            //calculate the second middle place in the array
            int placeTwo = placeOne + 1;
            //calculate an average between those two numbers in the array which is the median
            double calc = marks[placeOne] + marks[placeTwo];
            double media = calc / 2;

            //output the median to the user
            System.out.println("the median of these marks is: " + media + ".");
        }

    }
}
