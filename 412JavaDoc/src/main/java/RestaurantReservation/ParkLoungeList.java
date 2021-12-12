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
    private ArrayList <restaurantRes> parkResList = new ArrayList<>();
    @Override
    public void addRes(restaurantRes res){
        System.out.println("Park Lounge Club reservation made");
        parkResList.add(res);
        
    }
 @Override
    public void printList()
    {
        for (restaurantRes restaurantRes : parkResList)
        {
            System.out.println(restaurantRes.getInfo());
            
        }
    }
}
