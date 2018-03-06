/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments4;

import java.util.Scanner;

/**
 *
 * @author Gaya
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // introduce the input scanner
        Scanner input = new Scanner(System.in);
        
        //ask the user to write 4 numbers in separeate lines
        System.out.println("Please write 4 different numbers on separate lines: ");
        
        //introduce the variables with sapces in between(clear the enter keys from numbers)
        double numberOne = input.nextDouble();
        input.nextLine();
        double numberTwo = input.nextDouble();
        input.nextLine();
        double numberThree = input.nextDouble();
        input.nextLine();
        double numberFour = input.nextDouble();
        
        //present the numbers in order
        System.out.println("your numbers were: " + numberOne + ", " + numberTwo + ", " + numberThree + ", and " + numberFour);
        
        
    }
    
}
