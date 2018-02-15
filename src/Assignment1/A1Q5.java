/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author shnag4707
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City miami = new City();
                
        //create robot1 in the house
        RobotSE wally = new RobotSE(miami, 3, 3, Direction.EAST);
        
        
        //create robot2 the neighbor
        RobotSE maria = new RobotSE(miami, 0, 1, Direction.WEST);
        
        
        //write the letter k on robot1
        wally.setLabel("K");
        
        //write letter m on robot2
        maria.setLabel("M");
        
        //create house
        new Wall(miami, 3, 3, Direction.SOUTH);
        new Wall(miami, 3, 3, Direction.EAST);
        new Wall(miami, 2, 3, Direction.EAST);
        new Wall(miami, 2, 3, Direction.NORTH);
        new Wall(miami, 2, 3, Direction.WEST);
        
        //create things
        new Thing(miami, 2, 2);
        new Thing(miami, 1, 2);
        new Thing(miami, 1, 1);
        new Thing(miami, 1, 0);
        new Thing(miami, 0, 0);
        
        //create moves for Robot2 - pick things and meet karl
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        maria.turnLeft();
        maria.pickThing();
        maria.move();
        maria.pickThing();
        
      
        //create moves for robot1- leave house, pick things and meet maria
        wally.turnAround();
        wally.move();
        wally.turnRight();
        wally.move();
        wally.pickThing();
        wally.move();
        wally.pickThing();
        wally.turnLeft();
    }
}
