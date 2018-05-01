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
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // introduce scanner
        Scanner input = new Scanner(System.in);
        
        //ask the user for the number needed to factor 
        System.out.println("Please enter the number you would like to factor: ");
        //store that integer
        int num = input.nextInt();
        
        //print to the user that the following numbers are the factors
        System.out.println("The factors are: ");
        
        //call the method for the factors
        factors(num);
        //add an enter sign
        System.out.println("");
        
    }
    public static void factors(int n){
        //look for numbers that are between 1 and the number
        for (int i = 1; i <= n; i++) {
            //if the remaider is 0, print that number as a factor
            if(n%i==0){
                System.out.print(i+", ");
            }
            
            
        }
    }
}
