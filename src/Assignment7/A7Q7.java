/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import static Assignment7.A7Q6.getUserNumber;


/**
 *
 * @author shnag4707
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // get the user number using the method
        int num = getUserNumber("random number");
        
        //call the method to print the last digit
        int digit = FirstDigit(num);
        
        //print the digit
        System.out.println("the last digit is: "+ digit);
        
    }
    public static int FirstDigit(int n){
        //
        //if the number is negative times it by -1
        if(d<0){
            d = d*(-1);
        }
    }
}
