/**
 * The Game class simulates a simple game where up to four players can join.
 * It keeps track of win history and records the specific winner of each game.
 */
public class Game {

    private String player1;
    private String player2;
    private String player3;
    private String player4;

    // String to store the history of wins
    private String winHistory;

    /**
     * Constructor to initialize the game with no players and an empty win history.
     */
    public Game() {
        player1 = null;
        player2 = null;
        player3 = null;
        player4 = null;
        winHistory = "";
    }

    /**
     * Adds a player to the game in the first available slot.
     * @param playerName the name of the player to add
     */
    public void addPlayer(String playerName) {
        if (player1 == null) {
            player1 = playerName;
            System.out.println(playerName + " has joined as Player 1.");
        } else if (player2 == null) {
            player2 = playerName;
            System.out.println(playerName + " has joined as Player 2.");
        } else if (player3 == null) {
            player3 = playerName;
            System.out.println(playerName + " has joined as Player 3.");
        } else if (player4 == null) {
            player4 = playerName;
            System.out.println(playerName + " has joined as Player 4.");
        } else {
            System.out.println("Cannot add more players. The game is full.");
        }
    }

    /**
     * Checks if there are at least two players in the game.
     * @return true if there are two or more players, false otherwise
     */
    public boolean hasEnoughPlayers() {
        int count = 0;
        if (player1 != null) count++;
        if (player2 != null) count++;
        if (player3 != null) count++;
        if (player4 != null) count++;

        return count >= 2;
    }

    /**
     * Records a win by a specified player if there are enough players in the game.
     * @param winner the name of the player who won
     */
    public void recordWin(String winner) {
        if (hasEnoughPlayers()) {
            if (winner.equals(player1) || winner.equals(player2) || winner.equals(player3) || winner.equals(player4)) {
                // Add the win to the history
                winHistory += "Win recorded by: " + winner + "\n";
                System.out.println("Win recorded for: " + winner);
            } else {
                System.out.println("The specified player is not part of this game.");
            }
        } else {
            System.out.println("Not enough players to record a win.");
        }
    }

    /**
     * Displays the history of all wins recorded in the game.
     */
    public void displayWinHistory() {
        if (winHistory.isEmpty()) {
            System.out.println("No wins recorded yet.");
        } else {
            System.out.println("Win History:");
            System.out.println(winHistory);
        }
    }
}
