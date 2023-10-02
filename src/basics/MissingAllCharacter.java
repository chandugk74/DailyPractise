package basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class MissingAllCharacter {
	public static void main(String[] args) {
		  
        String userInput = "chandra";
        userInput= userInput.replaceAll(" ", "");
               
        // Creating a String array containing each character of user input
        String [] inputStringArray = userInput.split("");
                 
        // Creating a String array containing alphabets
        String alphabets[]= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
                 
        // Creating HashSet to find intersections
        HashSet<String> s1 = new HashSet<String>(Arrays.asList(inputStringArray));
        HashSet<String> s2 = new HashSet<String>(Arrays.asList(alphabets));
         
        System.out.println("User Input in set :"+s1);
        System.out.println("Alphabets :"+s2);
         
        // Intersection of above sets
        s2.removeAll(s1);
         
       // Missing alphabets
        System.out.println("Missing alphabets :"+ s2);
	}
}
