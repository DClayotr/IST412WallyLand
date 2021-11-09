/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketPackage;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;
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
    public TicketView(ArrayList<ArrayList<String>> arr){
        this.mf = new MainFrame(arr);

    }
    public MainFrame getMf(){
        return this.mf;
    }

    public void initialsetup(){
        this.mf.getMjp().getCp();
        
    }
    public void updateCp(ArrayList<ArrayList<String>> arr){
        this.mf.getMjp().getCp().updateScreen(arr);
    }
    public void showConfirmationMessage(){
        int input = JOptionPane.showConfirmDialog(null,"Purchase Succesful","OK",JOptionPane.DEFAULT_OPTION);
    }
    // public void initialsetup(int col, int lin){
    //     mf.getMjp().getCp().createMoreButtons(col, lin);
        
    // }
    // public void displayButtons(ArrayList<Ticket> tickets, ArrayList<String> headers)
    // {
    //     mf.getMjp().getCp().displayDataOnButtons(tickets, headers);
    // }
    // public void displayTestLayout(){
    //     new testFrame();
    // }

}
