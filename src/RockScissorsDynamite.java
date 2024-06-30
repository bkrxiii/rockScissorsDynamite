import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RockScissorsDynamite {
    // keep score in here
    List<String> playerScore = new ArrayList<>();
    List<String> botScore = new ArrayList<>();
    public static void main(String[] args) {

        // creating the objects
        SetupGame setup = new SetupGame();
        Turn turn = new Turn();

        // Welcome
        System.out.print("Welcome to Rock Scissors Dynamite -- because paper never made sense.");

        // setup game
        String playerName = setup.askForPlayerName();
        int turnCounter = setup.howManyTurns();

        // take turns
        turn.makeTurn(turnCounter);

    }
    // add score of round
    public void scoring(String s) {
        if (Objects.equals(s, "player")) {
            playerScore.add(s);
        }
        if(Objects.equals(s, "bot")) {
            botScore.add(s);
        }
        if(Objects.equals(s, "invalid")) {
            throw new IllegalArgumentException("Error: Invalid input. This line should never be reached.");
        }
    }
}
