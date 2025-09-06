/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package playground;

/**
 *
 * @author kolo
 */
public class Playground {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sanity check.");
        
        int x = 4;
        double y = 5.5;
        
        String name = "Jello Jorld";
        
        System.out.println(name);
        
        // TIL Functions are called methods.
        
        double goal = 2000.0;
        double saving = 500.0;
        
        String message = "I am now " + calPercentageToGoal(goal, saving) + "% to my goal!";
        
//        name_here();
//        System.out.println(hello());
//        System.out.println("");
//        System.out.println(message); // Just trying something...
//        System.out.println(calHypotenuse(1, 1));
//        System.out.println("");
//        System.out.println(degreesToRadian(180.0 / Math.PI, false));
//        System.out.println("");
//        
//        
//        System.out.println(findQuadrant(245.0, -135.0));
        
        // No autocomplete :( I want VSC....
        // Not sure about these warnings
//        System.out.println(Math.sqrt(27.0));
        
        
    }
    static void name_here() {
        System.out.println("Hello there, how you doin");
    }
    
    static String hello() {
        return "Let's try a return method";
    }
    
    // Bad method name
    static double calPercentageToGoal(double min, double max) {
        return 100.0 * (max / min);
    }
    
    static double calHypotenuse(double a, double b) {
        return Math.sqrt(Math.pow(2, a) + Math.pow(2, b));
    }
    
    
    static double degreesToRadian(double value, boolean opposite) {
        double res; // NOTE: This is fine because it's a checking for both scenarios.
        if (opposite) {
            res = value * (180.0 / Math.PI);
        } else {
            res = value * (Math.PI / 180.0);
        }
        return res;
    }
    
    static int findQuadrant(double x, double y) {
        int res = 0; // TIL I can't do that
        
        // TIL the complier seems to complain when it is uncertain of a variable's value
        // especially in this case.
        
        if (x > 0 && y > 0) {
            res = 1;
        } else if (x < 0 && y > 0) {
            res = 2;
        } else if (x < 0 && y < 0) {
            res = 3;
        } else if (x > 0 && y < 0) {
            res = 4;
        }
        return res;   
    }
    
    
}
