/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package familytree;

/**
 *
 * @author kolo
 */
public class Motorcycle extends Vehicle {
    public boolean hasSidecar;
    
    public Motorcycle(String brand, int year, boolean hasSidecar){
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.printf(
            (hasSidecar == true) ? ", it does have a sidecar. %n" : ", it does not have a sidecar. %n"
        );
    }
    @Override
    public void startEngine(){
        System.out.println("Motorcycle engine is revving!");
    }
}
