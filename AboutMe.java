/*
 Programmer: Ericka Van Dongen
 Date: September 23 2020
 Purpose: To create a program about me 
 */

public class AboutMe {
    public static void main (String [] args) {
        // Declaring the variables
        String myName = "Ericka Van Dongen";
        int myAge = 15;
        double myHeightInMetres = 1.65;
        

        // Print the values
        System.out.println("Hi, my name is " + myName + ".");
        System.out.println("I am " + myAge + " years old.");
        System.out.println("My height is " + myHeightInMetres + " m.");

        // Change the variables
        myAge = 16 ;
        myHeightInMetres = 1.66 ;
        
        // Print the new values
        System.out.println("Some time passes...");
        System.out.println("I am now " + myAge + " years old.");
        System.out.println("I have grown and am " + myHeightInMetres + " m tall.");
    }
}
