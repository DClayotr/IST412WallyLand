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
import RestaurantReservation.restaurantRes;
import java.util.ArrayList;
import RestaurantReservation.RestaurantsBrowseUI;



/**
 *
 * @author noellefajt
 */
public class restaurantResCntl implements ActionListener{
    private RestaurantUI restaurantUI;
    private RestaurantsBrowseUI restaurantsBrowseUI;
    RestaurantBrowseCntl RestaurantBrowseCntl;
    WalleyLandOGList WalleyLandOGList;
    Floor2List Floor2List;
    ParkLoungeList ParkLoungeList;
    WLClubList WLClubList;
    private restaurantRes restaurantRes;
    private ArrayList<restaurantRes> WalleyLandList;
    
    /**
     * constructor for setting up the restaurant reservation controller
     */
    public restaurantResCntl(){
        restaurantUI = new RestaurantUI(this);
        restaurantUI.rescmbo.addActionListener(this);
        restaurantUI.submitBtn.addActionListener(this);
        restaurantUI.backbtn.addActionListener(this);
        restaurantUI.setVisible(true);
    }
    
    
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
                restaurantRes WalleyRes = new restaurantRes(restaurantUI.getFirstName(),restaurantUI.getLastName(),
                restaurantUI.getPhone(), restaurantUI.getNumPeople(), restaurantUI.getRes(), restaurantUI.getTime());
                WalleyLandOGList.addRes(WalleyRes);
                restaurantUI.reservationSuccess("Walley Land OG");

            }
            else if (selectedRes.equals("Floor 2")){
                Floor2List = new Floor2List();
                restaurantRes Floor2ListRes = new restaurantRes(restaurantUI.getFirstName(),restaurantUI.getLastName(),
                restaurantUI.getPhone(), restaurantUI.getNumPeople(), restaurantUI.getRes(), restaurantUI.getTime());
                Floor2List.addRes(Floor2ListRes);
                restaurantUI.reservationSuccess("Floor 2");

            }
             else if (selectedRes.equals("Park Lounge")){
                ParkLoungeList = new ParkLoungeList();
                restaurantRes ParkLoungeListRes = new restaurantRes(restaurantUI.getFirstName(),restaurantUI.getLastName(),
                restaurantUI.getPhone(), restaurantUI.getNumPeople(), restaurantUI.getRes(), restaurantUI.getTime());
                ParkLoungeList.addRes(ParkLoungeListRes);
                restaurantUI.reservationSuccess("Park Lounge");

            }
             else if (selectedRes.equals("WL Club")){
                WLClubList = new WLClubList();
                restaurantRes WLClubListRes = new restaurantRes(restaurantUI.getFirstName(),restaurantUI.getLastName(),
                restaurantUI.getPhone(), restaurantUI.getNumPeople(), restaurantUI.getRes(), restaurantUI.getTime());
                WLClubList.addRes(WLClubListRes);
                restaurantUI.reservationSuccess("WL Club");

            }
            restaurantUI.clearData();
        }
       if (obj == restaurantUI.backbtn)
        {
            restaurantUI.setVisible(false);
            RestaurantBrowseCntl = new RestaurantBrowseCntl();
        }
      
    }
     
}