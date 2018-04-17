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
        int[] nums = new int[999];

        // create a loop to write a list of numbers starting at two into the array
        for (int i = 0; i < 999; i++) {
            nums[i] = 2 + i;
        }

        //create a boolean array to tell wather the integers are prime
        boolean[] prime = new boolean[999];
        //set all the spots in the boolean array to true
        for (int i = 0; i < 999; i++) {
            prime[i] = true;
        }

        //a loop starting at p and change the boolean array to false if the number is prime
        for (int p = 0; p < 999; p++) {
            //run the progeram if the number is a prime
            if (prime[p] == true) {
                //print out the number at the prime spot
                System.out.println("the prime number is " + nums[p]);
                //for loop to check ALL the multiples of p
                for (int m = p+1; m < 999; m++) {
                    //set multiples of p to false (not prime) if remainder is 0
                    if (nums[m] % nums[p] == 0) {
                        prime[m] = false;

                    }
                }

            }

        }
    }
}
