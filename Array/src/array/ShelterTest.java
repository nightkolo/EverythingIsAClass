/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author kolo
 */

//Create a Shelter object
//	•	Add several pets
//	•	Print the full list
//	•	Print all available pets
//	•	Adopt one or two pets and show the update
//	•	Print the oldest pet and test species filtering
public class ShelterTest {
    public static void main(String[] args) {
        Shelter s1 = new Shelter("Ali", "Abu Dhabi");
        
        Pet p1 = new Pet("Markus", "Dog", 3, false);
        
        Pet p2 = new Pet("Mittens", "Cat", 2, false);
        
        Pet p3 = new Pet("Snowy", "Rabbit", 1, true);
        
        s1.addPet(p3);
        s1.addPet(p2);
        s1.addPet(p1);
        
        s1.displayPets();
        
        s1.adoptPet("Markus");
        
        s1.displayPets();
    }
}
