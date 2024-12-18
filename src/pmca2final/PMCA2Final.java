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
        
        Scanner sc = new Scanner(System.in);//Initialise scanner
       
        try{
            boolean running = true;//Flag to control the program loop
            
            while(running){
                System.out.println("\nPlease select a task or press 6 to exit.");
                System.out.println("1. TASK 1: Array Search");
                System.out.println("2. TASK 2: Multiplication Table");
                System.out.println("3. TASK 3: Diagonal Sum of a Matrix");
                System.out.println("4. TASK 4: Spiral Traversal of a Matrix");
                System.out.println("5. TASK 5: Bubble Sort");
                System.out.println("6. EXIT the program");
            
                System.out.print("Enter your choice (1-6): ");
                int option = sc.nextInt();//Read user selection
                
                //Siwtch logic
                switch (option){
                    case 1:
                    //Task 1
                    ArraySearch.arraySearch(sc);//Calls the method 
                        break;
                    case 2:
                    //Task 2
                    MultplicationTable.multiplicationTable(sc);//Calls the method 
                        break;
                    case 3:
                        //Task 3
                    DiagonalSumMatrix.diagonalSumMatrix(sc);//Calls the method 
                        break;
                    case 4:
                    //Task 4
                    SpiralTraversalMatrix.spiralTraversalMatrix(sc);//Calls the method 
                        break;
                    case 5:
                    //Task 5
                    BubbleSort.bubbleSort(sc);//Calls the method 
                        break;
                    //Terminate the program
                    case 6:
                        System.out.println("Exiting the program...");
                        running = false; //Exit the loops to ed the program by setting running to false
                        break;
                    default:
                        System.out.println("Invalid option, please choose a number between 1 to 6.");
                }
                // Ask the user if they want to continue or choose another task//review this part and add error handling//to save
                if (running) {
                    try {
                        System.out.print("\nDo you want to continue with another task? (yes or no): ");
                        sc.nextLine();  // Consume the newline left by nextInt()
                        String answer = sc.nextLine().toLowerCase();
                        if (answer.equals("no")) {
                            running = false;
                            System.out.println("Exiting the program...");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter 'yes' or 'no'.");
                        sc.nextLine(); // Clear the buffer
                    } catch (Exception e) {
                        System.out.println("An unexpected error occurred: " + e.getMessage());
                    }
                }
            }//closes the while loop
        } catch (InputMismatchException e){ //catch-block
            System.out.println("Invalid input. Please enter a valid number."); //Prompt user to enter a valid option (1-6)
        } finally {// Ensure the scanner is closed by using the finally block
           sc.close();
           System.out.println("Scanner closed successfully.");//Confirmation message that the program has been terminated
        }
    }
}
