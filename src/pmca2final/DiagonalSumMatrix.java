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
        
        // Step 1: Get the size of the matrix from the user
        System.out.print("Enter size of matrix: ");
        int n = sc.nextInt(); // size of the square matrix
        int[][] matrix = new int[n][n];// Create a square matrix of size n x n
        
        // Step 2: Get matrix elements from the user (row by row)
         System.out.println("Enter elements row by row:");
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();// Read each element of the matrix
            }
        }
        // Step 3: Calculate the sum of the main diagonal
        int mainDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i];// Sum elements where row = column
        }
        // Step 4: Calculate the sum of the secondary diagonal
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            secondaryDiagonalSum += matrix[i][n - 1 - i];// Sum elements where row + column = n - 1 
        }
        // Step 5: Print the results
        System.out.println("Sum of main diagonal: " + mainDiagonalSum);
        System.out.println("Sum of secondary diagonal: " + secondaryDiagonalSum);
        
        sc.close();
        }

  
    }

