/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180954_s03;

import java.util.Scanner;

/**
 * S03 - Convert binary, octal and hexadecimal to decimal
 *
 * @author Le Khanh Dang _ CE180954 11/01/2025
 */
public class IO {

    Scanner sc = new Scanner(System.in);

    /**
     * Validates and returns a binary number entered by the user.
     *
     * @return A valid binary number as a string
     */
    public String checkBinary() {
        while (true) {
            System.out.print("Enter binary number: ");
            // Read user input
            String s = sc.nextLine();
            // Check if input contains only 0s and 1s
            if (s.matches("[01]+")) {
                // Return valid binary input
                return s;
            } else {
                // If invalid, display an error message and loop again.
                System.out.println("Invalid input. Please enter a valid binary number.");
            }
        }
    }

    /**
     * Validates and returns an octal number entered by the user.
     *
     * @return A valid octal number as a string
     */
    public String checkOctal() {
        while (true) {
            System.out.print("Enter octal number: ");
            // Read user input
            String s = sc.nextLine();
            // Check if input contains only digits 0-7
            if (s.matches("[0-7]+")) {
                // Return valid octal input
                return s;
            } else {
                // If invalid, display an error message and loop again.
                System.out.println("Invalid input. Please enter a valid octal number.");
            }
        }
    }

    /**
     * Validates and returns a hexadecimal number entered by the user.
     *
     * @return A valid hexadecimal number as a string
     */
    public String checkHex() {
        while (true) {
            System.out.print("Enter hexadecimal number: ");
            // Read user input and convert to uppercase
            String s = sc.nextLine().toUpperCase();
            // Check if input contains valid hexadecimal characters
            if (s.matches("[0-9A-F]+")) {
                // Return valid hexadecimal input
                return s;
            } else {
                // If invalid, display an error message and loop again.
                System.out.println("Invalid input. Please enter a valid hexadecimal number.");
            }
        }
    }
}
