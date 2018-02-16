/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author shnag4707
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City miami = new City();
                
        //create robot
        RobotSE wally = new RobotSE(miami, 5, 8, Direction.EAST);
        
       //loop- if avenue more than 0, move
        while(wally.getStreet()>0){
            //loop- if robot is not facing north, turn around until does
                while(!wally.isFacingNorth()){
                    wally.turnRight();
                
               }
             wally.move();
        }
        //loop- if street more than 0, move
        while(wally.getAvenue()>0){
            //loop- if robot is not facing west, turn around until does
            while(!wally.isFacingWest()){
                wally.turnRight();
            }
        wally.move();
        }
    }
    
    
}
