/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author shnag4707
 */
public class ForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City miami = new City();
        RobotSE wally =
                new RobotSE(miami, 1, 1, Direction.EAST);
        
        
        // counted while loop
        int numberOfMoves = 5;
        while (numberOfMoves>0){
            wally.move();
            numberOfMoves = numberOfMoves - 1 ;
        
    }
        wally.turnAround();
        
        //counting the other way
        numberOfMoves = 0;
        while(numberOfMoves < 5){
            wally.move();
            numberOfMoves = numberOfMoves = 1;
        }
        
        wally.turnAround();
        //use a for loop to move
        for(int count = 0; count < 5; count++){
            //the same thing as count = count+1
            wally.move();
        }
        
        //shortcut - for and press tub
        for (int i = 0; i < 10; i++) {
            
        }
        
        
        //adding subtracting shortcuts
        int x = 10;
        x = x + 5; //adds 5
        x += 5; //adds 5
        
        x-= 10; //sub 10
        x = x - 10;
        
        x *= 2; //multiply by 2
        x = x * 2;
        
        x /= 4; //divide by 4
        x = x / 4;
        
        //modulus or modulo
        int remainder = 5 %2 ;
        int quotiant = 5 / 2;
        
        
        if(wally.frontIsClear()){
            if (wally.canPickThing()){
                wally.move();
            }
        }
        
        //both must be true to perform
        if (wally.frontIsClear() && wally.canPickThing()){
            wally.move();
        }
        
        //only one needs to be true
        if (wally.frontIsClear() || wally.canPickThing()){
            wally.move();
        }
        
        
        
        
    }
}
