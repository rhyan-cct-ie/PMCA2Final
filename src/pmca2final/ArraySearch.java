/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pmca2final;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reg05
 */
class ArraySearch {//NEEDS REVIEW
    //Method that performs the search for repeated elements in the array
    public static void arraySearch(Scanner sc) {
        System.out.println("You selected Task 1: Array Search – Find the First Repeated Element");
        try{
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
//        HashSet<Integer> repeatedElements = new HashSet<>();
        
        // Iteration through the array to check for repeated elements
        for (int i = 0; i < size; i++) {
            if (seenElements.contains(array[i])) {
                // Print the first repeated element and exit the method
                System.out.println("First repeated element: " + array[i]);
                return;// Exit the method after finding the first repeated element
//                repeatedElements.add(array[i]);
            } else {
                seenElements.add(array[i]);// Add the element to the set if it's not repeated
            }
        }
        // If no repeated elements are found
        System.out.println("No repeated elements found.");
        }catch (InputMismatchException e) {
            //Handle invalid inout (non-integer)
            System.out.println("Invalid inout. Please eneter valid integers.");
        }catch (NegativeArraySizeException e){
            //Handle negative array size input from user
            System.out.println("Array size must be a non-negative integer.");
        }catch (Exception e) {
            // Handle any other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    
    }
}