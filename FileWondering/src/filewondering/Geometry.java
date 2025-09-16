/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileWondering;

import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

// NOTE: initialize the FileReader inside the try block directly. No need to set fr = null; 

public class Geometry {
    public static void main(String[] args) {
        FileReader fr = null;

        try {
            fr = new FileReader("data.txt"); // Attempt to obtain system file "data.txt"
            Scanner inFile = new Scanner(fr); // Read the content of the system file, initialize to a variable
            PrintWriter outFile = new PrintWriter("dataout.txt"); // Create a new system file to write to

            double width = inFile.nextDouble();
            double height = inFile.nextDouble();

            outFile.println("The rectangle's area: " + (width * height));
            outFile.println("The rectangle's perimeter: " + (2.0 * (width + height)));

            // Seal the cage.
            // Close input and output streams to avoid resource leaks
            inFile.close();
            outFile.close();

        } catch (FileNotFoundException ex) { // Woopsie daisy
            System.out.println("The file is not found.");
        }
    }
}
