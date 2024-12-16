/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pmca2final;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reg05
 */
class SpiralTraversalMatrix {
    public static void spiralTraversalMatrix(Scanner sc) {
    // Step 1: Get matrix dimensions from the user
    int rows = 0, cols = 0;
    while (true) {
        try{//Handle invalid input for matrix dimensions
            
            System.out.println("Enter rows and columns of matrix");
            rows = sc.nextInt();
            cols = sc.nextInt();
        
            //2: Validate matrix dimensions (accepts only positive integers)
            if(rows <=0 || cols <= 0){
                System.out.println("Matrix dimensions must be positive integers");
                continue;
            }
            break; // Exit the loop if valid input is received
        } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter integers for rows and columns.");
                sc.nextLine();// Clear the buffer
        }
   }   
        
    
    // Step 3: Create a matrix and accept its elements
    int[][] matrix = new int[rows][cols];
    System.out.println("Enter elements of the matrix row by row:");
    
    sc.nextLine();
    //Read matrix rows
    for (int i = 0; i < rows; i++) {
            while (true) {
                try {// handle invalid input for matrix elements
                    System.out.println("Enter row " + (i + 1)+ " (integers seperated by space):");
                    String rowInput = sc.nextLine();
                    String[] elements = rowInput.split("\\s+");
                    
                    if (elements.length != cols) {
                    System.out.println("Invalid number of elements. Please enter exactly " + cols + " integers.");
                    continue;
                    }
                    for (int j = 0; j < cols; j++) {
                    matrix[i][j] = Integer.parseInt(elements[j]);  // Convert string to integer and assign to matrix
                    }
                    break;  // Exit the loop if valid input is received
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter valid integers for row " + (i + 1) + ".");
                    }
                }
            }
        
    // Step 4: Initialise boundaries for the spiral traversal
    int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

    System.out.print("Spiral Traversal: ");
    // Step 5: Traverse in a spiral order until the boundaries meet
    while (top <= bottom && left <= right) {
            // Traverse from left to right across the top row
            for (int i = left; i <= right; i++) {
                System.out.print(" "+ matrix[top][i] + " ");
                }
                top++;// Move the top boundary down
            
            // Traverse from top to bottom along the rightmost column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
                }
                right--;// Move the right boundary left
            
            // Traverse from right to left across the bottom row (if still within bounds)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;// Move the bottom boundary up
          
            // Traverse from bottom to top along the leftmost column (if still within bounds)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;// Move the left boundary right
            }
            }
            System.out.println();
        }    
    }
}
