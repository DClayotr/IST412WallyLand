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
public class WLClubList implements ResList{
    private ArrayList <restaurantRes> wlcResList = new ArrayList<>();
    @Override
    public void addRes(restaurantRes res){
        System.out.println("WL Club reservation made");
        wlcResList.add(res);
    }
    
    @Override
    public void printList()
    {
        for (restaurantRes restaurantRes : wlcResList)
        {
            System.out.println(restaurantRes.getInfo());            
        }
    }
    
}
