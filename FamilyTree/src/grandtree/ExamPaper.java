/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grandtree;

/**
 *
 * @author kolo
 */
public class ExamPaper {
    private Student student;
    private double mark;
    public ExamPaper(Student student, double marks){
        this.student = student;
        this.mark = marks;
    }
    public double getMark(){
        return this.mark;
    }
    public Student getStudent(){
        return this.student;
    }
}
