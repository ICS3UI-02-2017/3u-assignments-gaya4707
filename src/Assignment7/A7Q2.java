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
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // call the method for the mark
        int mark = getUserNumber("mark");

        //let the user know what is being calculated
        System.out.println("Your exam letter grade is: ");

        //call the procedure method for a parameter
        examGrade(mark);


    }
    //method to get the user to input an integer

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

    public static void examGrade(int m) {
        //check if the integer fits into one of these number ranges
        if (m < 50&&m>=0) {
            //print out the letter F
            System.out.println("F");
        }
        if (m >= 50 && m <= 59) {
            //print out the letter D
            System.out.println("D");
        }
        if (m >= 60 && m <= 69) {
            //print out the letter c
            System.out.println("C");
        }
        if (m >= 70 && m <= 79) {
            //print out the letter C
            System.out.println("C");
        }
        if (m >= 80) {
            //print out the letter A
            System.out.println("A");
        }
        //check if the mark is less than 0 or more than 100 print- diqualified mark 
        if(m < 0 || m > 100) {
            System.out.println("Sorry, unable to calculate your mark");
            
           
        }
                

    }
}
