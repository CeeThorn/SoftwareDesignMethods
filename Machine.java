import java.util.Scanner;

public class Machine {
    

    private static void swipeCard() {
        System.out.println("Swiping membership card..."); {
        
        }
    }
    private static void insertCoins() {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Welcome to the Arcade Machine!");
            System.out.println("1. Swipe membership card");
            System.out.println("2. Insert cash/coins");
            System.out.println("3. Exit");
            System.out.print("Please enter your choice: ");
            int choice = scanner.nextInt();

           

            switch (choice) {
                case 1:
                    swipeCard();
                    break;
                case 2:
                    insertCoins();
                    break;
                case 3:
                    System.out.println("Thank you for using the Arcade Machine!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
                }
        }
    }

}

 