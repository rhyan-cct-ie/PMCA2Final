/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pmca2final;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reg05
 */
public class PMCA2Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Initialise scanner for user input

        try {
        while (true) { // Main loop to show menu and execute tasks
            displayMenu(); // Display the menu of options

            int option = getUserChoice(sc); // Get valid user choice from menu

            // Exit condition if user selects option 6
            if (option == 6) {
                System.out.println("Exiting the program...");
                break; // Exit the loop if option 6 is chosen
            }

            handleTask(option, sc); // Handle the selected task based on user input

            if (!askToContinue(sc)) { // Ask if user wants to continue
                System.out.println("Exiting the program...");
                break; // Exit the loop if user chooses to stop
            }
        }
        } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close(); // Close scanner after use
            System.out.println("Scanner closed successfully.");
        }
    }

    // Display the menu of available tasks
    private static void displayMenu() {
        System.out.println("\nSelect a task (1-6):");
        System.out.println("1. TASK 1: Array Search");
        System.out.println("2. TASK 2: Multiplication Table");
        System.out.println("3. TASK 3: Diagonal Sum of a Matrix");
        System.out.println("4. TASK 4: Spiral Traversal of a Matrix");
        System.out.println("5. TASK 5: Bubble Sort");
        System.out.println("6. Exit");
    }

    // Get user input for task choice and validate that it's between 1 and 6
    private static int getUserChoice(Scanner sc) {
        int option;
        while (true) {
            System.out.print("Enter your choice (1-6): ");
            try {
                option = sc.nextInt(); // Read the user's choice
                if (option >= 1 && option <= 6) return option; // Valid choice
                System.out.println("Invalid choice. Please choose between 1 and 6.");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // Clear the invalid input
            }
        }
    }

    // Executes the task based on the user's choice
    /* Case Switch for simplicity and clarity. This -> operator makes the syntax more compact 
    avoiding the need for break statement*/
    private static void handleTask(int option, Scanner sc) {
        switch (option) {
            case 1 -> ArraySearch.arraySearch(sc);
            // Call method for Task 1
            case 2 -> MultplicationTable.multiplicationTable(sc);
            // Call method for Task 2
            case 3 -> DiagonalSumMatrix.diagonalSumMatrix(sc);
            // Call method for Task 3
            case 4 -> SpiralTraversalMatrix.spiralTraversalMatrix(sc);
            // Call method for Task 4
            case 5 -> BubbleSort.bubbleSort(sc);
            //Call method for  Task 5
            default -> {
            }
        }
        // No action needed for invalid option
            }

    // Askinf if user wishes to continue
   private static boolean askToContinue(Scanner sc) {
    while (true) { // Keep asking until a valid response is provided
        try {
            sc.nextLine(); // Consume any leftover newline from previous input
            System.out.print("Do you want to continue with another task? (1 for yes, 2 for no): ");
            String answer = sc.nextLine().trim(); // Get user response
            
            // Try to convert the input to an integer
            int choice = Integer.parseInt(answer);

            // Check if the choice is 1 (yes) or 2 (no)
            switch (choice) {
                case 1 -> {
                    return true; // User wants to continue
                }
                case 2 -> {
                    return false; // User doesn't want to continue
                }
                default -> System.out.println("Invalid input. Please enter 1 for yes or 2 for no.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a number (1 for yes, 2 for no).");
        } catch (Exception e) {
            System.out.println("An error occurred while processing your input: " + e.getMessage());
            return false; // In case of an error, assume they don't want to continue
        }
    }
}
}
