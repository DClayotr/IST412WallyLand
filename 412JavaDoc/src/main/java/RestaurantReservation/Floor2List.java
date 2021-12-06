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
public class Floor2List implements ResList{
     private ArrayList <restaurantRes> floor2ResList = new ArrayList<>();
     @Override
    public void addRes(){
        System.out.println("Floor 2 reservation made");
        
    }
//    @Override
//    public void addRes(restaurantRes restaurantRes){
//        System.out.println("Floor 2 reservation made");
//        floor2ResList.add(restaurantRes);
//    }
}
