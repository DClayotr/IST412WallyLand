/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RestaurantReservation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import RestaurantReservation.RestaurantsBrowseUI;
import RestaurantReservation.RestaurantUI;
import RestaurantReservation.restaurantResCntl;
import TicketPackage.TicketController;
import TicketPackage.TicketModel;
import mainMenu.homeController;
/**
 *
 * @author noellefajt
 */
public class RestaurantBrowseCntl implements ActionListener{
    private RestaurantsBrowseUI RestaurantsBrowseUI;
    private restaurantResCntl restaurantResCntl;
   
    public RestaurantBrowseCntl(){
        RestaurantsBrowseUI = new RestaurantsBrowseUI(this);
        RestaurantsBrowseUI.setVisible(true);
        RestaurantsBrowseUI.makeResBtn.addActionListener(this);
        RestaurantsBrowseUI.backBtn.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
       
        if(obj == RestaurantsBrowseUI.makeResBtn){
            RestaurantsBrowseUI.setVisible(false);
            restaurantResCntl = new restaurantResCntl();
        }
        if(obj == RestaurantsBrowseUI.backBtn){
            RestaurantsBrowseUI.setVisible(false);
            homeController homeController = new homeController();
        }
     }
    
}
