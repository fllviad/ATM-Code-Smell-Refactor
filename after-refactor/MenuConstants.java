
// Refactor for Magic Number
// Original code used literal '4' for exit option
// Solution: Replace with named constant

public class MenuConstants {
    public static final int EXIT_OPTION = 4;

    public static void main(String[] args) {
        int choice = 4; // Simulating user input
        if (choice == EXIT_OPTION) {
            System.out.println("Exiting program...");
            System.exit(0);
        }
    }
}
