package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	//

        // Mad Libs
        // Create a new project named MadLibs
        // Create a new repo in Github named MadLibs
        // In InteliJ create a new project named MadLibs
        // In Terminal navigate to your MadLibs project location
        // In terminal, use git init
        // Copy the Github SSH key for your new Github repo
        // In Terminal Setup the git remote named origin by using the Github SSH key you copied earlier
        // Stage and commit the init changes to your local repo
        // Push changes to Github
        // Create 3 size 5 arrays
        // One array should have 5 single word strings, each of which is a noun.
        //       One array should have 5 single word strings, each of which is an adjective.
        //        One array should have 5 single word strings, each of which is a verb.
        //        The Java Util class Random has a nextInt() method that can be used to get a random number from the range of zero to the number passed in as a parameter.
        //        Write a small story that randomly gets words from each array to fill in blank points in the story based on the word type.
        //        Don’t forget to stage and commit changes in git as you go along
        // Bonus: Get the words to fill each array by asking the user to supply them.

        String [] noun = {"Dog", "Computer", "Rabbit", "Cake", "Horse"};
        String [] adjective = {"shinny", "big", "green", "beautiful", "red"};
        String [] verb = {"run", "jump", "sleep", "stand", "sit"};

        Random random = new Random(System.currentTimeMillis());

        System.out.println("Once upon a time there was a " + noun[random.nextInt(5)]);
        System.out.println("However, it was an undercover " +noun[random.nextInt(5)]);
        System.out.println("The only thing it did was " +verb[random.nextInt(5)]);








    }
}
