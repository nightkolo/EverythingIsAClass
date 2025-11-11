/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package familytree;

/**
 *
 * @author kolo
 */
public class Vehicle {
    public String brand;
    public int year;
    
    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    public void displayInfo(){
        System.out.printf("Brand: %s, Year %d", brand, year);
    }
    public void startEngine(){
        System.out.println("Engine starting...");
    }
}
