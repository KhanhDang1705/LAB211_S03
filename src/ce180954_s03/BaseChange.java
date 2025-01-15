/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180954_s03;

/**
 * S03 - Convert binary, octal and hexadecimal to decimal
 *
 * @author Le Khanh Dang _ CE180954 11/01/2025
 */
public class BaseChange {

    private String binaryNumber;
    private String octalNumber;
    private String hexaNumber;

    /**
     * Constructor to initialize the numbers.
     *
     * @param dataBinary Binary number as a string
     * @param dataOctal Octal number as a string
     * @param dataHexa Hexadecimal number as a string
     */
    public BaseChange(String dataBinary, String dataOctal, String dataHexa) {
        binaryNumber = dataBinary;
        octalNumber = dataOctal;
        hexaNumber = dataHexa;
    }

    /**
     * Converts the binary number to a decimal number.
     *
     * @return Decimal equivalent of the binary number
     */
    public int binary() {
        // Initialize decimal result
        int decimal = 0;
        // Initialize index for binary position
        int index = 0;

        // Convert binary string to integer
        int binaryNum = Integer.parseInt(binaryNumber);
        //loop until number is zero
        while (binaryNum > 0) {
            // Extract the last digit
            int element = binaryNum % 10;
            // Add the value of the binary digit
            decimal += element * Math.pow(2, index);
            // Remove the last digit
            binaryNum /= 10;
            // Move to the next decimal position
            index++;
        }
        // Return the decimal result
        return decimal;
    }

    /**
     * Converts the octal number to a decimal number.
     *
     * @return Decimal equivalent of the octal number
     */
    public int octal() {
        // Initialize decimal result
        int decimal = 0;
        // Initialize index for octal position
        int index = 0;

        // Convert octal string to integer
        int octalNum = Integer.parseInt(octalNumber);
        //loop until number is zero
        while (octalNum > 0) {
            // Extract the last digit
            int element = octalNum % 10;
            // Add the value of the octal digit
            decimal += element * Math.pow(8, index);
            // Remove the last digit
            octalNum /= 10;
            // Move to the next octal position
            index++;
        }
        // Return the decimal result
        return decimal;
    }

    /**
     * Converts the hexadecimal number to a decimal number.
     *
     * @return Decimal equivalent of the hexadecimal number
     */
    public int hexa() {
        // Initialize decimal result
        int decimal = 0;
        // Initialize index for hexadecimal position
        int index = 0;

        // Loop until the hexadecimal string is empty
        while (hexaNumber.length() > 0) {
            // Extract the last character
            char hex = hexaNumber.charAt(hexaNumber.length() - 1);
            // Remove the last character
            hexaNumber = hexaNumber.substring(0, hexaNumber.length() - 1);
            int hexValue;
            // Check if the character is a digit
            if (Character.isDigit(hex)) {
                // Convert digit to its numeric value
                hexValue = hex - '0';
            } else {
                // Convert letter to its numeric value
                hexValue = Character.toUpperCase(hex) - 'A' + 10;
            }
            // Add the value of the hexadecimal digit
            decimal += hexValue * Math.pow(16, index);
            // Move to the next hexadecimal position
            index++;
        }
        // Return the decimal result
        return decimal;
    }
}
