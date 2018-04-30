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
        
        //
    }
    //method to get the user to input an integer
    public static int getUserNumber(String need){
        //introduce scanner
        Scanner input = new Scanner(System.in);
        
        //ask user write the needed number
        System.out.println("plese enter the "+need+" ;");
        
        //get that integer
        int x = input.nextInt();
        
        //return the integer
        return x;
    }
}
