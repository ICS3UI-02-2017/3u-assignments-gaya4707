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
        
        //call the method to print the first digit
        int digit = FirstDigit(num);
        
        //print the digit
        System.out.println("the first digit is: "+ digit);
        
    }
    public static int FirstDigit(int n){
        //keep dividing the number by 10 until 1 digit is left(has to be between 0 and 9)
        while(n>9){
            n = n/10;
        }
        //if the number is negative times it by -1
        if(n<0){
            n = n*(-1);
        }
        //retirn the first digit
        return n;
    }
}
