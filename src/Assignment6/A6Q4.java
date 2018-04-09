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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // introduce scanner here
        Scanner input = new Scanner(System.in);
        
        //crete an arrey for the marks
        double[] marks = new double[10];
        
        //ask the user to write in their 10 marks
        System.out.println("Enter the 10 marks: ");
        
        //create a loop to store the marks in an arrey
        for (int i = 0; i < 10; i++) {
            marks[i] = input.nextDouble();
        }
         
         //cretae an integer to store the bigger number there temporarely
        double temp = 0;
        
        //crete a loop to check the last number in the arrey to first
        for (int n = 9; n < 10; n--) {
            double x = marks[n];
            //for loop to ckeck the first number in the arrey to last
            for (int k = 0; k < 10; k++) {
                double y = marks[k];
                //if the first is begger than the second one, swap them.
                if(x<y){
                    temp = y;
                    y = x;
                    x = temp;
                }
            }
        }
        
        //output the marks in an asending order
        System.out.println("your marks in an order from lowest to highest are: " );
        //cretae a for loop to output the numbers in order
        for (int i = 0; i < 10; i++) {
            System.out.println(marks[i]+ " ,");
            
        }
    }
}
