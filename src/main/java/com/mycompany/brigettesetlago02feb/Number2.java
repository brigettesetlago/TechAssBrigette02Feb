/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.brigettesetlago02feb;

/**
 *
 * @author Brigette Setlago
 */
public class Number2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Example usage
        String[] words = {"the", "quick", "brown", "fox", "ate", "my", "chickens"};
        longest(words);  // Output: chickens
    }

    // Function to find and print the longest string in the array
    private static void longest(String[] words) {
        if (words.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        String longestWord = words[0]; // Assume the first word is the longest initially

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println(longestWord);
    }
}

    
    

