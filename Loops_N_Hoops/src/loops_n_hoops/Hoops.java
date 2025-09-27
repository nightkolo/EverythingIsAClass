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
public class Hoops {

    public static void main(String[] args) {
//        calItemPrice(250.0, 0.5);

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the radius of a circle: ");
//        double radEntered = input.nextDouble();
//        
//        System.out.println(
//                String.format("The area of your circle: %f",
//                        getRadius(radEntered)
//                ));
        Scanner input = new Scanner(System.in);

        System.out.println("Enter price of item: ");
        double radEntered = input.nextDouble();
//        
        calItemPrice(radEntered, 0.25);
    }

    // Write a method that receives the radius of a circle, then calculates and returns the area of that circle.
    static public double getRadius(double radius) 
        return Math.PI * Math.pow(radius, 2);
    }

    // Write a main method that will ask the user to input the radius,
    // calls the method above,
    //  then displays the returned value of the area.
    // Write a method that receives the price of an item, and the discount on that item
    // then it calculates and prints the price after discount
    // and after adding tax ( a constant 5%).
    static public void calItemPrice(double price, double discount) {
        // price * (1.0 - discount_percent) * (tax_percent);
        double hiddenTaxBecauseScrewYouCustomer = 0.05;

        double newPrice = price * (1.0 - discount) * (1.0 + hiddenTaxBecauseScrewYouCustomer);
        System.out.println(String.format("Price of your item after %.2f%% discount and %.2f%% tax: %f$",
                discount * 100.0,
                hiddenTaxBecauseScrewYouCustomer * 100.0,
                newPrice));
    }

    // In the main method, ask the user to input the price of an item,
    // then call the above method to calculate and print the final price.
}
