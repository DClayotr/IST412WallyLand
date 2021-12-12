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
public class WalleyLandOGList implements ResList{
    private ArrayList <restaurantRes> walResList = new ArrayList<>();
    @Override
    public void addRes(restaurantRes res){
        System.out.println("Walley Land OG reservation made");
        walResList.add(res);
    }
 @Override
    public void printList()
    {
        for (restaurantRes restaurantRes : walResList)
        {
            System.out.println(restaurantRes.getInfo());
            
        }
    }
    
}
