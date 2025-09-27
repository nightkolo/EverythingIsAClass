/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaness;

/**
 *
 * @author kolo
 */

//The decimal values of the Roman numerals are:
//M 1000
//D 500
//C 100
//L 50
//X 10
//V 5
//I 1

//Write a program that converts a number entered in Roman numerals to decimal.
// Your program should consist of a class, say, Roman. An object of type Roman should do the following:
//
//a.	Store the number as a Roman numeral.
//b.	Convert and store the number into decimal.
//c.	Print the number as a Roman numeral or decimal number as requested by the user.
//d.	Your class must contain the method romanToDecimal to convert a Roman numeral into its equivalent decimal number
//e.	Test your program using the following Roman numerals: MCXIV, CCCLIX, and MDCLXVI.
//

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
public class Main1 {
    public static void main(String[] args) {
        String msg = "MDCLXVI";
        
        Roman roman = new Roman();
        
        int lovelyNumber = roman.romanToDecimal(msg);
        System.out.println(lovelyNumber);
    }
}
