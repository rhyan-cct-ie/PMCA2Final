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
class MultplicationTable {//NEEDS ERROR HANDLING
    public static void multiplicationTable(Scanner sc){
      
        //ask the user for size of the multiplication table
        System.out.print("Enter size of multiplication table: ");
        int n = sc.nextInt();

      //Initialize a 2D array to store the multiplication table
        int[][] table = new int[n][n];
        System.out.println("Enter the elements of the multiplication table row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element at position (" + (i+1) + "," + (j+1) + "): ");
                table[i][j] = sc.nextInt();
            }
        }
        //// Display the multiplication table in matrix form
        System.out.println("Multiplication Table:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
