/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author shnag4707
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create City
        City miami = new City();
        
        //create robot
        RobotSE wally = new RobotSE(miami, 3, 3, Direction.SOUTH);
        
        //create 4 boxes
        new Wall (miami, 1, 2, Direction.NORTH);
        new Wall (miami, 1, 1, Direction.NORTH);
        new Wall (miami, 1, 1, Direction.WEST);
        new Wall (miami, 2, 1, Direction.WEST);
        new Wall (miami, 2, 2, Direction.SOUTH);
        new Wall (miami, 2, 1, Direction.SOUTH);
        new Wall (miami, 1, 2, Direction.EAST);
        new Wall (miami, 2, 2, Direction.EAST);
        
        new Wall (miami, 1, 5, Direction.NORTH);
        new Wall (miami, 1, 4, Direction.NORTH);
        new Wall (miami, 1, 4, Direction.WEST);
        new Wall (miami, 2, 4, Direction.WEST);
        new Wall (miami, 2, 5, Direction.SOUTH);
        new Wall (miami, 2, 4, Direction.SOUTH);
        new Wall (miami, 1, 5, Direction.EAST);
        new Wall (miami, 2, 5, Direction.EAST);
        
        new Wall (miami, 4, 2, Direction.NORTH);
        new Wall (miami, 4, 1, Direction.NORTH);
        new Wall (miami, 4, 1, Direction.WEST);
        new Wall (miami, 5, 1, Direction.WEST);
        new Wall (miami, 5, 2, Direction.SOUTH);
        new Wall (miami, 5, 1, Direction.SOUTH);
        new Wall (miami, 4, 2, Direction.EAST);
        new Wall (miami, 5, 2, Direction.EAST);
        
        new Wall (miami, 4, 5, Direction.NORTH);
        new Wall (miami, 4, 4, Direction.NORTH);
        new Wall (miami, 4, 4, Direction.WEST);
        new Wall (miami, 5, 4, Direction.WEST);
        new Wall (miami, 5, 5, Direction.SOUTH);
        new Wall (miami, 5, 4, Direction.SOUTH);
        new Wall (miami, 4, 5, Direction.EAST);
        new Wall (miami, 5, 5, Direction.EAST);
        
        //create a for loop to go around 4 box
        for (int lapAroundFourBoxes = 0; lapAroundFourBoxes < 4; lapAroundFourBoxes++) {
                //create a loop to go beside 3 walls
                for (int wallkingBesideFourWalls = 0; wallkingBesideFourWalls < 3; wallkingBesideFourWalls++) {
                    wally.move(3);
                    wally.turnLeft();
                }
                //walk bedside the last wall and start a new loop to go around the next box
                wally.move(3);
            
        }
        
    }
}
