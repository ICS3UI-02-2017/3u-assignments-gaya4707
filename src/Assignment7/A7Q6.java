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
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // get the user number using the method
        int num = getUserNumber("random number");
        
        //call the method to print the last digit
        int digit = lastDigit(num);
        
        //print the digit
        System.out.println("the last digit is: "+ digit);
        
    }
    public static int lastDigit(int n){
        //devide the number by 10 and the remainder is the last digit
        int d = n%10;
        //if the number is negative times it by -1
        if(d<0){
            d = d*(-1);
        }
        //return the digit
        return d;
    }
    public static int getUserNumber(String need) {
        //introduce scanner
        Scanner input = new Scanner(System.in);

        //ask user write the needed number
        System.out.println("plese enter the " + need + " :");

        //get that integer
        int x = input.nextInt();

        //return the integer
        return x;
    }
}
