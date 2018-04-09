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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //introduce scanner
        Scanner input = new Scanner(System.in);
        
        //create arrey A
        int[] A = new int[2];
        
        //ask the user to input their numbers and store in the arrey
        System.out.print("Enter two integers: ");
        A[0] = input.nextInt();
        A[1] = input.nextInt();
        
        //create an integer to store one of the integers there temporarely
        int temp = 0;
        
        //if the 1nd nuber is bigger than the first, swap them
        if(A[0]>A[1]){
            temp = A[0];
            A[0] = A[1];
            A[1] = temp;
        }
        
        //output the numbers in asending order
        System.out.println("These two numbers in increasing order are: " + A[0] +", " + A[1]);
        
        
        
    }
}
