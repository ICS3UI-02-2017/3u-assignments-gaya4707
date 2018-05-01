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
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // call method to get the princial number
        double principal = getUserNumber("initial amount of money");
        
        //call the method to get the interest number
        double interest = getUserNumber("interest rate");
        
        //call the method to get the number of years
        double years = getUserNumber("number of years");
        
        //call the methosd for the new balance
        double balance = compoundInterest(principal, interest, years);
        
        //print the user their new balance round to 3 decimal places
        System.out.printf("Your new balance is: %.3f \n" ,balance);
    }
    public static double getUserNumber(String need) {
        //introduce scanner
        Scanner input = new Scanner(System.in);

        //ask user write the needed number
        System.out.println("plese enter the " + need + " :");

        //get that integer
        double x = input.nextDouble();

        //return the integer
        return x;
    }
    public static double compoundInterest(double p, double r, double n){
        //calculate the bracet (1+r)
        double calc1 = 1+r;
        //calculate (1+r) to the power of n
        double calc2 = Math.pow(calc1, n);
        //calculate the balance
        double answer = calc2*p;
        
        //return the answer
        return answer;
    }
    
}
