package FinalAssignment;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;
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
import javax.swing.JOptionPane;
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
    int desiredFPS = 10;
    int desiredTime = Math.round((1000 / desiredFPS));
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    // YOUR GAME VARIABLES WOULD GO HERE
    //custom create font of title of game
    Font gameTitle = new Font("Britannic Bold", Font.PLAIN, 42);
    //custom create fornt of unknown word
    Font letterFont = new Font("Arial Rounded MT Bold", Font.PLAIN, 42);
    //custon create font of the wrong letters pressed
    Font WrongLetterFont = new Font("Arial Rounded MT Bold", Font.BOLD, 26);
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
    Color Purple = new Color(141, 83, 229);
    //create a empty variables for changing the color
    Color change = backround;
    Color change1 = backround;
    Color change2 = backround;
    Color change3 = backround;
    Color change4 = backround;
    Color change5 = backround;
    Color change6 = backround;
    Color change7 = backround;
    Color change8 = backround;
    Color change9 = backround;
    Color change10 = backround;
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
    //create emply array to store the word characters in it
    char[] word = new char[length];
    //create blank space that will be converted into the line 
    char blankSpace = '~';

    //create aray for the colors of each line of the man drawing
    Color[] Change = new Color[11];

    //create boolean to decide if a line needed to be drawn- set to false
    boolean drawStick = false;
    
    
    
    

    public hangingMan(Timer gameTimer) {
        this.gameTimer = gameTimer;
    }
    //create rectangle variables for button
    Rectangle button = new Rectangle(220, 3 * HEIGHT / 4, 200, 50);
    //integer to get the x and y of user when mouse pressed
    int Xpressed = 0;
    int Ypressed = 0;
    //create character that is the letter the user presed
    char letter = '~';
    //create string to store the unknown word as a full (for comparing)
    String manString = "";
    //create the frame component for message 
    private Component frame;
    //options for user to select when failure message pops up   
    Object[] options = {"try again", "quit"};
    
    //create boolean to change if the user wins- set to false
    boolean win = false;
    //create integer to count the full spaces in the word - set to the legth of the word
    int full = 0;
    
    //create an empty character array to be filled by the wrong letters at the size of the amout of wrong trys
    char[] wrongLetter = new char[10];
    //create the initial x coordiante of the wrong letters
    int Xwrong = 10;
    //create an integer that will count up the wrong spots in the array of wrong letters
    int j = 0;
    

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
        //set colour of backround
        g.setColor(backround);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        //set colour back to black
        g.setColor(Color.BLACK);
        //set the custom font for tittle
        g.setFont(gameTitle);
        //write title of game in middle of sreen on top
        g.drawString("Hanging Man", 300, 50);
        //write instructions underneath title
        //draw the man in same color as backround
        g.setColor(backround);
        //call method to check if the letter is right
        drawManStick();
        //change color to the emplty variable that will change according to the user's input
        g.setColor(Change[0]);
        //set custom thickness of drawing
        g2D.setStroke(manLineThick);
        //draw the platform of man in bottom right cornor

        g.drawLine(430, HEIGHT - 70, WIDTH - 80, HEIGHT - 70);
        //turn colour to change 1
        g.setColor(Change[1]);

        g.drawLine(430, HEIGHT - 70, 430, 370);
        //turn colour to change 2
        g.setColor(Change[2]);

        g.drawLine(430, 370, 625, 370);
        //turn colour to change 3
        g.setColor(Change[3]);

        g.drawLine(625, 370, 625, 420);
        //turn colour to change 4
        g.setColor(Change[4]);

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
        //turn colour to change 5
        g.setColor(Change[5]);

        g.drawArc(603, 500, 50, 60, 40, 100);
        //change back the line thickness to draw man's body
        g2D.setStroke(manLineThick);
        //draw body and legs using lines
        //turn colour to change 6
        g.setColor(Change[6]);

        //body
        g.drawLine(625, 530, 625, 630);

        //turn colour to change 7
        g.setColor(Change[7]);

        //right leg
        g.drawLine(625, 630, 660, 700);

        //turn colour to change 8
        g.setColor(Change[8]);

        //left leg
        g.drawLine(625, 630, 590, 700);

        //turn colour to change 9
        g.setColor(Change[9]);

        //right arm
        g.drawLine(625, 550, 640, 610);

        //turn colour to change 10
        g.setColor(Change[10]);

        //left arm
        g.drawLine(625, 550, 610, 610);

        //set colour back to black to draw the lines for letters
        g.setColor(Color.BLACK);

        //get length of the word
        length = gameWords[randNum].length();
        //run the lines method to get the arrays of Xs for 1st points and 2nd points
        createLinesOfWords();
        //output lines for letters corresponding to length of word

        //go through the unknown word
        for (int i = 0; i < length; i++) {
            //if the charachter is unknown - draw the line
            if (word[i] == blankSpace) {
                g.drawLine(X1s[i], y, X2s[i], y);
            } else {
                //if letter is right draw the letter
                g.drawString("" + word[i], (X1s[i] + 7), y);
            }

        }

        //set colour to purple
        g.setColor(Purple);
        //pressent to the user a button ogf restarting the game
        g.fillRect(button.x, button.y, button.width, button.height);
        //set color back to black 
        g.setColor(Color.BLACK);
        g.drawString("Restart", 250, 635);
        
        //set the font to smaller for the wrong letters
        g.setFont(WrongLetterFont);
        //draw the wrong letters already preesed
        g.drawString("Wrong Letters: ", 50, 400);
        //go through the charachter of wrong letters
        Xwrong = 10;
        for (int i = 0; i < 10; i++) {
            //if a wrong letter was presssed
            if(wrongLetter[i]!='~'){
            //ouput it under the title of wrong letters
            g.drawString(wrongLetter[i]+", ", Xwrong, 450);
             Xwrong = Xwrong + 25;
        }
            //calculate the new x point that the next letter will be outputed at
           
        
        }
        

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

        //create array of charachters for the unknown word and the wrong letters
        arreyOfCharcters();
        
        System.out.println(randNum + ": " + gameWords[randNum]);
        //set the unknown word equal manString
        manString = gameWords[randNum];

        //create an array of strings to contain the color
        for (int i = 0; i < 11; i++) {
            Change[i] = backround;
        }
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {

        //create lines for amount of letters
        createLinesOfWords();

        //check if there was a letter pressed by the user
        checkIfLetterInputed();

        //if restart button clicked restart game
        buttonpressed();
        
        //crate a window that pops up if the user loses
        failure();
        
        //check if the user won- pop message if yes
        Success();
        
        
    }

    private void arreyOfCharcters() {
        //get legth of the word
        length = gameWords[randNum].length();

        //create the array the size of  the word
        word = new char[length];

        //fill that array in ~ 
        for (int i = 0; i < length; i++) {
            word[i] = blankSpace;
        }
        //fiil array of wrong letters in empty spaces as well
        for (int i = 0; i < 10; i++) {
            wrongLetter[i] = blankSpace;
        }
    }

    private void createLinesOfWords() {

        //create array for amount of letters in word
        X1s = new int[length];
        //create array for amount of letters in word
        X2s = new int[length];

        //save the first x spot in the X1s array as 50
        X1s[0] = 100;
        //save the first x spont in the X2s array as 50 plus the line's width
        X2s[0] = widthLine + 100;

        //go through the array of chatacters
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

    private void checkIfLetterInputed() {
        //if letter was pressed
        if (letter != '~') {
            //check the input
            checkInput();
        }
    }

    private void checkInput() {
        //assume letter is wrong
        drawStick = true;
        //go through the word array of charachters
        for (int i = 0; i < length; i++) {
            //if the letter inputed by user equals the char in the unknown spot
            if (manString.charAt(i) == letter) {
                //then the char in the word array is equal the letter
                word[i] = letter;
                //set boolean to false
                drawStick = false;
            
        }
        }
        //for each time its wrong, add the wrong letter to characters array
        if(drawStick == true&&letter!='~'){            
            //set the char of wrong letters to equal the letter inputed at the first spot
            wrongLetter[j] = letter;
            //add 1 to the j integer that counts the spotb of wrong letter
            j = j+1;
            
    }
            
        
        // 0 it out
        letter = '~';
        
        

    }

    private void drawManStick() {
        //if boolean draw stick is true
        if (drawStick == true) {
            //go through color change array
            for (int i = 0; i < 11; i++) {
                //check to see where to update colour change
                if (Change[i] == backround) {
                    //change first false in array to true
                    Change[i] = Black;
                    //resest the boolean of draw stick
                    drawStick = false;
                    //leave the loop
                    break;
                }
            }
        }
        
        

    }

    private void buttonpressed() {
        //if player pressed button -restart game
        if (button.contains(Xpressed, Ypressed)) {
            
            //cretae metghod to restart game
            restartGame();

        }

    }

    private void Success() {
        //reset the empty integer to 0 again
        full=0;
        //go through the charachter array, and if the letter is full and it to the count of full letters
        for (int i = 0; i < length; i++) {
            if(word[i]!='~'){
                full = full+1;
          }
        }
        
        //when there are no more empty spots(the full count is equal the elgth of tghe word) - set the boolean of win to true
        if(full ==length){
            //set the boolean of win to true
            win = true;
        }
        
         
        
        //if boolean win id true run the method of winning
        if(win==true){
            ////wait until the letter last guessed is drawn
            repaint();
            //call the method that outputs the mesage window
            winWindow();
        }
        
        
    }

    private void failure() {
        //if the last stick was drawen - pop message of losing
        if(Change[10]== Black){
        //ouput the message to ask if user want to restart game, or to completatly quit
        int n = JOptionPane.showOptionDialog(frame,
        //output to user
        "You Lose !",
        //name of message
        "result",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,     //do not use a custom Icon
        //the titles of buttons
        options,  
        //default button title
        options[0]); 
        
        
        //run method to check which buttons the user pressed
        ManipulateMessageButtons(n);
        }
         
    }
     private void winWindow() {
        //ouput the message to ask if user want to restart game, or to completatly quit
        int n = JOptionPane.showOptionDialog(frame,
        //output to user
        "Hurray! You won !",
        //name of message
        "result",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,     //do not use a custom Icon
        //the titles of buttons
        options,  
        //default button title
        options[0]);
        
        //run method to check which buttons the user pressed
        ManipulateMessageButtons(n);
        
        //set the boolean back to false once game was won
        win = false;
    }
     
     private void ManipulateMessageButtons(int n) {
        //get the integer that the user pressed
        //if pressed restart, restart game
        if(n==0){
            restartGame();
        }
        //if pressed quit, exit the game completaly
        if(n==1){
            System.exit(0);
        }
        }
    
    private void restartGame() {
        //create new random number
            randNum = (int) (Math.random() * (120));
            //reset the letter pressed to be an empty space again
            letter = '~';
            //restart game
            preSetup();
            
    }

    

   

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {
            //get x and y coordinayes to see if button restart preesed
            Xpressed = e.getX();
            Ypressed = e.getY();
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
            //once the user lets go of the mouse - set x and y coodinastes back to 0
            Xpressed = 0;
            Ypressed = 0;
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
            //get the letter pressed by user
            letter = e.getKeyChar();

            System.out.println(letter + "");

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
