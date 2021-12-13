/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainMenu;

import mainMenu.homeScreen;
import TicketPackage.app;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import PlannerPackage.PlannerController;
import RestaurantReservation.RestaurantBrowseCntl;
import TicketPackage.TicketController;
import TicketPackage.TicketModel;
import TicketPackage.TicketView;
import RidePackage.Ride;
import RidePackage.RideUserView;
import RidePackage.RideView;
import RidePackage.RideViewController;
import RidePackage.RideViewModel;
/**
 *
 * @author noellefajt
 */
public class homeController implements ActionListener{

    private homeScreen homeScreen;
    private app app;
    TicketController TicketController;
    TicketModel TicketModel;
    TicketView TicketView;
    Ride Ride;
    RideView RideView;
    RideViewController RideViewController;
    RideViewModel RideViewModel;
    RideUserView Ruv;
    TicketModel model;
    
    //loginUI = new LoginUI(this);
     //homeScreen userSearchCntl = new homeScreen(this);
    //homeScreen = new homeScreen(this);
    //homeScreen.setVisible(true);
    
    public homeController(){
       model = new TicketModel();
       homeScreen = new homeScreen(this);
       
       homeScreen.tixbtn.addActionListener(this);
       homeScreen.resbtn.addActionListener(this);
       homeScreen.planbtn.addActionListener(this);
       homeScreen.ridebtn.addActionListener(this);
       homeScreen.ridebtn1.addActionListener(this);
       homeScreen.setVisible(true);
       
    }
    public void setHomeScreenVisible(){
        homeScreen.setVisible(true);
    }
    public void setHomeScreenInvisible(){
        homeScreen.setVisible(false);
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
       
        if(obj == homeScreen.tixbtn){
            setHomeScreenInvisible();
            TicketController = new TicketController(this.model, this);
            
        }
        
        if(obj == homeScreen.ridebtn){
            setHomeScreenInvisible();
            RideViewModel = new RideViewModel();
            String[] array = {""};
            RideViewModel.main(array);
        }
        if(obj == homeScreen.ridebtn1){
            setHomeScreenInvisible();
            Ruv = new RideUserView();
            String[] array = {""};
            Ruv.main(array);
        }

        if(obj == homeScreen.planbtn){
            setHomeScreenInvisible();
            PlannerController cntl = new PlannerController();
        }
        if(obj == homeScreen.resbtn){
            setHomeScreenInvisible();
            RestaurantBrowseCntl cntl = new RestaurantBrowseCntl();
        }
     }
}
