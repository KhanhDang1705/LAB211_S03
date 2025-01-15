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
public class CE180954_S03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console.
        Scanner sc = new Scanner(System.in);
        // Instantiate the IO class to use its input validation methods.
        IO io = new IO();

        // Infinite loop to keep displaying the menu until the user exits.
        while (true) {
            // Display menu
            System.out.println("1. Convert binary number to decimal number.");
            System.out.println("2. Convert octal number to decimal number.");
            System.out.println("3. Convert hexadecimal number to decimal number.");
            System.out.println("4. Exit");
            System.out.print("Please choose an option (1-4): ");
            int choice;

            try {
                // Get user's choice
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                // Handle invalid input for the menu
                System.out.println("Invalid input. Please enter a number between 1 and 4.\n");
                // Skip the rest of the loop and prompt the user again
                continue;
            }

            switch (choice) {
                // Binary to Decimal Conversion
                case 1:
                    // Get a valid binary number from the user.
                    String binaryInput = io.checkBinary();
                    // Create a BaseChange object with the binary input.
                    BaseChange binaryBaseChange = new BaseChange(binaryInput, null, null);
                    // Call the binary-to-decimal conversion method and display the result.
                    System.out.println("Decimal value: " + binaryBaseChange.binary() + "\n");
                    break;

                // Octal to Decimal Conversion
                case 2:
                    // Get a valid octal number from the user.
                    String octalInput = io.checkOctal();
                    // Create a BaseChange object with the octal input.
                    BaseChange octalBaseChange = new BaseChange(null, octalInput, null);
                    // Call the octal-to-decimal conversion method and display the result.
                    System.out.println("Decimal value: " + octalBaseChange.octal() + "\n");
                    break;

                // Hexadecimal to Decimal Conversion
                case 3:
                    // Get a valid hexadecimal number from the user.
                    String hexInput = io.checkHex();
                    // Create a BaseChange object with the hexadecimal input.
                    BaseChange hexBaseChange = new BaseChange(null, null, hexInput);
                    // Call the hexadecimal-to-decimal conversion method and display the result.
                    System.out.println("Decimal value: " + hexBaseChange.hexa() + "\n");
                    break;

                // Exit
                case 4:
                    System.out.println("Goodbye!");
                    // Exit the program.
                    return;

                // Handle invalid menu choice
                default:
                    System.out.println("Invalid choice. Please choose a number between 1 and 4.\n");
            }
        }
    }
}
