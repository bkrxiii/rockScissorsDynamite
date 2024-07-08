import java.util.Objects;

public class Game {
    int playerScore = 0;
    int botScore = 0;

    public void game() {
        // creating the objects
        SetupGame setup = new SetupGame();
        Turn turn = new Turn();

        // Welcome
        System.out.println("Welcome to Rock Scissors Dynamite -- because paper never made sense.");

        String playerName = setup.askForPlayerName();
        int turnCounter = setup.howManyTurns();
        int counting_up = 1;

        System.out.println("Let's play a game with " + turnCounter + " rounds " + playerName + ".");

        while (turnCounter > 0) {
            String result_of_turn = turn.makeTurn(counting_up);
            counting_up++;
            turnCounter--;
            scoring(result_of_turn);
        }
        if (playerScore > botScore) {
            System.out.println("Congratulations, you win with " + playerScore + " against " + botScore);
        } else if (playerScore < botScore) {
            System.out.println("You lost with " + playerScore + " against " + botScore);
            System.out.println("Better luck next time...");
        } else {
            System.out.println("It's a draw.");
        }
    }
//    // add score of round
    public void scoring(String s) {
        assert s != null;
        if (Objects.equals(s, "player")) {
            System.out.println("Player scores 1 point.");
            playerScore++;
            System.out.println("Total scores: Player: " + playerScore + " bot: " + botScore);
        }
        if (Objects.equals(s, "bot")) {
            System.out.println("Bot scores 1 point.");
            botScore++;
            System.out.println("Total scores: Player: " + playerScore + " bot: " + botScore);
        }
        if (Objects.equals(s, "draw"))
            System.out.println("It's a draw.");
        {
            if (Objects.equals(s, "invalid")) {
                throw new IllegalArgumentException("Error: Invalid input. This line should never be reached.");
            }
        }
    }
}