/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shnag4707
 */
public class ReadFile {
    
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("words"));
        } catch (FileNotFoundException ex) {
            
            ex.printStackTrace();
        }
        
        int numwords = in.nextInt();
        in.nextLine(); // clear return
        
        for(int i = 0; i < numwords; i++){
            String word = in.nextLine();
            System.out.println((i+1) + ": " + word);
        }
    }
}
