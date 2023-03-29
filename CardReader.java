import java.util.Scanner;
public class CardReader {
    private static void playGame(String gameName, double costPerMinute, int minutes) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please swipe your membership card: ");
        String cardNumber = scanner.nextLine();

        // TODO: Check if the card is valid and retrieve player information from the server

        System.out.println("Card balance: $20.00");
        System.out.println("1. Mortal Combat ($1 for 20 mins)");
        System.out.println("2. Fifa 2023 ($2 for 30 mins)");
        System.out.println("3. Race Arcade ($2.50 for 30 mins)");
        System.out.print("Please enter your game choice: ");
        int gameChoice = scanner.nextInt();

        switch (gameChoice) {
            case 1:
                playGame("Mortal Combat", 1, 20);
                break;
            case 2:
                playGame("Fifa 2023", 2, 30);
                break;
            case 3:
                playGame("Race Arcade", 2.5, 30);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
}
