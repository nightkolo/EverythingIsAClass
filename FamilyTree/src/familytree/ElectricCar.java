/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package familytree;

/**
 *
 * @author kolo
 */
public class ElectricCar extends Car {
    public double batteryCapacityKWh;
    public int rangeKm;
    
    public ElectricCar(String brand, int year, int doors, double batteryCapacityKWh, int rangeKm){
        super(brand, year, doors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.rangeKm = rangeKm;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.printf(
            "Battery Capacity: %.2f, Range KM: %d %n",
            this.batteryCapacityKWh,
            this.rangeKm
        );
    }
    @Override
    public void startEngine(){
        System.out.println("There is no engine, it's electrical!");
    }
    public void charge(double hours){
        this.batteryCapacityKWh += hours;
    }
    public void charge(double hours, double powerKW){
        this.batteryCapacityKWh += hours + powerKW;
    }
    
    public static void main(String[] args) {
        ElectricCar ev = new ElectricCar("Tesla", 2023, 4, 82.0, 530);
        
        ev.displayInfo();
        ev.startEngine();
        ev.charge(0.5);
        ev.displayInfo();
        ev.charge(0.25, 120.0);
        ev.displayInfo();
    }
}
