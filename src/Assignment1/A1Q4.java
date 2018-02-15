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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City miami = new City();
        
                
        //create robot1
        RobotSE wally = new RobotSE(miami, 0, 0, Direction.SOUTH);
        wally.setColor(Color.black);
        
        //create robot2
        RobotSE eve = new RobotSE(miami, 0, 1, Direction.SOUTH);
        eve.setColor(Color.white);
        
        //create walls
        new Wall(miami, 0, 1, Direction.WEST);
        new Wall(miami, 1, 1, Direction.WEST);
        new Wall(miami, 1, 1, Direction.SOUTH);
        
         new Thread(){
            public void run(){
                // do things for a robot
                wally.move();
                wally.move();
                wally.move();
                wally.move();
            }
        }.start();
        
        eve.move();
        eve.turnLeft();
        eve.move();
            
            
    }
        }

        
