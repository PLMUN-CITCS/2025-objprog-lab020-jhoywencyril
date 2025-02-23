public class MenuDrivenProgram {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int choice;

        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                handleMenuChoice(choice);
            } else {
                System.out.println("Invalid input! Please enter a number from the menu.");
                scanner.next(); // Consume invalid input
            }
        }
    }

    public static void displayMenu() {
        System.out.println("\n===== Menu =====");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even or Odd");
        System.out.println("3. Exit");
    }

    public static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                greetUser();
                break;
            case 2:
                checkEvenOrOdd();
                break;
            case 3:
                System.out.println("Exiting program. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice! Please enter a valid option.");
        }
    }

    public static void greetUser() {
        System.out.println("Hello! Welcome to our program.");
    }

    public static void checkEvenOrOdd() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter an integer: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " is an Even number.");
            } else {
                System.out.println(number + " is an Odd number.");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
            scanner.next(); // Consume invalid input
        }
    }
}
