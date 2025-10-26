/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author kolo
 */

//Each Shelter should have:
//	•	name: String
//	•	location: String
//	•	pets: Pet[] — an array of up to 50 pets
//	•	numberOfPets: int
//
//Include methods to:
//	1.	Add a new pet to the shelter
//	2.	Remove a pet by name
//	3.	Mark a pet as adopted (set adopted = true)
//	4.	Print all pets currently in the shelter
//	5.	Print all pets available for adoption (adopted == false)
//	6.	Find the oldest pet in the shelter
//	7.	Find all pets of a certain species (e.g., all cats)
public class Shelter {
    public String name;
    public String location;
    public Pet[] pets;
    public int numberOfPets;
    
//    public Shelter(){
//        this()
//    }
    public Shelter(String name, String location) {
        this.name = name;
        this.location = location;
        this.pets = new Pet[50];
        this.numberOfPets = 0;
    }
    
    public void addPet(Pet newPet) {
        boolean added = false;

        for (int i = 0; i < pets.length; i++) {
            if (pets[i] == null) {
                pets[i] = newPet;
                numberOfPets++;
                added = true;
                break;
            }
        }

        if (!added) {
            System.out.println("No spots available");
        }
    }

    public void removePet(String name){
        for (int i = 0; i < pets.length; i++){
            if (pets[i] == null) continue;
            
            if (name.equals(pets[i].getName())){
                pets[i] = null;
                numberOfPets--;
                break;
            }
        }
    }

    public void adoptPet(String name){
        for (int i = 0; i < pets.length; i++){
            if (pets[i] == null) continue;
            
            if (name.equals(pets[i].getName())){
                pets[i].markAdoption(true);
                break;
            }
        }
    }
    
    public void displayPets(){
        for (int i = 0; i < pets.length; i++){
            if (pets[i] == null) continue;
            
            if (pets[i].getAdoptionStatus() == false){
                System.out.println(pets[i].toString());
            }
        }
    }
    
    // Hm...
    public void getPetSpecies(String species){
        int noOfSpecies = 0;
        
        for (int i = 0; i < pets.length; i++){
            if (pets[i] == null) continue;
            
            if (species.equals(pets[i].getSpecies())){
                System.out.println(pets[i]);
            }
        }
    }
}
