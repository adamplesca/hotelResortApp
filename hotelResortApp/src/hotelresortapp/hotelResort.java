/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelresortapp;

/**
 *
 * @author adamp
 */
public class hotelResort {
    
    private String name, startDate, duration; 
    private int choice;
    
    public hotelResort(){
        name = "";
        startDate = "";
        duration = "";
        choice = 0;
    }

    public hotelResort(String name, String startDate, String duration, int choice) {
        this.name = name;
        this.startDate = startDate;
        this.duration = duration;
        this.choice = choice;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public int getChoice() {
        return choice;
    }
    public void setChoice(int choice) {
        this.choice = choice;
    }  
}
