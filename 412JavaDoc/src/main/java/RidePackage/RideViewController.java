/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RidePackage;

import java.util.ArrayList;
/**
 *
 * @author cjm6757
 */
public class RideViewController {
    
    private Ride ride;
    private ArrayList<Ride> rideList = new ArrayList<>();

    public RideViewController() {
        Ride tilt = new Ride(false, "Tilt-a-Whirl", 15, true, "The Tilt-a-whirl is a classic carnival ride.", true);
        Ride coaster = new Ride(false, "Lightning Bolt", 55, true, "The Lightning bolt is an inversion coaster.", true);
        Ride ferris = new Ride(false, "Ferris Wheel", 0, false, "The Ferris Wheel is a token attraction.", false);
        Ride parade = new Ride(true, "Afternoon Parade", 0, false, "The Afternoon Parade occurs daily at 1 PM.", true);
        rideList.add(tilt);
        rideList.add(coaster);
        rideList.add(ferris);
        rideList.add(parade);
    }
    
    public void addRide(Ride ride){
        rideList.add(ride);
    }
    
    public int getRideWait(String rideName){
        if(doesRideExist(rideName)){
            this.ride = rideList.get(getRide(rideName));
            if(!ride.getIsShowType()){
                if(ride.getIsWait()){
                return ride.getWaitTime();
                } else {
                    return 0;
                }
            } else {
                return -2;
            }
        } else {
            return -1; 
        }
    }
    
    public boolean doesRideExist(String name){
        for(int i = 0; i < rideList.size(); i++){
            if(rideList.get(i).getRideName().toLowerCase().equals(name.toLowerCase())){
                return true;
            }
        }
        return false;
    }
    
    public Ride getRideInfo(String name){
        for(int i = 0; i < rideList.size(); i++){
            if(rideList.get(i).getRideName().toLowerCase().equals(name.toLowerCase())){
                return rideList.get(i);
            }
        }
        return rideList.get(0);
    }

    public int getRide(String name){
        for(int i = 0; i < rideList.size(); i++){
            if(rideList.get(i).getRideName().toLowerCase().equals(name.toLowerCase())){
                return i;
            }
        }
        return -1;
    }
    
    public void updateRide(Ride r, boolean running, boolean hasWait, int waitTime){
        r.updateRideRunning(running);
        r.updateWaitTime(waitTime, hasWait);
    }
       
    public ArrayList<Ride> getRideList(){
        return rideList;
    }
}