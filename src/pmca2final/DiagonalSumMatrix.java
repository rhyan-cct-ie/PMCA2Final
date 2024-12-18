/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pmca2final;

import java.util.Scanner;

/**
 *
 * @author reg05
 */
class DiagonalSumMatrix {
    public static void diagonalSumMatrix(Scanner sc) {
        /*Method that creates the matrix from user input and calculates the sum of the main diagonal 
         and the secondary diagonal of a square matrix */
         System.out.println("You selected Task 3: Diagonal Sum of a Matrix");
        
        //Get the size of the matrix from the user
        int tableSize = 0;
        //Ensure user enters a positive integers for the matrix size
        while (tableSize <= 0){
            System.out.print("Enter size of matrix (positive integer): ");
            if (sc.hasNextInt()){
                tableSize = sc.nextInt();
                if (tableSize <= 0){
                    System.out.println("Matrix size must be a positive integer");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                sc.next(); //Clear invalid input
            }
        }
        //Create a square matrix tableSize by tableSize (nxn)
        int[][] matrix = new int[tableSize][tableSize];// Create a square matrix of size n x n
        
        //Get matrix elements from the user (row by row)
         System.out.println("Enter elements row by row (separate values with spaces):");
         sc.nextLine();//Removes the leftover newline after reading the table size
         for (int i = 0; i < tableSize; i++) {
            //Loop to read each row as a space-separated line of integers
                while (true){
                    System.out.println("Enter elements for row " + (i + 1) + ": ");
                    String rowInput = sc.nextLine();//Read the entire line of input
                    String[] elements = rowInput.split("\\s+");//// Split the line into individual strings based on spaces
                
                    //Check if the number of elements in the row matches the matrix size
                    if (elements.length == tableSize){
                        try{
                            //Parse the values into integers and store them in the matrix
                            for (int j = 0; j < tableSize; j++){
                                matrix[i][j] = Integer.parseInt(elements[j]);
                            }
                            break; //Exit the loop if everything is valid
                        }catch (NumberFormatException e) {
                            System.out.println("Invalid input! Please enter valid integers");
                        }
                    } else {
                        System.out.println("Invalid input! Please enter exactly " + tableSize + " integers.");
                    }
                }
            }   
            //Display the matrix
            System.out.println("This is the generated matrix.");
            for (int i = 0; i < tableSize; i++) {
                for (int j = 0; j < tableSize; j++) {
                    System.out.print(matrix[i][j] + "\t");  //Print each element with a tab space
                }
                System.out.println();  //Move to the next row after printing each row
            }
            //Calculate the sum of the main diagonal
            int mainDiagonalSum = 0;
            for (int i = 0; i < tableSize; i++) {
            mainDiagonalSum += matrix[i][i];// Sum elements where row = column
        }
        //Calculate the sum of the secondary diagonal
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < tableSize; i++) {
            secondaryDiagonalSum += matrix[i][tableSize - 1 - i];// Sum elements where row + column = n - 1 
        }
        //Print the results (sum of main and secondary diagonals)
        System.out.println("Sum of main diagonal: " + mainDiagonalSum);
        System.out.println("Sum of secondary diagonal: " + secondaryDiagonalSum);
        }
    }

