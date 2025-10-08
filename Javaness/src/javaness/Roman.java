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

    private String roman;
    private int toDecimal;

    public Roman(String rom) {
        roman = rom;

    }

    public void romanToDecimal(String roman) {
        int value = 1;

        for (int i = 0; i < roman.length(); i++) {
            char c = roman.charAt(i);

            switch (c) {
                case 'M':
                    value += 1000;
                    break;
                case 'D':
                    value += 500;
                    break;
                case 'C':
                    value += 100;
                    break;
                case 'L':
                    value += 50;
                    break;
                case 'X':
                    value += 10;
                    break;
                case 'V':
                    value += 5;
                    break;
                case 'I':
                    value++;
                    break;
                default:
                    break;
            }
        }

        value = toDecimal;

    }
}
