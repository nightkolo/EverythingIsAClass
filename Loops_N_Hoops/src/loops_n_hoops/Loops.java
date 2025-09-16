/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loops_n_hoops;

import java.util.Scanner;

/**
 *
 * @author kolo
 */

// Exericses

public class Loops {
    public static void main(String[] args) {
        // Write a program to display all odd numbers between 100 and 200.
        // Use a while loop

        int num = 100;
        
        while (num <= 200) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
            num++;
        }
        
        // Write a program to display all numbers between 100 and 200
        // that are divisible by 3.
        // Use a for loop
        for (double i = 100.0; i < 200.0; i++) {
            double divf = Math.floor(i / 3.0);
            double div = i / 3.0;

            if (div == divf) {
                System.out.println(i);
            }
        }

        // weakness.... not sure how to implement sentinal loops (user dependend loops)
        
        // Write a program that will repeatedly ask the user to input a number,
        // then count all the positive and negative numbers entered by the user.
        // The program stops when the user enters a value of zero.
        
        Scanner input = new Scanner(System.in);

        int posEntered = 0, negEntered = 0;

        System.out.println("Input a number: ");
        int numEntered = input.nextInt();

        while (numEntered != 0) {
//          (numEntered > 0) ? posEntered++ : negEntered++;
            
            if (numEntered > 0) {
                posEntered++;
            } else {
                negEntered++;
            }

            System.out.println(String.format(
                    "You have entered %d, input another number: ",
                    numEntered));
            numEntered = input.nextInt();
        }

        System.out.println(String.format(
                "You have entered %d negative values, and %d positive values.",
                negEntered,
                posEntered
        ));
        
        // Write a program that will ask the user to input the number of items purchased,
        // then for each item, asks for the item price.
        // The program then calculates and displays the total price of all items,
        // the highest price of all items, and the lowest price of all items.
        
        Scanner input2 = new Scanner(System.in);
        
        System.out.println("Enter number of items purchased: ");
        int itemsPurchased = input2.nextInt();
        double totalPrice = 0.0;
        
        double highest = 0.0;
        double lowest = 9999999.0;

        for (int i = 0; i < itemsPurchased; i++) {
            System.out.println(String.format("Enter price of item %d: ", i + 1));
            double itemPrice = input2.nextDouble();
            
            totalPrice += itemPrice;
            
            // I'll try the ternary operators....
            lowest = (itemPrice < lowest) ? itemPrice : lowest;
            highest = (itemPrice > highest) ? itemPrice : highest;
            
//            if (itemPrice < lowest) {
//                lowest = itemPrice;
//            }
//            if (itemPrice > highest) {
//                highest = itemPrice;
//            }
        }
        
        System.out.println(
                String.format("The total price of your %d items: %.2f",
                itemsPurchased,
                totalPrice
                )
        );
        System.out.println(
                String.format("Highest of which: %.2f, Lowest of which : %.2f",
                highest,
                lowest
        ));
        

    }
}
