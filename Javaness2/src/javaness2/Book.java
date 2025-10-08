/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaness2;

/**
 *
 * @author kolo
 */
//Create a class called Book with the following:
//	•	Instance variables: title (String), author (String), pages (int), isBorrowed (boolean).
//	•	A constructor that initializes all the variables (set isBorrowed to false by default).
//	•	Methods:
//	•	borrowBook() → sets isBorrowed to true.
//	•	returnBook() → sets isBorrowed to false.
//	•	toString() → returns a string with book details (title, author, pages, borrowed status).
//	2.	Create a second class called LibraryTest with a main method:
//	•	Create at least two Book objects.
//	•	Print their details.
//	•	Borrow one, return the other, and show how the status changes.

public class Book {
    private String title;
    private String author;
    private int pages;
    private boolean isBorrowed;
    public Book(){
        this("Untitled", "No author", 0, false);    
    }
    public Book(String title, String author, int pages, boolean isBorrowed){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isBorrowed = isBorrowed;
    } 

    public void borrowBook(){ isBorrowed = true; }
    public void returnBook(){ isBorrowed = false; }

    public String getTitle() { return title; }
    public int getPages() { return pages; }
    public String getAuthor() { return author; }
    public boolean isBorrowed() { return isBorrowed; }

    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setPages(int pages) { this.pages = pages; }
    public void setBorrowed(boolean isBorrowed) { this.isBorrowed = isBorrowed; }

    @Override
    public String toString() {
        return String.format("Title: %s, Author: %s, Pages: %d. The Book is %s",
        this.title,
        this.author,
        this.pages,
        ((this.isBorrowed) ? "Borrowed" : "Available")
        );
    }
}
