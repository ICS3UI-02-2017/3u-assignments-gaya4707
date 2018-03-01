/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments4;

import java.util.Scanner;

/**
 *
 * @author shnag4707
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // introduce scanner
        Scanner input = new Scanner(System.in);
        
               
        //write "please enter your name" in the same line
        System.out.print("pleae enter your name: ");
        
        //introduce the name variale
        String name = input.nextLine();
       
        
        //welcome the user and use it's name
        System.out.println("hello there " + name + ", How you doin'?");
        
        
    }
}
