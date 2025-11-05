/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package familytree;

/**
 *
 * @author kolo
 */
public class Student extends Person {
    private int studentID;
    
    public Student(){
        this("", 0);
    }
    public Student(String pName, int ID){
        name = pName;
        studentID = ID;
    }
    public void setID(int ID){
        this.studentID = ID;
    }
    public int getID(){
        return this.studentID;
    }
    @Override
    public String toString(){
        return "Name: " + name + ", ID: " + this.studentID;
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student)) return false;
        
        Student s = (Student)o;
        
        return this.studentID == s.studentID;
    }
}
