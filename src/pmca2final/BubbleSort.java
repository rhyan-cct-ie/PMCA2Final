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
class BubbleSort {
     public static void bubbleSort(Scanner sc) {
         //Get the array from the user
         System.out.print("Enter the size of the array: ");
         //Read the size of the array from user input
         int size = sc.nextInt();
         //Validate the size (size must be a positive number)
         if (size < 1) {
            System.out.println("Array size must be a positive integer.");
            return;
         }
         //Create the array to hold elements
         int[] array = new int[size];
         System.out.println("Enter the elements of the array: ");
         // Read the elements of the array from user input
         for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
         //Display the array before sorting??
         System.out.println("Array before sorting:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();//move to the next line
         //Bubble Sort Logic
         int totalSwaps = 0;  // To track the number of swaps
        for (int i = 0; i < array.length - 1; i++){
            boolean swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    
                    int temp = array[j];// Swap elements if they're out of order
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    totalSwaps++;
                    swapped = true;
                }
            }
            //If no swaps made, the array is already sorted
            if (!swapped) {
                break;
            }
        }
         //Display the array after sorting
         System.out.println("Array after sorting:");
         for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();//MOve to the next line
         //Display the total number of swaps
         System.out.println("Total swaps performed: " + totalSwaps);
         
     }
    
}
