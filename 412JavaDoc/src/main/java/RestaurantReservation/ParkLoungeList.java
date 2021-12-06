/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantReservation;

import java.util.ArrayList;

/**
 *
 * @author noellefajt
 */
//implementing abstract ResList class
public class ParkLoungeList implements ResList{
    private ArrayList <restaurantRes> wlcResList = new ArrayList<>();
    @Override
    public void addRes(){
        System.out.println("Park Lounge Club reservation made");
        
    }
//    @Override
//    public void addRes(restaurantRes restaurantRes){
//        System.out.println("Park Lounge Club reservation made");
//        wlcResList.add(restaurantRes);
//    }
}
