/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author shnag4707
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city for robot
        City miami = new City();

        // create robot
        RobotSE wally = new RobotSE(miami, 0, 2, Direction.WEST);

        //change robot colour
        wally.setColor(Color.black);

        // create walls
        new Wall(miami, 1, 2, Direction.NORTH);
        new Wall(miami, 1, 1, Direction.NORTH);
        new Wall(miami, 1, 1, Direction.WEST);
        new Wall(miami, 2, 1, Direction.WEST);
        new Wall(miami, 2, 2, Direction.SOUTH);
        new Wall(miami, 2, 1, Direction.SOUTH);
        new Wall(miami, 1, 2, Direction.EAST);
        new Wall(miami, 2, 2, Direction.EAST);

        //get to initial starting position
        wally.turnAround();
        wally.move();
        wally.turnAround();

        //for loop to go around the circle twice
        for (int lapAroundBox = 0; lapAroundBox < 2; lapAroundBox++) {
            //create for loop to move by each wall 4 times
            for (int passOneWall = 0; passOneWall < 4; passOneWall++) {
                wally.move(3);
                wally.turnLeft();
            }

        }
        //go back to initial position
        wally.move();
    }
}
