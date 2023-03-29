import java.util.Scanner;
public class ChooseGame {
    private static void playGame(String gameName, double costPerMinute, int minutes) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert cash/coins: $");
        double amount = scanner.nextDouble();

        System.out.println("1. Mortal Combat ($1 for 20 mins)");
        System.out.println("2. Fifa 2023 ($2 for 30 mins)");
        System.out.println("3. Race Arcade ($2.50 for 30 mins)");
        System.out.print("Please enter your game choice: ");
        int gameChoice = scanner.nextInt();

        switch (gameChoice) {
            case 1:
                playGame("Mortal Combat", amount, 20);
                break;
            case 2:
                playGame("Fifa 2023", amount, 30);
                break;
            case 3:
                playGame("Race Arcade", amount, 30);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }

}
