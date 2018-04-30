/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author shnag4707
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // introduce scanner
        Scanner input = new Scanner(System.in);
        
        //ask user to input radius
        System.out.println("please enter radius of circle:");
        double r = input.nextDouble();
        
        //call the method to calculate area
        double answer = circleArea(r);
        
        //output the answer to user roundee to 2 decimal places
        System.out.printf("the Area of circlr is: %.2f \n",answer);
        
    }
    public static double circleArea( double radius ){
        //create variable pai
        double pai = Math.PI;
        
        //calculate the radius to power of 2
        double power = Math.pow(radius,2);
        //calculate the area(square radius times pai)
        double ans = power*pai;
        
        //return the answer for the function
        return ans;
    }
}
