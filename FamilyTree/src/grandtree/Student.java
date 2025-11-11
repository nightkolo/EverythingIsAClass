/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grandtree;

/**
 *
 * @author kolo
 */
public class Student extends Person {
    public String major;
    public boolean hasBeenBrowsingTikTok = false;
    public ExamPaper paper;

    public Student(String name, int age, String major){
        super(name, age);
        this.major = major;
    }
    public Student(String name, int age, Person.Gender gender, String major){
        super(name, age, gender);
        this.name = name;
        this.age = age;
        this.major = major;
    }
    public void finishExam(){
        double score;
        if (hasBeenBrowsingTikTok){
            score = Math.random() * 40.0;
        } else {
            score = 60.0 + (Math.random() * 40.0);
        }
        
        this.paper = new ExamPaper(this, score);
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.printf(", Major: %s %n", major);
    }
    @Override
    public void speak(){
        if (Math.random() < 0.5){
            System.out.println("I have to study but I'm busy wathcing TikToks%n");
            hasBeenBrowsingTikTok = true;
        } else {
            System.out.printf("I'm on that %s grind!%n", major);
            hasBeenBrowsingTikTok = false;
        }
    }
}
