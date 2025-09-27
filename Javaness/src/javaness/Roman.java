/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaness;

/**
 *
 * @author kolo
 */
// TOFO
// Fields: String roman, int decimal
// Constructor: accepts Roman numeral, auto-converts to decimal.


class Roman {
    // TODO: check every character in a string
    // for loop, text.length, charAt()
    // charAt return char
    private String roman;
    private int toDecimal;
    
    public Roman(String rom){
        roman = rom;
        
    }
    
    public void romanToDecimal(String roman) {
        int value = 1;
        
        for (int i = 0; i < roman.length(); i++) {
            char c = roman.charAt(i);
            
            // How thrilling... if else statements...
            if (c == 'M') {
                value += 1000;
            } else if (c == 'D') {
                value += 500;
            } else if (c == 'C') {
                value += 100;
            } else if (c == 'L') {
                value += 50;
            } else if (c == 'X') {
                value += 10;
            } else if (c == 'V') {
                value += 5;
            } else if (c == 'I') {
                value++;
            }
        }
        
        value = toDecimal;
        
    }
}

