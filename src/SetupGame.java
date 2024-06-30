import java.util.Scanner;
public class SetupGame {
    public String askForPlayerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name + " let's play...");
        scanner.close();
        return name;
    }

    public int howManyTurns() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many turns do you want to play?");
        int turns = Integer.parseInt(scanner.nextLine());
        System.out.println(turns + " turns to play");
        scanner.close();
        return turns;
    }
}
