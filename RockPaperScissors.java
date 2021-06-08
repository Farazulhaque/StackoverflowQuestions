import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        // initialising variable to 0 for score calculation
        int cScore = 0;
        int pScore = 0;
        int tie = 0;
        int rounds = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to play \"Rock, Paper, Scissors?\"");
        System.out.println("Answer \"Yes\" or \"No\"");
        String answer = input.next();
        if (answer.equalsIgnoreCase("yes")) {
            // Calling method letsPlay with arguments answer, cScore, pScore, tie, rounds
            // initially cScore = pScore = tie = rounds = 0
            letsPlay(answer, cScore, pScore, tie, rounds);
        }
    }

    // letsPlay Method
    public static void letsPlay(String answer, int cScore, int pScore, int tie, int rounds) {
        int cMove;
        int userMove;
        Random r = new Random();
        Scanner input = new Scanner(System.in);

        // loop untill user chose no
        while (true) {
            // to get random move of computer on every iteration
            cMove = r.nextInt(3) + 1;
            System.out.println("--------------------------------------------------");
            System.out.println("Choose your move!");
            System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
            userMove = input.nextInt();

            // loop until user input number 1 or 2 or 3
            while (userMove != 1 && userMove != 2 && userMove != 3) {
                System.out.println("Invalid move. Try again.");
                System.out.println("--------------------------------------------------");
                System.out.println("Choose your move: ");
                System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
                userMove = input.nextInt();
            }

            // Print statement for user move
            if (userMove == 1) {
                System.out.println("You have chosen Rock!");
            } else if (userMove == 2) {
                System.out.println("You have chosen Paper!");
            } else {
                System.out.println("You have chosen Scissors!");
            }

            // Print statement for computer move
            if (cMove == 1) {
                System.out.println("Computer chose Rock!");
            } else if (cMove == 2) {
                System.out.println("Computer chose Paper!");
            } else {
                System.out.println("Computer chose Scissors!");
            }

            // Winning, Loosing and Tie conditions
            // increment round to 1 every time
            // increment the winner, looser or tie on every iteration
            if (userMove == cMove) {
                System.out.println("Tie Game!");
                tie++;
                rounds++;
            } else if (cMove == 1 && userMove == 3) {
                System.out.println("Rock beats Scissors!");
                System.out.println("Computer Wins!");
                cScore++;
                rounds++;
            } else if (cMove == 1 && userMove == 2) {
                System.out.println("Paper beats Rock!");
                System.out.println("Player Wins!");
                pScore++;
                rounds++;
            } else if (cMove == 2 && userMove == 3) {
                System.out.println("Scissors beats Paper!");
                System.out.println("Player Wins!");
                pScore++;
                rounds++;
            } else if (cMove == 2 && userMove == 1) {
                System.out.println("Paper beats Rock!");
                System.out.println("Computer Wins!");
                cScore++;
                rounds++;
            } else if (cMove == 3 && userMove == 1) {
                System.out.println("Rock beats Scissors!");
                System.out.println("Player Wins!");
                pScore++;
                rounds++;
            } else if (cMove == 3 && userMove == 2) {
                System.out.println("Scissors beats Paper!");
                System.out.println("Computer Wins!");
                cScore++;
                rounds++;
            }

            // Asking again to play or not
            System.out.println("\nWould you like to play again?");
            System.out.println("Answer \"Yes\" or \"No\"");
            answer = input.next();

            if (answer.equalsIgnoreCase("yes")) {
                // If yes the call letsPlay(answer, cScore, pScore, tie, rounds);
                // But this time value of cScore, pScore, tie, rounds is changed
                // according to conditions
                letsPlay(answer, cScore, pScore, tie, rounds);
            } else {
                // Print if user says didn't want to play again
                System.out.println("==========================================");
                System.out.println("\nHere are the final scores after " + rounds + " rounds:");
                System.out.println("You      : " + pScore + "\nComputer : " + cScore + "\nTies     : " + tie);
            }
            // Exit if user didn't want to play again
            break;
        }
    }
}
