package FinalAssignment;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.Timer;

/**
 *
 * @author shnag4707
 */
public class hangingMan extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 900;
    static final int HEIGHT = 800;

    //Title of the window
    String title = "Hanging Man";

    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // YOUR GAME VARIABLES WOULD GO HERE
    //custom create font of title of game
    Font gameTitle = new Font("Britannic Bold", Font.PLAIN, 42);
    
    //set custom line thickness for hangman drawing
    BasicStroke manLineThick = new BasicStroke(5);
    
    //set custom line thickness for the face
    BasicStroke faceLineThick = new BasicStroke(2);
    
    //create empty variable for scanner
    Scanner in = null;
    
    //variable of color for backnound
    Color backround = new Color(32, 228, 201);
    //variable for color of hangman
    Color Black = new Color(6, 6, 6);
    
    //create a empty variable for changing the color
    Color change = null;
    
    //create boolean to control weather letter is wrong or right - set to 
    boolean letter = true;
    
    //create integer for the random number of word in the array
    //create the random number(between 0 and 120)
    int randNum = (int)(Math.random()*(120));
    
    
    


    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public hangingMan(){
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
        preSetup();
        gameTimer = new Timer(desiredTime,this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        //use adavnced graphics class
        Graphics2D g2D = (Graphics2D)g;
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        //set color of backround
        g.setColor(backround);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        //set color back to black
        g.setColor(Color.BLACK);
        //set the custom font for tittle
        g.setFont(gameTitle);
        //write title of game in middle of sreen on top
        g.drawString("Hanging Man", 300, 50);
        //write instructions underneath title
        //draw the man in same color as backround
        g.setColor(backround);
        //change color to the emplty variable that will change according to the user's input
        g.setColor(change);
        //set custom thickness of drawing
        g2D.setStroke(manLineThick);
        //draw the platform of man in bottom right cornor
        g.drawLine(430, HEIGHT-70, WIDTH-80, HEIGHT-70);
        g.drawLine(430, HEIGHT-70, 430, 370);
        g.drawLine(430, 370, 625, 370);
        g.drawLine(625, 370, 625, 420);
        //draw man head
        g.drawOval(570, 420, 110, 110);
        //draw man face
        //change the thickness of the line to less for more specific drawings
        g2D.setStroke(faceLineThick);
        //draw eyes using x lines
        //left eye
        g.drawLine(595, 470, 615, 450);
        g.drawLine(595, 450, 615, 470);
        //right eye
        g.drawLine(635, 470, 655, 450);
        g.drawLine(635, 450, 655, 470);
        //draw sad mouth using arc
        g.drawArc(603, 500, 50, 60, 40, 100);
        //change back the line thickness to draw man's body
        g2D.setStroke(manLineThick);
        //draw body and legs using lines
        //body
        g.drawLine(625, 530, 625, 630);
        //right leg
        g.drawLine(625, 630, 660, 700);
        //left leg
        g.drawLine(625, 630, 590, 700);
        //right arm
        g.drawLine(625, 550, 640, 610);
        //left arm
        g.drawLine(625, 550, 610, 610);
        
        
        
        
        
        
        //set to draw number of lines as the word
        g.drawLine(100, 100, ERROR, ERROR);
		
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
        
        //set up an array of all the words to be used for the game
        //create a check to make sure if there is an arror it will output it in the box of output
        try {
            in = new Scanner(new File("words"));
        } catch (FileNotFoundException ex) {
            
            ex.printStackTrace();
        }
        //create variable to get the number of words that will go in that array
        int numwords = in.nextInt();
        in.nextLine(); // clear return
        
        //create THE array of words to use for the game
        String[] gameWords = new String[numwords];
        //create for loop to read in the words and put them in the array of words
         for(int i = 0; i < numwords; i++){
            String word = in.nextLine();
            gameWords[i] = word;
        }
         //make variable for lngtrh of word
         int length = gameWords[randNum].length();
        //output lines for letters corresponding to length of word
        for (int i = 0; i < length; i++) {
            
            
        }

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        //check lines
        //check letter of user
        //change color of each line if letter is wrong using bolean
        
        
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
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        hangingMan game = new hangingMan();
    }
}

