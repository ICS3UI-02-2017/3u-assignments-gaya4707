/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author shnag4707
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city for robot
        City miami = new City();

        // create robot
        RobotSE wally = new RobotSE(miami, 0, 2, Direction.EAST);
        
        //create things
        new Thing(miami, 0, 2);
        new Thing(miami, 0, 2);
        new Thing(miami, 0, 2);
        new Thing(miami, 0, 2);
        new Thing(miami, 0, 2);
        new Thing(miami, 0, 2);
        new Thing(miami, 0, 2);
        new Thing(miami, 0, 2);
        new Thing(miami, 0, 2);
        new Thing(miami, 0, 2);
        
        //create loop to pick thing, go 5 steps, and put it down
        for (int backAndForth = 0; backAndForth < 10; backAndForth++) {
            wally.pickThing();
            wally.move(5);
            wally.putThing();
            wally.turnAround();
            wally.move(5);
            wally.turnAround();
        }
        //move to stand on the pile
        wally.move(5);
    }
}
