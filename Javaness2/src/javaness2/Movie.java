/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaness2;

/**
 *
 * @author kolo
 */
// 	1.	Constructor
// Initializes the movie title, sets ratings and watch counts to 0.
// 	2.	add_rating(double rating)
// Adds a new rating (between 1 and 5). Increases ratings_count by 1 and adds rating to ratings_sum.
// 	3.	get_average_rating()
// Returns average rating (ratings_sum / ratings_count). If no ratings, return 0.
// 	4.	mark_watched()
// Increments times_watched and also increments total_movies_watched.
// 	5.	get_title()
// Returns the movie title.
// 	6.	get_times_watched()
// Returns how many times this movie was watched.
// 	7.	toString()
// Returns a summary string like:
public class Movie {
    private String title;
    private int year;
    private int timesWatched;
    private int ratingsCount;
    private int reviewsCount;
    private double ratingsSum;
    // NOTE totalMoviesWatched is public static int.
    // That breaks encapsulation; any external class can reset it. Make it private static with a getter.
    private static int totalMoviesWatched;
    
    public Movie(String name, int year){
      this.title = name;
      this.year = year;
      this.timesWatched = 0;
      this.ratingsCount = 0;
      this.ratingsSum = 0;
    }
    public void addRating(double rate){
      double rateEntered;
      
      if (rate < 1.0){ rateEntered = 1.0; }
      else if (rate > 5.0) { rateEntered = 5.0; }
      else { rateEntered = rate; }
      
      this.markWatched();
      this.ratingsCount++;
      this.ratingsSum += rateEntered;
    }
    public double getAverageRating(){
      if (this.ratingsCount == 0) return 0.0;
      return this.ratingsSum / this.ratingsCount;
    }
    public void markWatched(){
      timesWatched++;
      totalMoviesWatched++;
    }
    public String getTitle() { return this.title; }
    public int getYear() { return this.year; }
    public int getTimesWatched() { return this.timesWatched; }
    public int getRatingsCount() { return this.ratingsCount; }
    public double getRatingsSum() { return this.ratingsSum; }
    public static int getTotalMoviesWatched() { return totalMoviesWatched; }
    @Override
    public boolean equals(Object obj) {
  //    Checks if the two references point to the exact same object in memory.
	//   	If they do, they’re obviously equal.
        if (this == obj) return true;
  //    Makes sure that the object is actually a Movie.
	//    If it isn’t, return false immediately. This prevents type errors.
        if (!(obj instanceof Movie)) return false;
  //    now that we know obj is a Movie, we can treat it as one with safe casting
        Movie other = (Movie) obj;
        return this.title.equals(other.title);
    }
    @Override
    public String toString(){
      return String.format("Movie Title: %s (%d), Watched: %d, Avg. Rating: %s",
        this.title,
        this.year,
        this.timesWatched,
        (getAverageRating() == 0.0) ? "N/A" : String.format("%.2f", getAverageRating())
        );
    }
}
