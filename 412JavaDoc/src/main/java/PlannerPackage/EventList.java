/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlannerPackage;

import java.util.ArrayList;
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
}
