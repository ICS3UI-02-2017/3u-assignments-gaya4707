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
import java.awt.Color;

/**
 *
 * @author shnag4707
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city for robot
        City miami = new City ();
        
        //create black robot
        RobotSE wally = new RobotSE(miami, 3, 0, Direction.EAST);
        wally.setColor(Color.black);
                
        //create mountatin
        new Wall(miami, 3, 2, Direction.WEST);
        new Wall(miami, 3, 2, Direction.NORTH);
        new Wall(miami, 2, 3, Direction.WEST);
        new Wall(miami, 1, 3, Direction.WEST);
        new Wall(miami, 1, 3, Direction.NORTH);
        new Wall(miami, 1, 3, Direction.EAST);
        new Wall(miami, 2, 4, Direction.NORTH);
        new Wall(miami, 2, 4, Direction.EAST);
        new Wall(miami, 3, 4, Direction.EAST);
        
        //create Flag
        new Thing(miami, 3, 1);
        
        //robot pick up flag
        wally.move();
        wally.pickThing();
        
        //robot climb to top of mountain
        wally.turnLeft();
        wally.move();
        wally.turnRight();
        wally.move();
        wally.turnLeft();
        wally.move(2);
        wally.turnRight();
        wally.move();
        
        //put down flag
        wally.putThing();
        
        //robot climb down mountain
        wally.move();
        wally.turnRight();
        wally.move();
        wally.turnLeft();
        wally.move();
        wally.turnRight();
        wally.move(2);
        wally.turnLeft();
        
        
        
        
        
        
        
        
        
    }

    private static void Wall(City miami, int i, int i0, Direction direction) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
