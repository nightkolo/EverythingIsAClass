/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package familytree;

/**
 *
 * @author kolo
 */
public class Employee extends Person {
    private double salary;
    
    public Employee(String pName, double salary){
        name = pName;
        this.salary = salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return this.salary;
    }
    @Override
    public String toString(){
        return "Name: " + name + ", Salary: " + this.salary;
    }
}
