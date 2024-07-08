import java.util.Scanner;
public class SetupGame {
    Scanner scanner = new Scanner(System.in);
    public String askForPlayerName() {
        String name = "";
        while (name.isEmpty() || name.length() > 10) {
            System.out.print("Please enter your name: ");
            name = scanner.nextLine();
            if (name.length() > 10) {
                System.out.println("Please enter a user name no longer than 10 characters long.");
            }
            if (name.isEmpty()) {
                System.out.println("Please enter at least 1 character as your user name.");
            }
        }
        System.out.println("Welcome " + name + " let's play...");
        return name;
    }

    public int howManyTurns() {
        int turns = 0;
        while (turns < 1 || turns > 10) {
            System.out.print("How many turns do you want to play? ");
            turns = scanner.nextInt();
            if (turns < 1 || turns > 10){
                System.out.println("Please choose between 1 and 10 rounds...");
            }
        }
        return turns;
    }
}