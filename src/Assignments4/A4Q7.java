/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments4;

import java.util.Scanner;

/**
 *
 * @author shnag4707
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // introduce the scanner
        Scanner input = new Scanner(System.in);

        
            //ask user to input their number on dice
            System.out.print("Plese enter the result of your dice throwing: ");
            int firstDiceResult = input.nextInt();

            //if number is smallr than 2 print you quit
            while (firstDiceResult < 2 || firstDiceResult > 12) {
                System.out.println("You Quit !");
                System.out.println("Game Over");
            }
            //calculate the first landing spot
            int firstLandingSpot = 1 + firstDiceResult;
            //present the first landing spot and continue to ask what the new reslt is
            while (firstDiceResult > 2 || firstDiceResult < 12) {
                //keep  it in a loop and keep asking what the result of the dice is
                while(landingSpot!=100){
                //go up the ladder if land on 9
                if (landingSpot == 9) {
                    System.out.println("You are now on square 34");
                    landingSpot = 34;
                }
                //go up the ladder if lands on 40
                if (landingSpot == 40) {
                    System.out.println("You are now on square 64");
                    landingSpot = 64;
                }
                //go up ladder if land on 67
                if (landingSpot == 67) {
                    System.out.println("you are now on 86");
                    landingSpot = 86;
                }

               System.out.print("Please enter the result of your dice result:");
               int diceResult = input.nextInt();
               int landingSpot = diceResult + 
            }

        }
    }
}
