/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlannerPackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author mattu
 */
public class EventList {

    private final List<Planner> events;

    public EventList() {
        events = new ArrayList<>();
    }

    public List<Planner> getEvents() {
        return events;
    }
    
    public List<Planner> sortEvents() {
        Collections.sort(events, new Comparator<Planner>() {
            @Override
            public int compare(Planner o1, Planner o2) {
                try {
                    return new SimpleDateFormat("hh:mm a").parse(o1.getTime()).compareTo(new SimpleDateFormat("hh:mm a").parse(o2.getTime()));
                } 
                catch (ParseException e) {
                    return 0;
                }
            }
        });        
        
        //https://stackoverflow.com/questions/35671959/sort-arraylist-with-times-in-java/35672291
        return events;
    }
}
