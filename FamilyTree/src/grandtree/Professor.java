/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grandtree;

/**
 *
 * @author kolo
 */
public class Professor extends Person {
    public String department;
    public ExamPaper studentPaper;

    public Professor(String name, int age, String department){
        super(name, age);
        this.department = department;
    }
    public Professor(String name, int age, Person.Gender gender, String department){
        super(name, age, gender);
        this.department = department;
    }
    public void setStudentPaperToGrade(Student s){
        if (s.paper == null){
            System.out.printf("%s haven't completed the exam yet.%n", s.name);
            return;
        }
        
        studentPaper = s.paper;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.printf(", Department: %s %n", department);
    }
    @Override
    public void speak(){
        System.out.println("I'm grading papers again... I hope the median for OOP is good!");
        
        if (studentPaper == null) return;
        
        if (studentPaper.getMark() < 60.0){
            System.out.printf("%s, come to my office hours now >:( %n", studentPaper.getStudent().name);
        } else {
            System.out.printf("Great job, have an extra mark! %s%n", studentPaper.getStudent().name);
        }
    }
}
