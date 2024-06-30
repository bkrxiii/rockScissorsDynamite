import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Turn {
    String[] validChoices = {"rock", "scissors", "dynamite"};

    public String makeTurn(int t) {
        System.out.print("Turn: " + t);
        String playerChoice = playerChoice();
        String botChoice = botChoice();
        return checkWhoWins(playerChoice, botChoice);
    }

    public String playerChoice() {
        Scanner s = new Scanner(System.in);
        String playerChoice = null;
        while (!Arrays.asList(validChoices).contains(playerChoice)) {
            System.out.print("Please enter your choice: 'rock', 'scissors' or 'dynamite'?");
            playerChoice = s.nextLine();
            playerChoice = playerChoice.toLowerCase();
            if (!Arrays.asList(validChoices).contains(playerChoice)) {
                System.out.print("Please select one of the three valid options above...");
            }
        }
        return playerChoice;
    }

    public String botChoice() {
        Random r = new Random();
        int randomIndex = r.nextInt(3);
        return validChoices[randomIndex];
    }

    public String checkWhoWins(String p, String b) {
        if (p.equals(b)) {
            return "draw";
        }
        switch (p) {
            case "rock":
                if (b.equals("scissors")) {
                    return "player";
                } else {
                    return "bot";
                }
            case "scissors":
                if (b.equals("dynamite")) {
                    return "player";
                } else {
                    return "bot";
                }
            case "dynamite":
                if (b.equals("rock")) {
                    return "player";
                } else {
                    return "bot";
                }
            default:
                return "invalid";
        }
    }
}