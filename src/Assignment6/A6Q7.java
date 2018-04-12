/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

/**
 *
 * @author shnag4707
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //cretae an array fo the numbers from 2 to 1000
        int[] nums = new int[998];
        
        // create a loop to write a list of numbers starting at two into the array
        for (int i = 0; i < 998; i++) {
            nums[i] = 2 + i;
        }
        
        //create a boolean array to tell wather the integers are prime
        boolean[] prime = new boolean[998];
        //set all the spots in the boolean array to true
        for (int i = 0; i < 998; i++) {
            prime[i]= true;
        }
        //create the integer p
        int p = 2; 
        //a loop starting at p and change the boolean array to false if the number is prime
        for (int p = 2; p < 1000; ) {
            
        }
    }
}
