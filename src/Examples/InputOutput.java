/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *
 * @author shnag4707
 */
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("More text here");
        System.out.print("Hello ");
        System.out.println("World");
        
        int year = 2018;
        System.out.println("The year is " + year);
        int count = 10;
        System.out.println(count);
        
        double pi = 3.141597;
        System.out.println("PI is approx. " + pi + " This is not rounded at all");
        System.out.printf("Pi is approx. %.2f. This is rounded to 2 decimal places. Year is %d \n", pi, year);
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        
        int yearBorn = 2018 - age;
        System.out.println("You are " + age + " years old.");
        System.out.println("You were born in " + yearBorn);
        input.nextLine(); // clear out the enter keys from the numbers
        
        System.out.println("Please enter your name");
        String name = input.nextLine();
        System.out.println("Hello " + name);
        
    }
}
