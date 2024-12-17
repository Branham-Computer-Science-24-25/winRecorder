import java.util.Scanner;

/**
 * The GameTester class tests the functionality of the Game class.
 * It allows adding player names, specifying winners, and recording wins.
 */
public class GameTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();

        System.out.println("Welcome to the Game Tester!");

        // Loop to add player names
        while (true) {
            System.out.println("\nOptions: \n1 - Add Player\n2 - Finish Adding Players \n3 - Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            if (choice == 1) {
                // Prompt user to enter the player's name
                System.out.print("Enter the player's name: ");
                String playerName = scanner.nextLine();
                game.addPlayer(playerName); // Add player to the game
            } else if (choice == 2) {
                // Exit the loop if finished adding players
                System.out.println("Finished adding players.");
                break;
            } else if (choice == 3) {
                // Exit the program entirely
                System.out.println("Exiting the game.");
                scanner.close();
                return;
            } else {
                // Handle invalid input
                System.out.println("Invalid choice. Please try again.");
            }
        }

        // Loop for game actions
        while (true) {
            System.out.println("\nOptions: \n1 - Record Win \n2 - View Win History \n3 - Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            if (choice == 1) {
                // Prompt user to specify the winner
                System.out.print("Enter the winner's name: ");
                String winner = scanner.nextLine();
                game.recordWin(winner); // Record the win for the specified player
            } else if (choice == 2) {
                // Display win history
                game.displayWinHistory();
            } else if (choice == 3) {
                // Exit the program
                System.out.println("Exited the game. Good bye!");
                break;
            } else {
                // Handle invalid input
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
