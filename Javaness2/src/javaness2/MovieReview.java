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
    private double rate;
    private String review;
    public static final int MAX_CHARACTERS = 1000;
    public static final int MAX_NAME_CHAR = 15;

    public MovieReview(){
        this("unknown", null, 1.0, "");
    }
    public MovieReview(String user, Movie movie, double rate, String review){
        this.user = (user.length() > MAX_NAME_CHAR) ? user.substring(0, MAX_NAME_CHAR) : user;
        this.movie = movie;
        this.updateReview(review);
        this.updateRate(rate);
    }
    public void updateRate(double rate){
        this.rate = (rate < 1.0) ? 1.0 : (rate > 5.0) ? 5.0 : rate;
        // if (rate < 1.0){ this.rate = 1.0; }
        // else if (rate > 5.0) { this.rate = 5.0; }
        // else { this.rate = rate; }
    }
    public void updateReview(String review) {
        if (review.length() > MAX_CHARACTERS){
            this.review = review.substring(0, MAX_CHARACTERS);
        } else {
            this.review = review;
        }
    }
    
    public Movie getMovie() { return this.movie; }
    public String getUser() { return this.user; }
    public double getrate() { return rate; }
    public String getReview() { return review; }
    @Override
    public String toString(){
        String title = (movie != null) ? movie.getTitle() : "No movie"; // null safety
        int year = (movie != null) ? movie.getYear() : 0; // null safety

        return String.format("%s (%d) \nRating: %.1f\n%s \nReviewed by %s.",
            title,
            year,
            this.rate,
            this.review,
            this.user
            );
    }
}
