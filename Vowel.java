/*
Brandon Miller
Exercise 14
March 30th 2017
ITSE 1302
*/

import java.util.Scanner;

public class Vowel {



     public static void main(String[] StrArgs) 
     {
         Scanner scan = new Scanner(System.in);     
         System.out.print("Enter a word: " ); //prompt
         String str = scan.next(); //Get the whole string
         char[] myChar = str.toCharArray(); //Turn the string into an array of char

    for (char c : myChar) { //For every char in the array
        switch (c) { //Check if it is a vowel or not, both capitalized and not.
            case 'a':     
            case 'A':     
            case 'e':     
            case 'E':     
            case 'i':     
            case 'I':     
            case 'o':     
            case 'O':     
            case 'u':     
            case 'U':    
                System.out.println(c + " is a Vowel");
                break;
            default:
                System.out.println(c + " is a Non-vowel");
                break;
        }
    
     }
   } 
} 
