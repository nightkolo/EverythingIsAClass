/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package familytree;

/**
 *
 * @author kolo
 */
public class Car extends Vehicle {
    public int noOfDoors;
    
    public Car(String brand, int year, int doors){
        super(brand, year);
        noOfDoors = doors;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.printf(", Number of doors: %d %n", noOfDoors);
    }
    @Override
    public void startEngine(){
        System.out.println("Car engine is roaring!");
    }
    
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 2020, 4);
        
        c1.displayInfo();
        System.out.println("");
        c1.startEngine();
        
        Motorcycle m1 = new Motorcycle("Honda", 2019, true);
        
        m1.displayInfo();
        System.out.println("");
        m1.startEngine();
    }
}
