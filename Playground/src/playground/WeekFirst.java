/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playground;

/**
 *
 * @author kolo
 */
// Not much TIL, just light revision! That's it.
// I'm looking forward to try out other things.
// TODO: Could try toying around with numeric variables and find out quirks about Java
public class WeekFirst {

    public static void main(String[] args) {
        // TIL constants are defined with final
        final int threshold = (int) 5.0; // Casted to int
//        threshold++;

        System.out.println(threshold);

        int increment = 0;

        increment++;
        increment++;
        increment++;
        increment++;
        // NOTE: ++var vs var++
        ++increment;
        ++increment;

        System.out.println(increment);
        /////
        
        double deci = 325.0;
        double ret = 67.0;

        System.out.println(deci % ret); // % works as expected
        /////
        
        
        // Basic factorization notation
        double x = 8.0;
        String msg = "(x + %.0f)(x - %.0f) = x^2 - %.0f";
        String finalMsg = String.format(msg, x, x, Math.pow(x, 2));

        System.out.println(finalMsg);
        /////
        
        
        String msg2 = "x^2 - ";

        int num1 = 8;

        String finalMsg2 = msg2 + num1;

        System.out.println(finalMsg2);
        /////
        // Type conversion / casting
        double num3 = 1256.0;

        int num2 = (int) num3;

        System.out.println(num3);
        System.out.println(num2);

        // Parsing Numeric Strings and conversion
        // Number.parseNumber("String"); syntax
        // works for Integer, Double, Float, I'm not sure why it's capitalized :/
        // Exercises?
        boolean flag = true;
        double d = 3.7;
        double d2;
        char a, b;
        int MAX = 1000;
        String str1 = "54321";

    }
}
