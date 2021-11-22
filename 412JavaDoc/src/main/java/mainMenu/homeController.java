/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainMenu;

import mainMenu.homeScreen;
import TicketPackage.app;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import TicketPackage.TicketController;
import TicketPackage.TicketModel;
import TicketPackage.TicketView;
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
    //loginUI = new LoginUI(this);
     //homeScreen userSearchCntl = new homeScreen(this);
    //homeScreen = new homeScreen(this);
    //homeScreen.setVisible(true);
    
    public homeController(){
      
       homeScreen = new homeScreen(this);
       
       homeScreen.tixbtn.addActionListener(this);
       homeScreen.resbtn.addActionListener(this);
       homeScreen.planbtn.addActionListener(this);
       homeScreen.ridebtn.addActionListener(this);
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
            TicketModel model = new TicketModel();
            TicketController = new TicketController(model, this);
            
        }
     }
}
