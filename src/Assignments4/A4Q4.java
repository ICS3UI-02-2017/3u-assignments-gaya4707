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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // introduce the scanner of the input
        Scanner input = new Scanner(System.in);
        
        //ask the user to write in all the coats for each detail for prom
        System.out.println("hi there prom planner, please enter the cost for each of these criaterias to create the best prom your school have seen:");
        System.out.print("how much does the food cost? ");
        
        //present the variable for each detail of the prom
        int food = input.nextInt();
        System.out.print("how much does the DJ cost? ");
        int dj = input.nextInt();
        System.out.print("how much does it cost to rent the hall? ");
        int rent = input.nextInt();
        System.out.print("how nuch money do you need for the decorations? ");
        int decorations = input.nextInt();
        System.out.print("How much does the the stuff cost? ");
        int stuff = input.nextInt();
        System.out.print("How much do you think the miscellaneous costs will be?  ");
        int lastCost = input.nextInt();
        
        //calculate the total cost and how many tickets(rounded to a decimal) need to be sold to cover expenses
        int totalCost = food + dj + rent + decorations + stuff + lastCost;
        int numberOfTickets = totalCost/35;
        System.out.print("The total cost for your prom is "+ totalCost+ " dollars. ");
        System.out.printf("You will need to sell at least %d tickets. ", numberOfTickets);
        //add a space
        System.out.print("\n");
        
        
        
        
    }
    
}
