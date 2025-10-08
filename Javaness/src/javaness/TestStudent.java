/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaness;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author kolo
 */

//a.	In the main(), read from file “studentsScores.data” scores of several students. This is an example data:
//Ahmed Saleh		87
//Ameen Nagi		92
//Amal Ali		72
//Asma Saeed		61
//
//b.	Create Objects for each Student
//
//c.	Print out to a file all the students score and letter grade

public class TestStudent {

    public static void main(String[] args) {
        FileReader fr = null;

        try {
            fr = new FileReader("studentsScores.txt"); // 
            Scanner inFile = new Scanner(fr);
            PrintWriter outFile = new PrintWriter("studentsResult.txt");

            while (inFile.hasNextLine()) {
                String line = inFile.nextLine();

                String[] words = line.split("\\s+");

                String name = "";

                for (int i = 0; i < words.length - 1; i++) {
                    name += words[i] + " ";
                }

                StudentProfile stu = new StudentProfile(name, Integer.parseInt(words[words.length - 1]));
                
//                StudentCommenter com = new StudentCommenter(stu);
                
                outFile.println(stu.toString());
//                outFile.println(com.comment());
            }
            inFile.close();
            outFile.close();

        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        }
    }
}
