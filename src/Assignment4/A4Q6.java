/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author shnag4707
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // introduce scanner
        Scanner input = new Scanner(System.in);
        
        //ask the user to input the speed limit
        System.out.print("Enter the speed limit:  ");
        int speedLimit = input.nextInt();
        
        //ask the user to input the speed of it's car
        System.out.print("Enter your recorded speed of car: ");
        int carSpeed = input.nextInt();
        
        int speedOverLimit = carSpeed - speedLimit;
        
        //if statement for each casenario
        if(speedOverLimit<= 0){
            System.out.println("Congragulations! you are within the speed limit !");
        }if(speedOverLimit>=0 && speedOverLimit<=20){
            System.out.println("You are speeding! your fine is 100$");
        }if(speedOverLimit>20 && speedOverLimit<=30){
            System.out.println("You are speeding! your fine is 270$");
        }if(speedOverLimit>30){
            System.out.println("You are speeding ! your fine is 500$");
        }
           
        
        
    }
}
