/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author shnag4707
 */
public class A1Q1 {
    private static Direction Direction;

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        
        // create city for robot
        City nashville = new City();
                
        // create robot
        RobotSE wally = new RobotSE(nashville, 0, 2, Direction.WEST);
        
        //change robot colour
        wally.setColor(Color.black);
        
        // create walls
        new Wall (nashville, 1, 2, Direction.NORTH);
        new Wall (nashville, 1, 1, Direction.NORTH);
        new Wall (nashville, 1, 1, Direction.WEST);
        new Wall (nashville, 2, 1, Direction.WEST);
        new Wall (nashville, 2, 2, Direction.SOUTH);
        new Wall (nashville, 2, 1, Direction.SOUTH);
        new Wall (nashville, 1, 2, Direction.EAST);
        new Wall (nashville, 2, 2, Direction.EAST);
        
        //move robot around walls counterclockwise to starting position
        wally.move(2);
        wally.turnLeft();
        wally.move(3);
        wally.turnLeft();
        wally.move(3);
        wally.turnLeft();
        wally.move(3);
        wally.turnLeft();
        wally.move();
                
                
    }

    private static void Wall(City nashville, int i, int i0, Direction direction) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
