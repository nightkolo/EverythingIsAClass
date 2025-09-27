/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaness;

/**
 *
 * @author kolo
 */
// Something for funzies

public class StudentCommenter {
    private StudentProfile student;
    // TODO add different messages
    private String[] msgsA = {
        "Placeholder A message A, %s 1",
        "Placeholder A message A, %s 2",
        "Placeholder A message A, %s 3"
    };
    private String[] msgsB = {
        "Placeholder B message, %s 1",
        "Placeholder B message, %s 2",
        "Placeholder B message, %s 3"
    };
    private String[] msgsC = {
        "Placeholder C message, %s 1",
        "Placeholder C message, %s 2",
        "Placeholder C message, %s 3"
    };
    private String[] msgsD = {
        "Placeholder D message, %s 1",
        "Placeholder D message, %s 2",
        "Placeholder D message, %s 3"
    };
    private String[] msgsF = {
        "Placeholder D message, %s 1",
        "Placeholder D message, %s 2",
        "Placeholder D message, %s 3"
    };
    
    public StudentCommenter(StudentProfile stu){
        student = stu;
    }
    
    public String comment() {
        String msg = "";
        
        String name = student.getName();

        switch (student.getGrade()) {
            case 'A':
                msg = String.format(
                    msgsA[(int)(Math.random() * msgsA.length)],
                    name);
                break;
            case 'B':
                msg = String.format(
                    msgsB[(int)(Math.random() * msgsB.length)],
                    name);
                break;
            case 'C':
                msg = String.format(
                    msgsC[(int)(Math.random() * msgsC.length)],
                    name);
                break;
            case 'D':
                msg = String.format(
                    msgsD[(int)(Math.random() * msgsD.length)],
                    name);
                break;
            case 'F':
                msg = String.format(
                    msgsF[(int)(Math.random() * msgsF.length)],
                    name);
                break;
            default:
                break;
        }
        return msg;
    }

//    public static void main(String[] args) {
//        StudentProfile stu = new StudentProfile("Blah", 85);
//        StudentCommenter com = new StudentCommenter(stu);
//        
//        System.out.println(com.comment());
//    }
}
