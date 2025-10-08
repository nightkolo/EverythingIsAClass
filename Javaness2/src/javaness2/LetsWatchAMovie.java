/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaness2;

/**
 *
 * @author kolo
 */
public class LetsWatchAMovie {
    public static void main(String[] args) {
        
        Movie movie1 = new Movie("The Wild Robot");
        Movie movie2 = new Movie("Cars (2006)");
        
        movie1.addRating(5.0);
        movie1.addRating(5.0);
        movie1.addRating(3.75);
        movie1.addRating(4.0);
        movie1.addRating(3.0);
        movie1.addRating(5.5);        
        movie1.addRating(-444.0);
        
        System.out.println(movie2.toString());


        
    }
}
