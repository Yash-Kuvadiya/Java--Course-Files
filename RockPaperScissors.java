import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    // Rock - Paper - Scissor Game

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock-Paper-Scissors!");
        

        boolean play = true;
        while (play) {
            // Get player's choice
            System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissors, 4 to Restart, 5 to Exit.");
            System.out.print("Your choice: ");
            int playerChoice = sc.nextInt();

            if (playerChoice == 5) {
                System.out.println("Thanks for playing! Goodbye!");
                play = false; // Exit the game loop
                continue;
            }

            if (playerChoice == 4) {
                System.out.println("Game restarted!");
                continue; // Restart the game (loop continues)
            }

            // If input is between 0-2 then go for validation of R-P-S
            if (playerChoice < 0 || playerChoice > 2) {
                System.out.println("Invalid choice. Please enter 0, 1, 2, 4, or 5.");
                continue;
            }

            // Get computer's random choice of 3 integer
            int computerChoice = random.nextInt(3);

            // Display choices
            String[] choices = {"Rock", "Paper", "Scissors"};
            System.out.println("You chose: " + choices[playerChoice]);
            System.out.println("Computer chose: " + choices[computerChoice]);

            if (playerChoice == computerChoice) {
                System.out.println("It's a Tie!");
            } else if ((playerChoice == 0 && computerChoice == 2) || 
                       (playerChoice == 1 && computerChoice == 0) || 
                       (playerChoice == 2 && computerChoice == 1)) { 
                System.out.println("You Win!");
            } else {
                System.out.println("Computer Wins!");
            }

            System.out.println(); 
        }
    }
}
