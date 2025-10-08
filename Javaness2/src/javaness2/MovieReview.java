/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaness2;

/**
 *
 * @author kolo
 */
public class MovieReview {
    private String user;
    private Movie movie;
    private double rating;
    private String review;
    private static final int MAX_CHARACTERS = 1000;
    private static final int MAX_NAME_CHAR = 15;

    public MovieReview(){
        this("unknown", null, "", 1.0);
    }
    public MovieReview(String user, Movie movie, double rate, String review){
        this.user = user.substring(0, MAX_NAME_CHAR);
        this.movie = movie;
        updateReview(review);
        setRating(rate);
    }
    public void updateRating(double rate){
        this.rating = (rate < 1.0) ? 1.0 : (rate > 5.0) ? 5.0 : rating;
        // if (rate < 1.0){ this.rating = 1.0; }
        // else if (rate > 5.0) { this.rating = 5.0; }
        // else { this.rating = rate; }
    }
    public void updateReview(String review) {
        this.review = review.substring(0, MAX_CHARACTERS);
        }
    
    public Movie getMovie() { return movie; }
    public double getRating() { return rating; }
    public String getReview() { return review; }
    @Override
    public String toString(){
        return String.format("")
    }
}
