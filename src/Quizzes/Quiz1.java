/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizzes;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author shnag4707
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
        City miami = new City();

        //create a robot
        RobotSE wally = new RobotSE(miami, 4, 0, Direction.EAST);

        //create staircase
        new Wall(miami, 4, 2, Direction.WEST);
        new Wall(miami, 4, 2, Direction.NORTH);
        new Wall(miami, 3, 3, Direction.WEST);
        new Wall(miami, 3, 3, Direction.NORTH);
        new Wall(miami, 2, 4, Direction.WEST);
        new Wall(miami, 2, 4, Direction.NORTH);
        new Wall(miami, 2, 5, Direction.EAST);
        new Wall(miami, 2, 5, Direction.NORTH);
        new Wall(miami, 3, 6, Direction.EAST);
        new Wall(miami, 3, 6, Direction.NORTH);
        new Wall(miami, 4, 7, Direction.EAST);
        new Wall(miami, 4, 7, Direction.NORTH);

        //create the candles on the staircase
        new Thing(miami, 4, 1);
        new Thing(miami, 3, 2);
        new Thing(miami, 2, 3);
        new Thing(miami, 1, 4);

        //move robot to be right on the bottom of the staircase
        wally.move();

        //cretae loop- pick up the candle then go up one stair when facing a wall, (move, turn to face up, move, turn right and move) .
        while (!wally.frontIsClear()) {
            if (wally.canPickThing()) {
                wally.pickThing();
            }
            wally.turnLeft();
            wally.move();
            wally.turnRight();
            wally.move();
        }
        //at the top of stairs, pick up the last candle, move one spot and put down one thing
        wally.pickThing();
        wally.move();
        wally.putThing();

        //create loop- go down the sair one at a time(opposite orders of going up stairs,) and leaving one candle at the time on each stair for all the candles in backpack.
        while (wally.countThingsInBackpack() > 0) {
            wally.move();
            wally.turnRight();
            wally.move();
            wally.turnLeft();
            wally.putThing();
        }
        //once put down the last candle move to final position
        wally.move();

    }
}
