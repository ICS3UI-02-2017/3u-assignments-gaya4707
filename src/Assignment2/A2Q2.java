/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author shnag4707
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City miami = new City();

        //create robot
        RobotSE wally = new RobotSE(miami, 1, 1, Direction.EAST);

        //crete floor
        new Wall(miami, 1, 0, Direction.SOUTH);
        new Wall(miami, 1, 1, Direction.SOUTH);
        new Wall(miami, 1, 2, Direction.SOUTH);
        new Wall(miami, 1, 3, Direction.SOUTH);
        new Wall(miami, 1, 4, Direction.SOUTH);
        new Wall(miami, 1, 5, Direction.SOUTH);
        new Wall(miami, 1, 6, Direction.SOUTH);
        new Wall(miami, 1, 7, Direction.SOUTH);
        new Wall(miami, 1, 8, Direction.SOUTH);
        new Wall(miami, 1, 9, Direction.SOUTH);

        //create 4 hurdles
        new Wall(miami, 1, 1, Direction.EAST);
        new Wall(miami, 1, 2, Direction.EAST);
        new Wall(miami, 1, 4, Direction.EAST);
        new Wall(miami, 1, 7, Direction.EAST);

        //create the finish line(Thing)
        new Thing(miami, 1, 9);

        //while loop to avoid obsticles
        while (!wally.canPickThing()) {
            //if statement to go around the obsticle
            if (!wally.frontIsClear()) {
                wally.turnLeft();
                wally.move();
                wally.turnRight();
                wally.move();
                wally.turnRight();
                wally.move();
                wally.turnLeft();
            } else {
                wally.move();
            }

        }
        //do nothing if reaches a thing
        if (wally.canPickThing()) {
        }

    }
}
