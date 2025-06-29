import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playAgain;

        do {
            String moveA = "";
            String moveB = "";
            boolean validinputA = false;
            boolean validinputB = false;

            // Player A move and validation
            do {
                System.out.print("Player A, enter your move (R, P or S): ");
                moveA = in.nextLine().trim();
                if (moveA.equalsIgnoreCase("R") || moveA.equalsIgnoreCase("P") || moveA.equalsIgnoreCase("S")) {
                    validinputA = true;
                } else {
                    System.out.println("Your input is invalid. Please enter R, P or S.");
                }
            } while (!validinputA);

            // Player B move and validation
            do {
                System.out.print("Player B, enter your move (R, P, or S): ");
                moveB = in.nextLine().trim();
                if (moveB.equalsIgnoreCase("R") || moveB.equalsIgnoreCase("P") || moveB.equalsIgnoreCase("S")) {
                    validinputB = true;
                } else {
                    System.out.println("Invalid move. Please enter R, P, or S.");
                }
            } while (!validinputB);

            // result
            String result = "";
            if (moveA.equalsIgnoreCase(moveB)) {
                result = moveA.toUpperCase() + " vs " + moveB.toUpperCase() + " - It's a Tie!";
            } else if (moveA.equalsIgnoreCase("R") && moveB.equalsIgnoreCase("S")) {
                result = "Rock breaks Scissors - Player A wins!";
            } else if (moveA.equalsIgnoreCase("P") && moveB.equalsIgnoreCase("R")) {
                result = "Paper covers Rock - Player A wins!";
            } else if (moveA.equalsIgnoreCase("S") && moveB.equalsIgnoreCase("P")) {
                result = "Scissors cuts Paper - Player A wins!";
            } else {
                // All other cases mean Player B wins
                if (moveB.equalsIgnoreCase("R") && moveA.equalsIgnoreCase("S")) {
                    result = "Rock breaks Scissors - Player B wins!";
                } else if (moveB.equalsIgnoreCase("P") && moveA.equalsIgnoreCase("R")) {
                    result = "Paper covers Rock - Player B wins!";
                } else if (moveB.equalsIgnoreCase("S") && moveA.equalsIgnoreCase("P")) {
                    result = "Scissors cuts Paper - Player B wins!";
                }
            }

            System.out.println(result);

            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = in.nextLine().trim();

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("You have quit the game.");
    }
}