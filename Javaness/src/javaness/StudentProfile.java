/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaness;

/**
 *
 * @author kolo
 */
// Create a Java Application in NetBeans with the following two classes.
//1.	A class StudentProfile with the following private attributes:
//a.	name
//b///.	score (out of 100)
//The class StudentProfile should include the following methods: 
//c.	Constructor/s
//d.	Accessors and mutators methods 
//e.	Method to return the letter grade of a StudentProfile object. 
//f.	Override the toString method to print the student’s name, total score and letter grade 
// A 90–100
// B 80–89
// C 70–79
// D 60–69
// F < 60
// 2.	Another Java class called TestStudent with the main() method:
// a.	In the main(), read from file “studentsScores.data” scores of several students. This is an example data:
// Ahmed Saleh		87
// Ameen Nagi		92
// Amal Ali			72
// Asma Saeed		61
// b.	Create Objects (StudentProfile) for each Student
// c.	Print out to a file all the students score and letter grade
class StudentProfile {

    private String name;
    private int score;

    public StudentProfile(String pName, int pScore) {
        name = pName;
        if (pScore >= 0 && pScore <= 100) {
            score = pScore;
        }
    }

    public int getScore() {return score; }
    public String getName() {return name; }
    public void setScore(int newScore) { score = (newScore >= 0 && newScore <= 100) ? newScore : score; }
    public void setName(String newName) { name = newName; }

    public char getGrade() {
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    @Override
    public String toString() {
        return String.format("Student name: %s, Score: %d, Grade: %c",
                name,
                score,
                getGrade()
        );
    }
}
