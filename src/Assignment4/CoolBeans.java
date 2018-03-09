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
public class CoolBeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //playing around with new stuff
        System.out.println("Hello fellow earthian");
        System.out.print("plaese present yourself: ");
        
        Scanner input = new Scanner(System.in);
        
        String name = input.nextLine();
        System.out.println("Hi " + name);
        System.out.println("Please pick a number from 1 to 10");
        
        int choiceNumber = input.nextInt();
        if(choiceNumber ==1){
            System.out.println(name + ", You will have 7 kids and live in a deseret with your 3 wives");
        }if(choiceNumber ==2){
            System.out.println(name + ", you are so nice and someone will probably take advantage of that.");
            System.out.println("Just keep being awesome and eat more choclate because no matter what life throws at you");
            System.out.println("chocolate will always make you feel better");    
        }if(choiceNumber ==3){
            System.out.println(name + ",you are a piece of paper");
        }if(choiceNumber ==4){
            System.out.println(name + ",you are a child of god");
        }else{
            System.out.println("what the f%ck man! I told you to pick from 1 to 10 !");
            System.out.println("Mr. " + name + ", you don't deserve my fortune!!!");
        }
        System.out.println("");
    }
}
