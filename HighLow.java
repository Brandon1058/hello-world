/*
Brandon Miller
ITSE 1301
3/21/17
*/

import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main (String[] args)
    {
       Random num = new Random(); 
       int numbertoGuess = num.nextInt(10);
       int numberofGuesses = 0;
       Scanner input = new Scanner(System.in); 
       int guess;
        
       boolean win = false;

       while (win == false) {

       System.out.println("Pick a number between 0 and 10");
       guess = input.nextInt();
       numberofGuesses++;

       if (guess == numbertoGuess) {
           win = true;
           System.out.println("You guessed the correct number!");
       }
       else if (guess < numbertoGuess) {
           System.out.println("Your guess is too low");
           
       }
       else if (guess >numbertoGuess)
           System.out.println("Your guess is too high");
    }
    
  }
}