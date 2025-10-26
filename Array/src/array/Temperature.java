/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import java.util.Scanner;

/**
 *
 * @author kolo
 */

//	1.	Declare an array of 7 double values, call it temperatures.
//	2.	Fill the array with the recorded temperature for each day of the week.
//	3.	Print all temperatures, labeling each day (e.g. “Monday: 28.5°C”).
//	4.	Find and print the average temperature for the week.
//	5.	Determine the hottest day and coldest day of the week.
//	6.	Count how many days were above the average temperature.
//	7.	Bonus: Print a small text-based bar chart showing each day’s temperature (e.g. "Monday: ****").
public class Temperature {
    public static void main(String[] args) {
        // double[] temperatures = new double[7];
        double[] temperatures = {
          44.5, 30.5, 29.0, 28.0, 27.5, 30.5, 29.0
        };

        String[] days = {
          "Saturday",
          "Sunday",
          "Monday",
          "Tuesday",
          "Wednesday",
          "Thursday",
          "Friday"
        };

        Scanner input = new Scanner(System.in);

//        for (int i = 0; i < temperatures.length; i++){
//          System.out.printf("Enter the temperature on %s: ", days[i]);
//          double tempEntered = input.nextDouble();
//          
//          temperatures[i] = tempEntered;
//        }

        double tempCollected = 0.0;
        double highestTemp = temperatures[0];
        double lowestTemp = temperatures[0];
        String highestDay = "";
        String lowestDay = "";

        for (int i = 0; i < temperatures.length; i++){
          tempCollected += temperatures[i];

          if (lowestTemp > temperatures[i]){
            lowestTemp = temperatures[i];
            highestDay = days[i];

          }
          if (highestTemp < temperatures[i]){
            highestTemp = temperatures[i];
            lowestDay = days[i];
          }

          System.out.println(String.format(
            "%s: %.1f°C",
            days[i],
            temperatures[i]
          ));
          
        }

        double avgTemp = tempCollected / temperatures.length;
        System.out.println(avgTemp);

        System.out.println(lowestDay);
        System.out.println(lowestTemp);

        System.out.println(highestDay);
        System.out.println(highestTemp);




    }

    // public static double linearSearch(double[] arr, double value){
    //   for (int i = 0; i < arr.length; i++){
    //     if (arr[i] == value){
    //       return i;
    //     }
    //   }
    // }
}
