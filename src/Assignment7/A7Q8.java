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
public class A7Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //introduce scanner
        Scanner input = new Scanner(System.in);

        //ask user write the needed number
        System.out.println("plese enter the random number :");

        //get that integer
        int num = input.nextInt();
        
        //call the method to say if all the digits rae odd
        boolean answer = allDigitsOdd(num);

        //print out the answer
        System.out.println("Are all the digitd in this namber ood? ");
        System.out.println(answer);

    }

    public static boolean allDigitsOdd(int n) {
        //create the boolean- answer(strat as true)
        boolean a = true;
        //divide the number into each digit
        while (n > 9) {
            //find the digit by dividing it by 10 and finding the remainder
            int d = n % 10;
            //if that digit is odd(remainser is 0 if devided by 2) 
            if (d % 2 == 0) {
                //turn the boolean into false
                a = false;
            }
            n = n/10;
        }
        //ceck the first digit if it is even
        if (n % 2 == 0) {
            //turn the boolean into false
            a = false;
        }

        return a;
    }
}
