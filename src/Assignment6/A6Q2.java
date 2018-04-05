/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author shnag4707
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // introduce scanner
        Scanner input = new Scanner(System.in);
        
        //ask the user how many people are going to be measured
        System.out.print("How mny people are measured? ");
        
        //the input is the size of the array
        int size = input.nextInt();
        
        //create array of the size of that many people
        double[] height = new double[size];
        //create an array of name the size of that many people
        String[] names = new String[size];
        
        //ask the user of the name of the person each time(loop)
        for (int n = 0; n < height.length; n++) {
            System.out.print("Enter the name of the person:");
            String name = input.nextLine();
            //store he name in the array
             names[n] = name;
        }
        
        
    
                
        
    }
}
