/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author kolo
 */

//	1.	Declare a 2D array of 4 rows and 7 columns called rainfall, representing rainfall over 4 weeks.
//	2.	Fill it with random values between 0.0 and 50.0 (millimeters).
//	3.	Print all rainfall data in a table format (week vs. day).
//	4.	Calculate and print:
//	•	Total rainfall per week
//	•	Average rainfall per week
//	5.	Calculate and print:
//	•	Total rainfall for the whole month
//	•	Average rainfall per day (for all 4 weeks combined)
//	6.	Find the day of the week (e.g. Monday) with the highest total rainfall across the month.
//	7.	Find the week with the lowest average rainfall.
//	8.	Bonus: Identify which week had the most consistent weather (smallest difference between highest and lowest rainfall).
public class Rainfall {
  // Table format

  //  \t

    public static void main(String[] args) {
        double[][] rainfall = new double[4][7]; // column: weeks, rows: rainfall in days

        for (int a = 0; a < rainfall.length; a++){

          for (int b = 0; b < rainfall[a].length; b++){

            rainfall[a][b] = Math.random() * 50.0;
            
            System.out.println(a);
            System.out.println(b);
            System.out.println(rainfall[a][b]);
          }
        }

        String table = "";

        for (int i = 0; i < rainfall.length; i++){
          table += String.format("Week %d \t", i + 1);
        }
        table += "\n";
        
        for (int a = 0; a < rainfall[0].length; a++){
          for (int b = 0; b < rainfall.length; b++){
            table += String.format("%.2f \t", rainfall[b][a]);
          }
          table += "\n";
        }
        System.out.println(table);// yeah...
        // Print here, it's like I'm doing algorithms again...

//	4.	Calculate and print:
//	•	Total rainfall per week
//	•	Average rainfall per week
        

      
    }
}
