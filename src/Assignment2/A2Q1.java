/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author shnag4707
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crete city
        City miami = new City();

        //create robot
        RobotSE wally = new RobotSE(miami, 1, 1, Direction.EAST);

        //create things
        new Thing(miami, 1, 2);
        new Thing(miami, 1, 3);
        new Thing(miami, 1, 4);
        new Thing(miami, 1, 5);
        new Thing(miami, 1, 6);
        new Thing(miami, 1, 7);
        new Thing(miami, 1, 8);
        new Thing(miami, 1, 9);
        new Thing(miami, 1, 10);
        new Thing(miami, 1, 11);



        //while statement to pick up 7 things
        while (wally.countThingsInBackpack() <= 6) {
            if (wally.frontIsClear()) {
                wally.move();
                wally.pickThing();
            }
            
        }
        //move robot to next spot
        wally.move();
        
            //while statemant to stop after it picked up 7 items
            while (wally.countThingsInBackpack() == 7) {
                if (wally.canPickThing()) {
                    wally.move();
                }
            }

    }
}
