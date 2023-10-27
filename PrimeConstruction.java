import java.util.Scanner;

public class SnakeAndLadder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the board configuration
        String[][] board = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = scanner.next();
            }
        }

        // Read the die inputs
        int[] dieInputs = new int[10];
        for (int i = 0; i < 10; i++) {
            dieInputs[i] = scanner.nextInt();
        }

        // Initialize player's position to Start
        int playerPosition = 0;

        // Initialize counters for snakes and ladders encountered
        int snakesEncountered = 0;
        int laddersEncountered = 0;

        // Simulate the player's movement based on die inputs
        for (int i = 0; i < 10; i++) {
            int dieRoll = dieInputs[i];

            // Move the player based on the die roll
            playerPosition += dieRoll;

            // Check if the player exceeds the board
            if (playerPosition > 99) {
                playerPosition = 99;
            }

            // Get the row and column for the current position
            int row = 9 - (playerPosition / 10);
            int col;
            if (row % 2 == 0) {
                col = playerPosition % 10;
            } else {
                col = 9 - (playerPosition % 10);
            }

            // Check if the current position has a snake or ladder
            if (board[row][col].startsWith("S")) {
                // Move down due to a snake
                int snakePosition = Integer.parseInt(board[row][col].substring(2));
                playerPosition = snakePosition;
                snakesEncountered++;
            } else if (board[row][col].startsWith("L")) {
                // Move up due to a ladder
                int ladderPosition = Integer.parseInt(board[row][col].substring(2));
                playerPosition = ladderPosition;
                laddersEncountered++;
            }

            // Check if the player has reached the End
            if (playerPosition == 99) {
                System.out.println("Possible " + snakesEncountered + " " + laddersEncountered);
                return;
            }
        }

        // Player couldn't reach the End
        System.out.println("Not possible " + snakesEncountered + " " + laddersEncountered + " " + playerPosition);
    }
}
