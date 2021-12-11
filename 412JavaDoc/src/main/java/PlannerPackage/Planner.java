/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlannerPackage;

/**
 * Planner serves as the model in this app.
 * @author mattu
 */
public class Planner {    
    private String name;
    private int time;
    
    public Planner(String name, int time){
        /**
         * Constructor for the daily planner
         * @param , name determines what the event is displayed as, time dictates the time of the event in the daily planner
         */
        this.name = name;
        this.time = time;
    }
    
    /**
     * Getter for time variable
     * @return 
     */
    public int getTime(){
        return time;
    }
    
    /**
     * Setter for time variable
     * @param time 
     */
    public void setTime(int time) {
        this.time = time;
    }
    
    /**
     * Getter for name variable
     * @return 
     */
    public String getName(){
        return name;
    }
    
    /**
     * Setter for name variable
     * @param name
     */
    public void setName(String name){
        this.name = name;
        }
    
    @Override
    public String toString() {
        return name + " at " + time +":00";
    }
}

