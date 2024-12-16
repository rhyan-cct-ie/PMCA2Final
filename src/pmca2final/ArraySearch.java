/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pmca2final;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author reg05
 */
class ArraySearch {//NEEDS REVIEW, NEEDS ERROR HANDLING
    //Method that performs the search for repeated elements in the array
    public static void arraySearch(Scanner sc) {
        
        //Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();// Read the size of the array from user input
        int[] array = new int[size];// Create an array to store the user input elements
       
        // Ask the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();// Read each element of the array from user input
        }

        // Create a HashSet to track the elements that have been seen
        HashSet<Integer> seenElements = new HashSet<>();
        // Create a HashSet to store repeated elements
        HashSet<Integer> repeatedElements = new HashSet<>();
        
        // Iteration through the array to check for repeated elements
        for (int i = 0; i < size; i++) {
            if (seenElements.contains(array[i])) {
                repeatedElements.add(array[i]);
            } else {
                seenElements.add(array[i]);
            }
        }

        // Check if there are any repeated elements
        if (repeatedElements.isEmpty()) {
            System.out.println("No repeated elements found.");
        } else {
            // If repeated elements are found, display them
            System.out.println("Repeated elements:");
            for (int num : repeatedElements) {
                System.out.println(num);// Print each repeated element
            }
        }
    }
}
