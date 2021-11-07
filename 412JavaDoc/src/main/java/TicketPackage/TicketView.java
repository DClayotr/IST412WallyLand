/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketPackage;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Dylan
 */
public class TicketView {
    private MainFrame mf;
    /**
    *constructor for the ticket view class
    *takes a ticket controller object
    *@param contr ticketController object
    */
    public TicketView(){
        //this.mf = new MainFrame();
    }
    public MainFrame getMf(){
        return this.mf;
    }
    // public void initialsetup(int col, int lin){
    //     mf.getMjp().getCp().createMoreButtons(col, lin);
        
    // }
    // public void displayButtons(ArrayList<Ticket> tickets, ArrayList<String> headers)
    // {
    //     mf.getMjp().getCp().displayDataOnButtons(tickets, headers);
    // }
    public void displayTestLayout(){
        new testFrame();
    }

}
