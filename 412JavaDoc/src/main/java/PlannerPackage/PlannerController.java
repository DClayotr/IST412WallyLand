/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlannerPackage;

/**
 *
 * @author mattu
 */
import mainMenu.homeController;

public class PlannerController {

    private final EventList eventList;
    private final PlannerView view;
    private homeController hc;
    //show tickets?

    public PlannerController() {
        eventList = new EventList();
        view = new PlannerView(this, hc);
        view.setVisible(true);
    }

    int getListSize() {
        return eventList.getEvents().size();
    }

    Planner getEvent(int i) {
        return eventList.getEvents().get(i);
    }
    
    String getName(int i) {
        return eventList.getEvents().get(i).getName();
    }
    
    String getTime(int i) {
        return eventList.getEvents().get(i).getTime();
    }
    
        
    void addNewEventToEndOfList() {
        eventList.getEvents().add(new Planner("Event", "8:00 am"));
    }
    
    void delete(int index) {
        eventList.getEvents().remove(index);
    }
    
    void sortEvents(){
        eventList.sortEvents();
    }

}
