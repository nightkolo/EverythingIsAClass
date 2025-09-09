/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playground;

/**
 *
 * @author kolo
 */
public class InTheLoop {
    // What I'm doing for the most is applying terminology for common algorithm patterns
    // My own words
    //
    // Sentinel loop
    // use a variable like "run" to control the loop)
    // 
    // Flag loop    
    // true / false conditioned
    //
    // EOF loop (End of file loop)
    // involves try {} catch {} method, but that's more miscellanuous for what I'm doing)
    // break and continue statements
    // for loops
    // nested structures
    // 
    // I also did lots of other exercises, but these are ignored for now.
    // I might commit them later
    
    public static void main(String[] args) {
        // I'll attempt the exercises
        // Write a program to display all odd numbers between 100 and 200. Use a while loop.
        
//        int a = 13;
//        int b = 5;
//        double c = 17.5;
//        
//        System.out.println(15 / 2 + 17.5);
//        System.out.println(13 / (double)(5) + 2 * 17.5);
//        System.out.println(14 % 3 + 6.3 + 5 / 13);
//        System.out.println((int)(c) % 5 + a - b);
//        System.out.println(13.5 / 2 + 4.0 * 3.5 + 18);
        
    }
    
    static void exer2() {
        // Write a program to display all numbers between 100 and 200 that are divisible by 3. Use a for loop
        
        for (double a = 100.0; a < 200.0; a++) {
            // Numbers divisable by 3 are factors of 3... duh?
            // good enough?
            
            if ( Math.floor(a / 3.0) == (a / 3.0) ) {
                System.out.println(a);
            }
        }
    }
    
    static void exer1() {
        double num = 100.0;
        double numEnd = 200.0;
        
        while (num < numEnd) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}
