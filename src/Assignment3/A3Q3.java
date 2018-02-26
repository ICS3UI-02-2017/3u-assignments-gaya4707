/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author shnag4707
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City miami = new City();

        //create robot
        RobotSE wally = new RobotSE(miami, 1, 1, Direction.EAST, 20);

        //create a loop to plant 4 rows things and move to the next row
        for (int plantingInFourRows = 0; plantingInFourRows < 4; plantingInFourRows++) {
            //create loop to plant 5 seeds per row
            for (int plantingFiveSeeds = 0; plantingFiveSeeds < 5; plantingFiveSeeds++) {
                wally.putThing();
                wally.move();
                //create if else statement to turn and move to the next row to start the next row 9in the row for loop)
            }
            if (wally.isFacingEast()) {
                wally.turnRight();
                wally.move();
                wally.turnRight();
                wally.move();
            } else {
                wally.turnLeft();
                wally.move();
                wally.turnLeft();
                wally.move();

            }
        }

    }
}
