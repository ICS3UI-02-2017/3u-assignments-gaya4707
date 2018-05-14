package Assignment8;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import static javafx.scene.paint.Color.color;
import javax.swing.Timer;

/**
 *
 * @author shnag4707
 */
public class face extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 800;

    //Title of the window
    String title = "My Game";

    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // YOUR GAME VARIABLES WOULD GO HERE
    //cretae skin colour
    Color skin = new Color(255, 163, 100);
    
    //create colour for eyebrows
    Color eyebrows = new Color(140, 72, 16);
    
    //create colour for hair
    Color blonde = new Color(239, 243, 14);


    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public face(){
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
        
        gameTimer = new Timer(desiredTime,this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        //  clear the screen first
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        //pick a colour
        
        //create circle outline to be aresed later
        g.drawOval(150,150, 400, 400);
        //cretae facial guidelines through it ro be areased later
        g.drawLine(150, 350, 550, 350);
        g.drawLine(350, 150, 350, 550);
        
        
        
        //set colour to skin
        g.setColor(skin);
        //create jawline
        g.fillRoundRect(150, 350, 390, 210, 45, 90);
        g.fillArc(160, 400, 370, 250, 180, 180);
        g.fillArc(300, 610, 90, 60, 180, 180);
        
        //colour in the round face
        g.fillOval(150, 150, 400, 400);
        
        //set colou to black
        g.setColor(Color.BLACK);
        
        //create outline of eyes on the horizontal line
        //top left eye
        g.drawArc(110,315, 250, 220, 45, 60);
        //bottom left
        g.drawArc(195, 205, 220, 170, 200, 35);
        //top right eye 
        g.drawArc(340,315,250,220,74,60);
        //bottom right
        g.drawArc(290, 200, 220, 170, 300, 35);
        
        //draw the nose using 2 arches
        g.drawArc(365, 450, 70, 90, 140, 20);
	g.drawArc(270, 465, 70, 90, 40, 25);
        
        //change to eyebroe colour
        g.setColor(eyebrows);
        //draw eyebows using triangle shapes
        // create x and y set for right eyebrow
        int[] rightX = {357, 380, 500, 530, 500};
        int[] rightY = {330, 330, 290, 310, 280};
        //cretae right eyebrow pantagon
        g.fillPolygon(rightX, rightY, 5);
        //create x and y set for left eyebrow
        int[] leftX = {350, 327, 207, 177, 207};
        int[] leftY = {330, 330, 290, 310, 280};
        //create left eyebrow pantagon
        g.fillPolygon(leftX, leftY, 5);
        
        //change color back to black
        g.setColor(Color.BLACK);
        //create a smaile using arch and a line
        g.drawArc(190, 460, 300, 100, 280, 90);
        g.drawLine(290, 565, 335, 560);
        
        //create ears using arches
        g.drawArc(490, 310, 100, 150, 270, 150);
        g.drawArc(100, 310, 100, 150, 120, 150);
        //add the inside of ears using lines
        g.drawLine(130, 350, 150, 410);
        g.drawLine(570, 355, 540, 415);
        
        //change color to blonde
        g.setColor(blonde);
        //create pentagon that is his hair
        //set x and y coordinates
        int[]  hairX = {150, 125, 110, 270, 273};
        int[]  hairY = {360, 320, 70, 20, 30, 23};
        //create the pentagon
        g.fillPolygon(hairX, hairY, 5);
        
        
        
        
		
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        
    }

    private void drawArc(int i, int i0, int i1, int i2, int i3, int i4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {

        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {

        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {

        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {

        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        preSetup();
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        face game = new face();
    }
}

