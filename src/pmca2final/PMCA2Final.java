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
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);//Initialise scanner
       
        try{
            boolean running = true;//Flag to control the program loop
            
            while(running){
                System.out.println("\nWhat task do you want to run?");
                System.out.println("1. Array Search");
                System.out.println("2. Multiplication Table");
                System.out.println("3. Diagonal Sum of a Matrix");
                System.out.println("4. Spiral Traversal of a Matrix");
                System.out.println("5. Bubble Sort");
                System.out.println("6. Exit the Program");
            
                System.out.print("Enter your choice (1-6): ");
                int option = sc.nextInt();//Read user selection
                
                //Siwtch logic
                switch (option){
                    case 1:
                    //Task 1
                    ArraySearch.arraySearch(sc);
                        break;
                    case 2:
                    //Task 2
                    MultplicationTable.multiplicationTable(sc);
                        break;
                    case 3:
                        //Task 3
                    DiagonalSumMatrix.diagonalSumMatrix(sc);
                        break;
                    case 4:
                    //Task 4
                    SpiralTraversalMatrix.spiralTraversalMatrix(sc);
                        break;
                    case 5:
                    //Task 5
                    BubbleSort.bubbleSort(sc);
                        break;
                    case 6:
                        System.out.println("Exiting the program...");
                        running = false; //Exit the loops to ed the program
                        break;
                    default:
                        System.out.println("Invalid option, please choose a number between 1 to 6.");
                }
            }//closes the while loop
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {// Ensure the scanner is closed by using the finally block
           sc.close();
           System.out.println("Scanner closed successfully.");//Confirmation message that the scanner has closed
        }
    }
}
