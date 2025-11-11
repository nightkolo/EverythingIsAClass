/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grandtree;

/**
 *
 * @author kolo
 */
public class Person {
    public enum Gender {
        MALE, 
        FEMALE,
        ALIEN,
        NON_BINARY,
        NON_HEXADECIMAL
    }
    public String name;
    public int age;
    public Gender gender;
        
    public Person(){
        this("Silly billy", 4);
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        this.gender = Gender.NON_BINARY;
    }
    public Person(String name, int age, Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void displayInfo(){
        System.out.printf("Name: %s, Age: %d",
            name, 
            age
        );
    }
    public void speak(){
        System.out.println("I'm a normal person!");
    }
    public final String displayLegalInfo(){
        return "";
    } 
}
