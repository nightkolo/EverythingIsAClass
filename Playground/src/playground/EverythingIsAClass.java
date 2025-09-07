/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playground;

/**
 *
 * @author kolo
 */
public class EverythingIsAClass {

    public static void main(String[] args) {
        System.out.println(4 > 5);

        double threshold = 75.1;

        double score = 75.0;

        boolean userWon = score > threshold;
        
        if (userWon) {
            System.out.println("Congratulations! Your score of " + score + " is above " + threshold + ".");
        } else {
            System.out.println("Sorry");
        }

        System.out.println(
                differenceOfCubes(-64.0)
        );
        System.out.println("");
        System.out.println(
                diffOfSqaure(16.0)
        );
        System.out.println("");

        String msg = "Hello %s, Are you %s. How many %s do you have? About %,d";
        String msg2 = "I am about %.2f percent close to my goal";

        double goal = 2000.0;
        double savings = 840.0;

        System.out.println(
                String.format(msg2, calPercentageToGoal(goal, savings))
        );

        String finalMsg = String.format(msg, "Kologen", "sleeping?", "tasks", 9000);

        System.out.println(finalMsg);
    }

    // Bad method name
    static double calPercentageToGoal(double goal, double min) {
        return 100.0 * (min / goal);
    }

    // a^2 - b = (a - b)(a + b);
    static String diffOfSqaure(double num) {
        String eqFormat = "a^b - %s = (a - %s)(a + %s)";

        double absNum = Math.abs(num);
        double sqrtNum = Math.sqrt(num);

        String res = String.format(eqFormat,
                String.format("%.0f", absNum),
                String.format("%.0f", sqrtNum),
                String.format("%.0f", sqrtNum)
        );

        return res;
    }

    static String differenceOfSquares(double num) {
        double absNum = Math.abs(num);
        double sqrtNum = Math.sqrt(absNum);

        String res = String.format("a^2 - %s = (a - %s)(a + %s)",
                String.format("%.0f", absNum),
                String.format("%.0f", sqrtNum),
                String.format("%.0f", sqrtNum)
        );

        return res;
    }

    // I'll attempt to write a difference of cubes
    // x^3 + n -> a^3 + b^3 = (a + b)(a^2 - ab + b^2)
    // Math.sqrt(n);
    // Math.cbrt(n);
    // I believe that's what i need...
    // Doing this completely inexperienced with Java... oh well
    // This is gonna be challenging...
    static String differenceOfCubes(double num) {
        // Pretty bad, might refactor when i hopefully learn more Java.
        String res = "";

        String eq1 = "x^3 + %s = (x + %s)(x^2 - %s + %s)";
        String eq2 = "x^3 - %s = (x - %s)(x^2 + %s + %s)";

        double numEntered = Math.abs(num);

        double numCubed = Math.cbrt(Math.abs(numEntered));

        double numSquared = Math.pow(numCubed, 2);

        if (num > 0) {
            res = String.format(eq1, numEntered, numCubed, numCubed + "x", numSquared);
        } else {
            res = String.format(eq2, numEntered, numCubed, numCubed + "x", numSquared);
        }

        return res;
    }
}
