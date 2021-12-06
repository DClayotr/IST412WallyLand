/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RestaurantReservation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import RestaurantReservation.RestaurantsBrowseUI;
import TicketPackage.TicketController;
import TicketPackage.TicketModel;
/**
 *
 * @author noellefajt
 */
public class RestaurantBrowseCntl implements ActionListener{
    private RestaurantsBrowseUI RestaurantsBrowseUI;
   
    public RestaurantBrowseCntl(){
        RestaurantsBrowseUI = new RestaurantsBrowseUI(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
       
        if(obj == RestaurantsBrowseUI.makeResBtn){
            //rescmbo.getSelectedItem().toString();
            
            //TicketModel model = new TicketModel();
            //TicketView view = new TicketView();
            //TicketController = new TicketController(model);
            
        }
     }
    
}
