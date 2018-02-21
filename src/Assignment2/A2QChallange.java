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
        new Wall(miami, 1, 0, Direction.WEST);
        new Wall(miami, 2, 0, Direction.WEST);
        new Wall(miami, 3, 0, Direction.WEST);
        new Wall(miami, 4, 0, Direction.WEST);
        new Wall(miami, 5, 0, Direction.WEST);
        new Wall(miami, 6, 0, Direction.WEST);
        new Wall(miami, 7, 0, Direction.WEST);
        new Wall(miami, 8, 0, Direction.WEST);
        new Wall(miami, 9, 0, Direction.WEST);
        new Wall(miami, 10, 0, Direction.WEST);
        new Wall(miami, 1, 1, Direction.EAST);
        new Wall(miami, 2, 1, Direction.EAST);
        new Wall(miami, 3, 1, Direction.EAST);
        new Wall(miami, 4, 1, Direction.EAST);
        new Wall(miami, 5, 1, Direction.EAST);
        new Wall(miami, 6, 1, Direction.EAST);
        new Wall(miami, 7, 1, Direction.EAST);
        new Wall(miami, 8, 1, Direction.EAST);
        new Wall(miami, 9, 1, Direction.EAST);
        new Wall(miami, 10, 1, Direction.EAST);
        new Wall(miami, 1, 2, Direction.EAST);
        new Wall(miami, 4, 2, Direction.EAST);
        new Wall(miami, 6, 2, Direction.EAST);
        new Wall(miami, 7, 2, Direction.EAST);
        new Wall(miami, 10, 2, Direction.EAST);
        new Wall(miami, 2, 3, Direction.NORTH);
        new Wall(miami, 2, 4, Direction.NORTH);
        new Wall(miami, 2, 5, Direction.NORTH);
        new Wall(miami, 2, 6, Direction.NORTH);
        new Wall(miami, 3, 3, Direction.SOUTH);
        new Wall(miami, 3, 4, Direction.SOUTH);
        new Wall(miami, 3, 5, Direction.SOUTH);
        new Wall(miami, 3, 6, Direction.SOUTH);
        new Wall(miami, 5, 3, Direction.NORTH);
        new Wall(miami, 5, 4, Direction.NORTH);
        new Wall(miami, 5, 5, Direction.NORTH);
        new Wall(miami, 5, 3, Direction.SOUTH);
        new Wall(miami, 5, 4, Direction.SOUTH);
        new Wall(miami, 5, 5, Direction.SOUTH);
        new Wall(miami, 8, 3, Direction.NORTH);
        new Wall(miami, 8, 4, Direction.NORTH);
        new Wall(miami, 8, 5, Direction.NORTH);
        new Wall(miami, 8, 6, Direction.NORTH);
        new Wall(miami, 8, 7, Direction.NORTH);
        new Wall(miami, 9, 3, Direction.SOUTH);
        new Wall(miami, 9, 4, Direction.SOUTH);
        new Wall(miami, 9, 5, Direction.SOUTH);
        new Wall(miami, 9, 6, Direction.SOUTH);
        new Wall(miami, 9, 7, Direction.SOUTH);
        new Wall(miami, 10, 2, Direction.SOUTH);
        new Wall(miami, 5, 5, Direction.EAST);
        new Wall(miami, 2, 6, Direction.EAST);
        new Wall(miami, 3, 6, Direction.EAST);
        new Wall(miami, 8, 7, Direction.EAST);
        new Wall(miami, 9, 7, Direction.EAST);

        //cretae snow on the deiveway and sidewalk
        new Thing(miami, 2, 2);
        new Thing(miami, 2, 3);
        new Thing(miami, 2, 4);
        new Thing(miami, 2, 5);
        new Thing(miami, 3, 2);
        new Thing(miami, 3, 4);
        new Thing(miami, 5, 2);
        new Thing(miami, 5, 3);
        new Thing(miami, 5, 4);
        new Thing(miami, 8, 2);
        new Thing(miami, 8, 3);
        new Thing(miami, 8, 7);
        new Thing(miami, 9, 3);
        new Thing(miami, 9, 4);
        new Thing(miami, 9, 6);

        //loop- robot 1 clean a driveway
        while (wally.frontIsClear()) {
            //walk one step and check idf there is a driveway and turn to face the driveway
            if (wally.isFacingSouth()) {
                wally.move();
                wally.turnLeft();
                //if facing a driveway shovel and move 1 step
                while (wally.frontIsClear()) {
                    wally.pickAllThings();
                    wally.move();
                }
                //once reached the end of driveway(if there is snow pick it up )and turn around and walk to the end of sidewalk to putdown all the snow
                if (!wally.frontIsClear()) {
                    if (wally.canPickThing()) {
                        wally.pickAllThings();
                    }
                    wally.turnAround();
                    while (wally.frontIsClear()) {
                        wally.move();

                    }
                    //if reached the sidewalk, dumpall the snow
                    if (wally.getAvenue() == 2) {
                        wally.putAllThings();
                        //after done, turn left
                        wally.turnLeft();
                    }
                }

            }


        }
        //create loop for eve to check each spot of the sidewalk and pick up snow if there is
        while (eve.frontIsClear()) {
            eve.move();
            if (eve.canPickThing()) {
                eve.pickAllThings();
            }
        }
        //once reached the end of sidewalk dunp all snow
        while (!eve.frontIsClear()) {
            eve.putAllThings();
        }




    }
}
