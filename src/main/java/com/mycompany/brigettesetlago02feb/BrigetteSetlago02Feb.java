/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.brigettesetlago02feb;

import java.util.Scanner;



/**
 *
 * @author Brigette Setlago
 */

public class BrigetteSetlago02Feb {

    public static void main(String[] args) {
       
     //Scanner
        Scanner scanner;
        scanner = new Scanner(System.in);
 

        // Two outputs
        boolean result1 = isSixtyFive(30, 35);
        System.out.println(result1);  // Output: true

        boolean result2 = isSixtyFive(20, 40);
        System.out.println(result2);  // Output: false
    }

    // Function to check if either of the numbers is 65 or their sum is 65
    private static boolean isSixtyFive(int number1, int number2) {
        return (number1 == 65 || number2 == 65 || number1 + number2 == 65);
    }
}

    

