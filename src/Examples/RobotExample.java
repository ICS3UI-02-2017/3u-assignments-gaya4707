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
import java.awt.Color;

/**
 * Learning how to use the robot
 * @author shnag4707
 */
public class RobotExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create a city for the robot
        City sanFransisco = new City();
        
        // put a robbot inn sanFransisco
        RobotSE wally = new RobotSE (sanFransisco, 2, 3, Direction.EAST);
        
        //put w on robot
        wally.setLabel("W");
        
        //set the colour of robot
        wally.setColor(Color.white);
        
        //create a wall
        new Wall(sanFransisco, 2, 5, Direction.WEST);
                
        // create a multiple things
        new Thing(sanFransisco, 2, 4);
        new Thing(sanFransisco, 6, 1);
        new Thing(sanFransisco, 6, 1);
        new Thing(sanFransisco, 6, 1);
        
        //move robot forward 1 space
        wally.move();
         
        //turn the robot to face down
        wally.turnRight();
        
        //pick up the thing
        wally.pickThing();
        
        //move the robot
        wally.move(3);
        
        //put down the thing
        wally.putThing();
        wally.move();
        
        //turn right
        wally.turnLeft(3);
        
        //move to pile of things
        wally.move(3);
        
        //pick up things
        wally.pickAllThings();
       
       
    }
}
