/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import java.awt.Color;

/**
 *
 * @author shnag4707
 */
public class A2QChallange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create City
        City miami = new City();
        
        //create robot1 - black
        RobotSE wally = new RobotSE(miami, 1, 2, Direction.SOUTH);
        wally.setColor(Color.black);
        
        //create robot2 - white
        RobotSE eve = new RobotSE(miami, 1, 2, Direction.SOUTH);
        eve.setColor(Color.white);
        
        //create the road , driveways and sidewalk
        
        
        
    }
}
