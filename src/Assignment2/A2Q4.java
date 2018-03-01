/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author shnag4707
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City miami = new City();

        //create robot
        RobotSE wally = new RobotSE(miami, 0, 0, Direction.EAST);

        //create castlte
        new Wall(miami, 1, 1, Direction.NORTH);
        new Wall(miami, 1, 1, Direction.SOUTH);
        new Wall(miami, 1, 1, Direction.EAST);
        new Wall(miami, 1, 1, Direction.WEST);
        new Wall(miami, 1, 4, Direction.NORTH);
        new Wall(miami, 1, 4, Direction.SOUTH);
        new Wall(miami, 1, 4, Direction.EAST);
        new Wall(miami, 1, 4, Direction.WEST);
        new Wall(miami, 4, 1, Direction.NORTH);
        new Wall(miami, 4, 1, Direction.SOUTH);
        new Wall(miami, 4, 1, Direction.EAST);
        new Wall(miami, 4, 1, Direction.WEST);
        new Wall(miami, 4, 4, Direction.NORTH);
        new Wall(miami, 4, 4, Direction.SOUTH);
        new Wall(miami, 4, 4, Direction.EAST);
        new Wall(miami, 4, 4, Direction.WEST);
        new Wall(miami, 2, 2, Direction.NORTH);
        new Wall(miami, 2, 2, Direction.WEST);
        new Wall(miami, 2, 3, Direction.NORTH);
        new Wall(miami, 2, 3, Direction.EAST);
        new Wall(miami, 3, 2, Direction.WEST);
        new Wall(miami, 3, 2, Direction.SOUTH);
        new Wall(miami, 3, 3, Direction.EAST);
        new Wall(miami, 3, 3, Direction.SOUTH);

        //get to starting position- in middle of box
        wally.move();

        //loop- to go around the boxes(corners)
        while (wally.frontIsClear()) {
            wally.move();
            wally.turnRight();
            wally.move();
            //if stuck at wall, go close to the walls
            while (!wally.frontIsClear()) {
                wally.turnLeft();
                wally.move();
                wally.turnLeft();
                wally.move();
                wally.turnRight();
                wally.move();
            }
        }
    }
}
