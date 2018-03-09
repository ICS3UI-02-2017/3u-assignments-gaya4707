/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author shnag4707
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // introduce scanner of input
        Scanner input = new Scanner(System.in);
        
        //ask the user to write the measurment in inches
        System.out.println("Plese write the measurment in inches you would like to convert: ");
        
        //the variable that is needed to be scanned
        double inches = input.nextDouble();
        
        //the present the number in cm(new variable)
        double centimeter = inches*2.54;
        System.out.println( inches + " inches is the same as " + centimeter + " cm");
        
        
                
    }
}
