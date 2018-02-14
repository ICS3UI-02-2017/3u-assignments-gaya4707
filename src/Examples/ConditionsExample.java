/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author shnag4707
 */
public class ConditionsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City kw = new City();
        
        //create a robot
        RobotSE wally = new RobotSE(kw, 2, 1, Direction.EAST);
        
        //create a wall infront
        new Wall (kw, 2, 5, Direction.EAST);
        
        // place a few things
        new Thing(kw, 2, 2);
        new Thing (kw, 2, 4);
        
        //move while front is clear
        while(wally.frontIsClear()){
            //if yes , do this thing
            wally.move();
            
            //is there something to pick up?
            if(wally.canPickThing()){
                wally.pickThing();
            }
        }
        //when front is not clear
        wally.turnRight();
        
        //do you have 1 thing in your backpack? 
        if(wally.countThingsInBackpack()== 1){
            wally.move();
        }else if(wally.countThingsInBackpack()== 2){
            wally.move(2);
        }else{
            wally.turnAround();
        }
     
    }
}
