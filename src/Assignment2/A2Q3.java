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
        
       
        while(wally.frontIsClear()){
            //if statement to get the avenue 0, if not, turn right
            if(wally.getAvenue()>0){
                if(wally.isFacingNorth()){
                    wally.move();
                }while(!wally.isFacingNorth()){
                    wally.turnRight();
                    if(wally.isFacingNorth()){
                        wally.move();
                    }
                }
            //if statement to get the street 0, if not, turn right       
            }if(wally.getAvenue()==0){
                    if(wally.getStreet()>0){
                    if(wally.isFacingWest()){
                        wally.move();
                    }while(!wally.isFacingWest()){
                        wally.turnRight();
                        if(wally.isFacingWest()){
                            wally.move();
                        }
                    }
                }
            }
                
            
                
            
        }
        
        
    }
}
