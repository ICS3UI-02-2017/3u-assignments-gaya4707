package FinalAssignment;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
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
    //create color of button
    Color Purple = new Color(141, 83, 229 );
    //create a empty variable for changing the color
    Color change = null;
    //create boolean to control weather letter is wrong or right - set to true 
    boolean letter = true;
    //create integer for the random number of word in the array
    //create the random number(between 0 and 120)
    int randNum = (int) (Math.random() * (120));
    //create variable for how wide the line for word is
    int widthLine = 50;
    //create variable for how long the space between 2 lines is
    int spaceWidth = 15;
    //create variable for y variable for allll lines
    int y = 250;
    //create the variable of legth of word equal 0
    int length = 0;
    //create empty array to be filled with words bank
    String[] gameWords = null;
    //create empty array to store x variables of all 1st dots of word lines
    int[] X1s = new int[0];
    //create empty array to store x variables of all 2nd dots of word lines
    int[] X2s = new int[0];
    
    //create rectangle variables for button
    Rectangle button = new Rectangle(220, 3*HEIGHT/4, 200, 50);
    

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public hangingMan() {
        preSetup();
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
        
        gameTimer = new Timer(desiredTime, this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        //use adavnced graphics class
        Graphics2D g2D = (Graphics2D) g;
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
        g.drawLine(430, HEIGHT - 70, WIDTH - 80, HEIGHT - 70);
        g.drawLine(430, HEIGHT - 70, 430, 370);
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


        //set colour back to black to draw the lines for letters
        g.setColor(Color.BLACK);

        //get length of the word
        length = gameWords[randNum].length();
        //run the lines method to get the arrays of Xs for 1st points and 2nd points
        createLinesOfWords();
        //output lines for letters corresponding to length of word
        for (int i = 0; i < length; i++) {
            g.drawLine(X1s[i], y, X2s[i], y);
        }
        
        //set colour to purple
        g.setColor(Purple);
        //pressent to the user a button ogf restarting the game
        g.fillRect(button.x, button.y, button.width, button.height);
        //set color back to black 
        g.setColor(Color.BLACK);
        g.drawString("Restart", 250, 635);
        

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
        gameWords = new String[numwords];
        //create for loop to read in the words and put them in the array of words
        for (int i = 0; i < numwords; i++) {
            String word = in.nextLine();
            gameWords[i] = word;
        }


    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        //create lines for amount of letters
        createLinesOfWords();
        //check letter of user
        //change color of each line if letter is wrong using bolean
        
        System.out.println(randNum +": "+gameWords[randNum]);
        //if restart button clicked restart game
        buttonpressed();
    }

    private void createLinesOfWords() {
        //get legth of the word
        length = gameWords[randNum].length();
        //create array for amount of letters in word
        X1s = new int[length];
        //create array for amount of letters in word
        X2s = new int[length];
        
        //save the first x spot in the X1s array as 50
        X1s[0] = 100;
        //save the first x spont in the X2s array as 50 plus the line's width
        X2s[0] = widthLine+100;
        

        //create array to store x varibles of each 1st dot of word line
        for (int i = 1; i < length; i++) {
            //save the spot as the previous 1st dot x value + the width of the line and the width of the spot between lines
            X1s[i] = X1s[i - 1] + widthLine + spaceWidth;
        }
        //create array to store x variables of each 2nd dot of word line
        for (int i = 1; i < length; i++) {
            //save the spot of 2nd dot as the prevous spot + width of line+ width of spacve between lines
            X2s[i] = X2s[i - 1] + widthLine + spaceWidth;
        }
    }

    private void buttonpressed() {
        //if player pressed button -restart game
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
