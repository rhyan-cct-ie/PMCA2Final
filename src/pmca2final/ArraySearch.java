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
class ArraySearch {
    public static void arraySearch(Scanner sc) {
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
       
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

       
        HashSet<Integer> seenElements = new HashSet<>();
        HashSet<Integer> repeatedElements = new HashSet<>();
        
        for (int i = 0; i < size; i++) {
            if (seenElements.contains(array[i])) {
                repeatedElements.add(array[i]);
            } else {
                seenElements.add(array[i]);
            }
        }

        
        if (repeatedElements.isEmpty()) {
            System.out.println("No repeated elements found.");
        } else {
            System.out.println("Repeated elements:");
            for (int num : repeatedElements) {
                System.out.println(num);
            }
        }
    }
}
