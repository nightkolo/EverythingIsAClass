/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grandtree;

/**
 *
 * @author kolo
 */
public class University {
    public static void main(String[] args) {
        Student s = new Student("Ava", 20, Person.Gender.FEMALE, "Computer Science");
        Professor p = new Professor("Dr. Lang", 45, Person.Gender.MALE, "Software Engineering");

        s.displayInfo();
        s.speak();

        s.finishExam();
        
        p.setStudentPaperToGrade(s);
        
        p.displayInfo();
        p.speak();
    }

}
