import java.util.Random;
import java.util.Scanner;

/**
 * This program generates a random number based on user input.
 * 
 * @author Amin Zeina
 * @version 1.0
 * @since 2020-02-25
 */

 
public class DiceRoll {
  
  /**
  * This method generates a random number in a given range.
  */
 
  public static void rollDice(int minValue, int maxValue) {
    // Create random object to generate random number
    Random random = new Random();
    /* 
    Get random number from user's range, most straight forward and understandable way I found
    https://mkyong.com/java/java-generate-random-integers-in-a-range/ 
    */
    int randomNumber = random.nextInt((maxValue - minValue) + 1) + minValue;
    System.out.println("Random number: " + randomNumber);
  }
  
  /**
  * This class gets the range from user and calls rollDice function.
  */
    
  public static void main(String[] args) {
    
    // Declare variable
    int minValue;
    int maxValue;
    
    // Create scanner object
    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter minimum range number: ");
    try {
      // Get minimum range value from user
      minValue = userInput.nextInt();
      System.out.print("Enter maximum range number: ");
      try {
        // Get maximum range value from user
        maxValue = userInput.nextInt();
        if (maxValue > minValue) {
          // Call rollDice method to generate random number
          rollDice(minValue, maxValue);
        } else {
          System.out.print("Invalid input. The Max value must be greater than the Min value.");
        }
      } catch (Exception e) {
        System.out.print("Invalid input. Please enter an Integer.");
      }
    } catch (Exception e) {
      System.out.print("Invalid input. Please enter an Integer.");
    }
  }
}