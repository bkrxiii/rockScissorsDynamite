import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Turn {
    Scanner s = new Scanner(System.in);
    String[] validChoices = {"rock", "scissors", "dynamite"};

    public String makeTurn(int t) {
        System.out.println("Turn: " + t);
        String playerChoice = playerChoice();
        System.out.println(playerChoice);
        String botChoice = botChoice();
        System.out.println(botChoice);
        return checkWhoWins(playerChoice, botChoice);
    }

    public String playerChoice() {
        String playerChoice = null;
        while (!Arrays.asList(validChoices).contains(playerChoice)) {
            System.out.print("Please enter a valid choice from: 'rock', 'scissors' or 'dynamite'. ");
            playerChoice = s.nextLine();
            if (!Arrays.asList(validChoices).contains(playerChoice)) {
                System.out.println("Invalid input...");
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