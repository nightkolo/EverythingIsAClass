/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package familytree;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author kolo
 */
public class Tester {
    public static void main(String[] args) {
        FileReader fr = null;
        
        try {
            fr = new FileReader("inputfile.txt");
            Scanner inFile = new Scanner(fr);
            
            String numStr = inFile.nextLine();
            int noOfPersons = Integer.parseInt(numStr);
            int decrement = noOfPersons;
            
            Person[] persons = new Person[noOfPersons];
            
            //c.	Read students information or employees information from file.
        // If the first letter is s then read student information and create a student object in the array.
        // If the first letter is e then read employee information and create an employee object in the array.  
            while (inFile.hasNextLine()){
                String parts[] = inFile.nextLine().split(" ");
                
                String name = parts[1];
                
                if (parts[0].equals("s")){
                    String IDStr = parts[2];
                    
                    int ID = Integer.parseInt(IDStr);
                    
                    Student s = new Student(name, ID);
                    
                    persons[noOfPersons - decrement] = s;
                    
                } else if (parts[0].equals("e")){
                    String salaryStr = parts[2];
                    
                    double salary = Double.parseDouble(salaryStr);
                    
                    Employee e = new Employee(name, salary);
                    
                    persons[noOfPersons - decrement] = e;
                    
                }
                decrement--;
            }
            
            for (int i = 0; i < persons.length; i++){
                System.out.println(persons[i]);
            }
            
            
        } catch (java.io.FileNotFoundException ex){
            
        }

//b.	Create a Person array with the size from step a.

//d.	Write code to check if there is a duplicate records of students and print them out
//e.	Write code to check if there is a student and employee who have the same name and print them out. 
//f.	Write code to print out the 3 employee with the highest salary

    }
}
