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
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // get the user number of lines
        int lines = getUserNumber("number of lines");
        
        //call the procedure method to create the randion astriks
        caotic(lines);
    }
    public static void caotic(int l){
        //create a for loop to create each line lines
        for (int i = 0; i < l; i++) {
            //create the random number(between 1 and 5)
            int randNum = (int)(Math.random()*(5))+1;
            //create loop to create a random number of astricks per line 
            for (int j = 0; j < randNum; j++) {
                System.out.print("*");
            }
 
                
            System.out.println("");     
            
        }
        
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
