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
        
        //introduce the initaial landing spot
        int landingSpot = 1;
        
        //begin a big loo that wil go on untill the user wins the game - gets to spot 100
        while(landingSpot<100){
            //ask user for result of roll of dice
            System.out.println("Plese insert the result of the dice roll: ");
            int diceResult = input.nextInt();
            //check if the input is valid - if not, exit game
            if(diceResult<2 || diceResult>12){
                System.out.println("Game over!");
                System.exit(0);
                //if yes calculate the next spot
            }if(diceResult>=2 || diceResult<=12){
                landingSpot = landingSpot + diceResult;
                //check if on a ladder - if yes go up the ladder,if not move on to next order
                if(landingSpot == 9){
                    landingSpot = 34;
                }if(landingSpot ==40){
                    landingSpot=64;
                }if(landingSpot==67){
                    landingSpot=68;
                }
                //if on a snake slide down, if not - move on to next order
                if(landingSpot==54){
                    landingSpot=19;
                }if(landingSpot==90){
                    landingSpot= 48;
                }if(landingSpot==99){
                    landingSpot=77;
                }
                //if the result is more than 100, go back to the previous spot and try again
                if(landingSpot>100){
                    landingSpot = landingSpot - diceResult;
                }
                //display the new landing spot
                System.out.println("You are now on square " + landingSpot+".");
            }
        }
        //once reach spot 100, print congradulations
        System.out.println("congradulations, you win!");

        
    }
}
