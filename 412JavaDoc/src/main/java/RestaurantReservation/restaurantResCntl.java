/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RestaurantReservation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import RestaurantReservation.RestaurantUI;
import RestaurantReservation.WalleyLandOGList;
import RestaurantReservation.Floor2List;
import RestaurantReservation.ParkLoungeList;
import RestaurantReservation.WLClubList;

/**
 *
 * @author noellefajt
 */
public class restaurantResCntl implements ActionListener{
    private RestaurantUI restaurantUI;
    WalleyLandOGList WalleyLandOGList;
    Floor2List Floor2List;
    ParkLoungeList ParkLoungeList;
    WLClubList WLClubList;
    
    /**
     * constructor for setting up the restaurant reservation controller
     */
    public restaurantResCntl(){
        restaurantUI = new RestaurantUI(this);
        
        restaurantUI.rescmbo.addActionListener(this);
        restaurantUI.submitBtn.addActionListener(this);
        restaurantUI.setVisible(true);
    }
//     public static void main(String[] args)
//    {
//        restaurantResCntl restaurantResCntl = new restaurantResCntl();
//    }
    /**
     * method that creates the reservation restaurant UI
     */
//    public void createRestaurantResUI(){
//        
//    } 
    
    /**
     * method that will handle all the event actions on the restaurant res UI,
     * depending on the action this method will change the interface accordingly
     * @param e = event click 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == restaurantUI.submitBtn)
        {
            System.out.println("submit hit");
            String selectedRes = restaurantUI.rescmbo.getSelectedItem().toString();
            System.out.println(selectedRes);
            if(selectedRes.equals("Walley Land OG")){
                WalleyLandOGList = new WalleyLandOGList();
                WalleyLandOGList.addRes();
            }
            else if (selectedRes.equals("Floor 2")){
                Floor2List = new Floor2List();
                Floor2List.addRes();
            }
             else if (selectedRes.equals("Park Lounge")){
                ParkLoungeList = new ParkLoungeList();
                ParkLoungeList.addRes();
            }
             else if (selectedRes.equals("WL Club")){
                WLClubList = new WLClubList();
                WLClubList.addRes();
            }
        }
    }
}