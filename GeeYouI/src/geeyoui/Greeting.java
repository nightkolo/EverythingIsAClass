/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeyoui;

/**
 *
 * @author kolo
 */
public class Greeting {
    private String phrase;
    private String language;

    public Greeting(String phrase, String lang) {
        this.phrase = phrase;
        this.language = lang;
    }

    // Getter for phrase
    public String getPhrase() {
        return phrase;
    }

    // Setter for phrase
    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    // Getter for language
    public String getLanguage() {
        return language;
    }

    // Setter for language
    public void setLanguage(String language) {
        this.language = language;
    }
    @Override
    public String toString(){
        return this.phrase + " : " + this.language;
    }
}