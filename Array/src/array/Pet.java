/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author kolo
 */
public class Pet {
    private String name;
    private String species;
    private int age;
    private boolean adopted;
    
    public Pet(String name, String spe, int age, boolean adopt){
        this.name = name;
        this.species = spe;
        this.age = age;
        this.adopted = adopt;
    }
    
    public String getName(){
        return this.name;
    }
    public String getSpecies(){
        return this.species;
    }
    public int getAge(){
        return this.age;
    }
    public boolean markAdoption(boolean value){
        return this.adopted = value;
    }
    public boolean getAdoptionStatus(){
        return this.adopted;
    }
    @Override
    public String toString(){
        return String.format("Name: %s, Species: %s, Age: %d, %s",
                this.name,
                this.species,
                this.age,
                (this.adopted == true) ? "Adopted" : "Available"
                );
    }
    
    
}
