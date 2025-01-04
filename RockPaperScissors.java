import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter 0 for Rock, \n 1 for Paper,\n 2 for Scissors:");

        // Get player's choice
        System.out.print("Your choice: ");
        int playerChoice = sc.nextInt();

        // Get computer's random choice
        int computerChoice = random.nextInt(3);

        // Display choices
        String[] choices = {"Rock", "Paper", "Scissors"};
        System.out.println("You chose: " + choices[playerChoice]);
        System.out.println("Computer chose: " + choices[computerChoice]);

        // Determine winner
        if (playerChoice == computerChoice) {
            System.out.println("It's a Tie!");
        } else if ((playerChoice == 0 && computerChoice == 2) || 
                   (playerChoice == 1 && computerChoice == 0) || 
                   (playerChoice == 2 && computerChoice == 1)) {
            System.out.println("You Win!");
        } else {
            System.out.println("Computer Wins!");
        }
    }
}
