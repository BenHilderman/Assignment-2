import java.util.Random;
import java.util.Scanner;

/**
 * Class RockPaperScissors.
 * Rock Paper Scissors game
 * @author  BenHilderman
 * @version 1.0
 * @since   2020-03-11
 */

public class RockPaperScissors {

  // Variables
  private static Scanner input;
  private static Random generator;

  /**
  * Rock Paper Scissors.
  */

  public static void main(String[] args) {

    // Variables
    String personPlay = null;
    String computerPlay = null;
    String readyToPlay;
    String replay;
    int computerInt;
    boolean win = false;
    boolean start = false;
    
    input = new Scanner(System.in);
    
    // Generate Random
    generator = new Random();

    System.out.println("Welcome to Rock, Paper, Scissors.");

    while (win == false) {
      System.out.println("Enter Rock, Paper or Scissors");
      personPlay = input.nextLine();

      // Generate Random Int
      computerInt = generator.nextInt(3);

      // List randomly chooses Rock, Paper, Scissors
      switch (computerInt) {
        case 0:
          if (computerInt == 0) {
            computerPlay = "Rock";
            
          }
          break;
        case 1:
          if (computerInt == 1) {
            computerPlay = "Paper";
            
          }
          break;
        case 2:
          if (computerInt == 2) {
            computerPlay = "Scissors";
            
          }
          break;
        
      }
      
      // Print tie if user input = computer play
      if (personPlay.equals(computerPlay)) {
        System.out.println("You chose: " + personPlay);
        System.out.println("The computer chose: " + computerPlay);
        System.out.println("Its a tie!");

      // If statements determine whether user wins, ties or loses
      } else if (personPlay.equals("Rock")) {
        if (computerPlay.equals("Scissors")) {
          System.out.println("Rock beats Scissors. You win!");
          win = true;
          System.out.println("Do you want to play again? (Yes or No)");
          replay = input.nextLine();
          if (replay.equals("No")) {
            start = false;
            win = true;
            System.out.println("Thank you for playing!");
          }
          if (replay.equals("Yes")) {
            win = false;
            
          }
          
        } else {
          // If statements determine whether user wins, ties or loses
          System.out.println("Paper beats rock. You lose.");
          System.out.println("Do you want to play again? (Yes or No)");
          replay = input.nextLine();
          
          if (replay.equals("No")) {
            start = false;
            win = true;
            System.out.println("Thank you for playing!");
          }
          if (replay.equals("Yes")) {
            win = false;
          }
        }
      } else if (personPlay.equals("Paper")) {
        // If statements determine whether user wins, ties or loses
        if (computerPlay.equals("Rock")) {
          System.out.println("Paper beats rock. You win!");
          win = true;
          System.out.println("Do you want to play again? (Yes or No)");
          replay = input.nextLine();
          
          if (replay.equals("No")) {

            start = false;
            win = true;
            System.out.println("Thank you for playing!");
          }
          if (replay.equals("Yes")) {
            win = false;
          }
    
        } else {
          // If statements determine whether user wins, ties or loses
          System.out.println("Scissors beat paper. You lose.");
          System.out.println("Do you want to play again? (Yes or No)");
          replay = input.nextLine();
          if (replay.equals("No")) {

            start = false;
            win = true;
            System.out.println("Thank you for playing!");
          }
          if (replay.equals("Yes")) {
            win = false;
          }
        }
      } else if (personPlay.equals("Scissors")) {
        // If statements determine whether user wins, ties or loses
        if (computerPlay.equals("Paper")) {
          System.out.println("Scissors beats paper. You win!");
          win = true;
          System.out.println("Do you want to play again? (Yes or No)");
          replay = input.nextLine();
          if (replay.equals("No")) {

            start = false;
            win = true;
            System.out.println("Thank you for playing!");
          }
          if (replay.equals("Yes")) {
            win = false;
          }
          
        } else {
      // If statements determine whether user wins, ties or loses
          System.out.println("Rock beats scissors. You lose.");
          replay = input.nextLine();
          
          if (replay.equals("No")) {
            System.out.println("Thank you for playing!");
            
          } else {
            win = false;
            
          }
          
        }
        
      }
      
    }
    
  }

}