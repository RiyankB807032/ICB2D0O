/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * Riyank Berde 807032
   Date: 9/26/2024
   Course: Grade 10 COmp Sci
   Title: Assignment 1
   Description: A program which outputs a series of numbers based on a algorithm
 */
public class Assignment1 {
    
   /* Variable dictionary
    recwidth - gets the rectangles width
    reclength - Gets the rectangles length
    circlerad - gets the circles radius
    cylinderh - gets the cylinders height
    cylinderrad - gets the cylinders radius
    L - gets the meters
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("In order, I will calculate the area of a rectangle, "); // prints the sentence
        System.out.println("the area of a circle, "); // prints the sentence
        System.out.println("surface area and volume of a cylinder "); // prints the sentence
        System.out.println("The period is the time it takes for a pendulum to make one back-and-forth swing "); // prints the sentence
        System.out.println("The period is the time it takes for a pendulum to make one back-and-forth swing "); // prints the sentence
        System.out.println("Enter the width"); // prints the sentence
        int recwidth =  scanner.nextInt(); // getss the user input of the width
        System.out.println("Enter the length"); // prints the sentence
        int reclength =  scanner.nextInt(); // gets the user input of the length
        System.out.println("The area is: "); // prints the sentence
        System.out.println(recwidth * reclength); // multiplies  
        System.out.println("I will now compute the area of a circle, enter the radius "); // prints the sentence
        int circlerad =  scanner.nextInt(); //gets the user input of the radius
        System.out.println("The area of the circle is: "); // prints the sentence
        System.out.println(Math.PI * circlerad * circlerad); //multiplies PI by the radius^2
        System.out.println("I will now compute the surface area and volume of a cylinder, I will compute the volume first, enter the height. "); // prints the sentence
        int cylinderh =  scanner.nextInt(); //gets the user input of height
        System.out.println("Now enter the radius "); // prints the sentence
        int cylinderrad =  scanner.nextInt(); //gets the user input of radius
        System.out.println("The volume is " + Math.PI * cylinderrad * cylinderrad * cylinderh); //multiplies PI by radius^2 by the height
        System.out.println("The surface area is " +  2 * Math.PI * cylinderrad * cylinderh + 2 * Math.PI * cylinderrad * cylinderrad); // 2 * PI * rad * height * 2
        System.out.println(" I will now calculate the period is the time it takes for a pendulum to make one back-and-forth swing, now enter the meters "); // prints the sentence
        int L  =  scanner.nextInt(); //gets the input for meters
        System.out.println("The time for one swing is " + 2 * Math.PI * Math.sqrt(L/9.0)); // 2 * PI and the squareroot of meters/9
        
               
    }
}
