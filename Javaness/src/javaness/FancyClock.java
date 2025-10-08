/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaness;

/**
 *
 * @author kolo
 */
public class FancyClock {
    private int hr;
    private int min;
    private int sec;
    public Clock(){
        this(1, 0, 0);
    }
    public Clock(int hr, int min, int sec){
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }
    public void setTime(int hr, int min, int sec){
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }
    public int getHours(){ return this.hr; }
    public int getMinutes(){ return this.min; }
    public int getSeconds(){ return this.sec; }
    public void printTime() {
        System.out.println(String.format("%d:%d:%d",
                getHours(),
                getMinutes(),
                getSeconds()
                ));
    }
    public int incrementSecounds(){
        this.sec++;
        return this.sec;
    }
    public int incrementMinutes(){
        this.min++;
        return this.min;
    }
    public int incrementHours(){
        this.hr++;
        return this.hr;
    }
    public boolean equals(Clock clock){
        return this == clock;
    }
}
