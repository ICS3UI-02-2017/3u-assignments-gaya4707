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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city for robot
        City miami = new City ();
        
       // create robot
        RobotSE karel = new RobotSE(miami, 1, 2, Direction.SOUTH);
        
        //change color
        karel.setColor(Color.black);
                
       //create walls
       new Wall(miami, 1, 1, Direction.NORTH);
       new Wall(miami, 1, 2, Direction.NORTH);
       new Wall(miami, 1, 1, Direction.WEST);
       new Wall(miami, 2, 1, Direction.WEST);
       new Wall(miami, 2, 1, Direction.SOUTH);
       new Wall(miami, 1, 2, Direction.SOUTH);
       new Wall(miami, 1, 2, Direction.EAST);
       
       //create thing
       new Thing(miami, 2, 2)
       
       //robot leave house
       karel.turnRight();
       karel.move();
       karel.turnLeft();
       karel.move();
       karel.turnLeft();
       karel.move();
       
       //robot pick up newspaper
       karel.pickThing();
       
       //robot return to bed 
       karel.turnAround();
       karel.move();
       karel.turnRight();
       karel.move();
       karel.turnRight();
       karel.move();
       karel.turnLeft(3);
       
       
       
       
       
       
       
       
        
        
        
        
        
        
        
        
    }

    private static void Wall(City miami, int i, int i0, Direction direction) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
