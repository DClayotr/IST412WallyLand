/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketPackage;
import java.time.LocalDate;
import java.util.ArrayList;
import java.awt.event.*;
/**
 *
 * @author Dylan
 */
public class TicketController {
    private TicketModel md;
    private TicketView vw;
    /**
    *Constructor for ticket controller, takes in a ticket model object
    *@param model TicketModel object
    */
    public TicketController(TicketModel model, TicketView view){
        this.md = model;
        this.vw = view;
        makeTickets();
        // vw.initialsetup(5, md.getTickets().size());
        // vw.displayButtons(md.getTickets(), md.getHeaders());
        vw.displayTestLayout();
    }
    /**
    *depending on the input from ticketPrompt method in ticket view
    *creates a ticket and passes it to the addTicketMethdo in model to be added to the ticket array
    *@param selection the specific selection integer returned from ticketView.ticketPrompt
    */
    public void makeTickets(){
        concreteFactory factory = new concreteFactory(md);
        factory.makeTicket("single", 15, "ride 1", LocalDate.now(), "12345");
        factory.makeTicket("three", 45, "ride 1", LocalDate.now(), "12345");
        factory.makeTicket("five", 75, "ride 1", LocalDate.now(), "12345");
    }
    public ArrayList<Ticket> getTickets(){
        return md.getTickets();
    }
  
}
