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
class MultplicationTable {
    public static void multiplicationTable(Scanner sc){
      int tableSize = 0;//Initialise the variable to store the sie of the table
        
        //Prompt the user for size of the multiplication table. Only positive integers are accepted
       while(true){
        System.out.print("Enter size of multiplication table (positive ): ");
            if (sc.hasNextInt()) {//Check if the input is an integer
                tableSize = sc.nextInt();// Read the input and store it in tableSize
                if(tableSize > 0) {// Ensure the table size  greater than 0 or positive integer
                    break;//Exit the loop if a valid size is entered
                }else {
                System.out.println("Please enter a positive integer.");// Print error if input is non-positive
            }
        }else{
          System.out.println("Invalid input. Please enter a valid integer.");// Error message appears if non-intege is entered
          sc.next();//Clear the invalid input so it doesn't interfere with future inputs
        }
    }

      //Initialize a 2D array to store the multiplication table
        int[][] table = new int[tableSize][tableSize];
        
        //loop to fill the table with user input for each element
        System.out.println("Enter the elements of the multiplication table row by row:");
        for (int i = 0; i < tableSize; i++) {//loop through eacg row
            for (int j = 0; j < tableSize; j++) {//loop through each column in the row
                while(true) {
                System.out.print("Enter element at position (" + (i+1) + "," + (j+1) + "): ");
                if (sc.hasNextInt()){//Check if the input is an integer
                    table[i][j] = sc.nextInt();//Store the valid input into the table
                    break;//exit the loop if valid input is entered
                } else {
                    System.out.println("Invalid input");
                    sc.next();//delete invalid input and allow new entry from user
                }
                  
            }
                
        }
    }
        // Display the multiplication table in matrix form
        System.out.println("Multiplication Table:");//print the header for the multiplication table
        for (int i = 0; i < tableSize; i++) {//Loop through each row of the table
            for (int j = 0; j < tableSize; j++) {//Loop through each element in the row
                System.out.print(table[i][j] + "\t");//Print each element with a tab for spacing
            }
            System.out.println();//New line after printing each row
        }
    }
}
