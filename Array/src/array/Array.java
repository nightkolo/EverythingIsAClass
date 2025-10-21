/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

import java.util.Scanner;

/**
 *
 * @author kolo
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    

//Declare a 2D array of 4 rows and 7 columns , call it monthly_sales.
//Fill the array with the sales in 4 weeks of a month.
//Find the total and the average sales of each week.
//Find the total and the average sales per day for the whole month.
//Find the day of the week where sales are a maximum and the day of the week
//    where sales are a minimum (Hint: compare the total sales per day for the whole month).

    public static void main(String[] args) {
//        exer1();

        // rows (weeks)
        // column (sales)
 
        double[][] monthlySales = {
            {1250.75, 1390.40, 980.20, 1150.00, 1425.50, 1200.10, 1340.90},
            {1100.00, 1280.25, 1175.60, 950.80, 1025.40, 1360.75, 1210.30},
            {1540.20, 1475.60, 1320.45, 1600.90, 1710.30, 1655.75, 1580.00},
            {990.90, 1075.40, 1205.10, 1155.80, 1250.25, 1305.90, 1180.70}
        };
        
        // TODO Find the total and the average sales of each week.
        
        // TODO Find the day of the week where sales are a maximum and the day of the week

        double monthSum = 0;
        int days = 7;
        int weeks = 4;
        
        // What a mess :P
        
        for (int i = 0; i < monthlySales.length; i++){
            double[] weekSales = monthlySales[i];
            
            System.out.printf("Week %d: \n", i + 1);
            
            double weekSum = 0;
            double max = weekSales[0];
            
            for (int j = 0; j < weekSales.length; j++){
                double daySale = weekSales[j];
                
                weekSum += daySale;
                monthSum += daySale;
                
                if (max < daySale){
                    max = daySale;
                }
            }
            
            int maxDay = linearSearch(weekSales, max) + 1;
            
            double weeklyAvg = weekSum / days;
            
            System.out.printf("The average sales for Week %d is: %.2f \n", i+1, weeklyAvg);
            System.out.printf("The day with maximum sales for the week is: %d \n", maxDay);
        }

        double monthlyAvg = monthSum / (days * weeks);
        System.out.printf("The average sales for the whole month is: %.2f", monthlyAvg);

    }
    
    
    public static int linearSearch(double[] arr, double value){
      for (int i = 0; i < arr.length; i++){
        if (arr[i] == value){
          return i; // return index of found value
        }
      }
      return -1;
    }
    
    
   //    Declare an array of 7 double values, call it sales.
    //Fill the array with the sales of the 7 days of the week.
    //Print all elements in the array.
    //Find the total and the average sales for the whole week.
    // Find the day with the maximum sales and
    // the day with the minimum sales of the week. 
    public static void exer1(){
        double[] sales = new double[7];
        
//        System.out.println(sales.length);
        
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < sales.length; i++){
            System.out.printf("Enter sale for Day %d: ", i+1);
            double entered = input.nextDouble();
            
            sales[i] = entered;
        }
        
        double min = sales[0]; // Not good...
        double max = sales[0];
//        int maxDay = 0;
//        int minDay = 0;
        
        for (int i = 0; i < sales.length; i++){
            double sale = sales[i];
            
            if (sale < min) {
                min = sale;
//                minDay = i + 1;
            }
            if (sale > max) {
                max = sale;
//                maxDay = i + 1;
            }
        }
        
        // TODO linear search
        
        int maxDay = linearSearch(sales, max) + 1;
        int minDay = linearSearch(sales, min) + 1;
        
        System.out.printf("The day with maximum sales is %d with %.2f \n",
                maxDay, max
                );
        System.out.printf("The day with minimum sales is %d with %.2f \n",
                minDay, min
                );
        
    }
    
}
