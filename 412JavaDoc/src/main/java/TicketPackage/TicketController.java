/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketPackage;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.*;
/**
 *
 * @author Dylan
 */
public class TicketController {
    private TicketModel md;
    private TicketView vw;
    private TicketViewer tv;
    private ArrayList<Ticket> ticketTracker;
    private ArrayList<ArrayList<String>> ticketArray;
    /**
    *Constructor for ticket controller, takes in a ticket model object
    *@param model TicketModel object
    */
    public TicketController(TicketModel model){
        this.md = model;
        this.ticketTracker = new ArrayList<Ticket>();
        makeTickets();
        this.ticketArray = createTicketToString();
        this.vw = new TicketView(ticketArray);
        addPurchaseActionListener();
        addSearchActionListener();
        addShowTicketsActionListener();
        vw.initialsetup();

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
    public ArrayList<String> addSingleTickets(){
        ArrayList<String> arr = new ArrayList<String>();
        for(int i = 0; i < md.getTickets().size(); i++){
            if(md.getTickets().get(i).getPeople() == 1){
                arr.add(String.valueOf(md.getTickets().get(i).getPrice()));
                arr.add(md.getTickets().get(i).getRide());
                arr.add(md.getTickets().get(i).getTime());
                arr.add(md.getTickets().get(i).getType());
                this.ticketTracker.add(md.getTickets().get(i));
            }
        }
        return arr;
    }
    public ArrayList<String> addThreePersonTickets(){
        ArrayList<String> arr = new ArrayList<String>();
        for(int i = 0; i < md.getTickets().size(); i++){
            if(md.getTickets().get(i).getPeople() == 3){
                arr.add(String.valueOf(md.getTickets().get(i).getPrice()));
                arr.add(md.getTickets().get(i).getRide());
                arr.add(md.getTickets().get(i).getTime());
                arr.add(md.getTickets().get(i).getType());
                this.ticketTracker.add(md.getTickets().get(i));
            }
        }
        return arr;
    }
    public ArrayList<String> addFivePersonTickets(){
        ArrayList<String> arr = new ArrayList<String>();
        for(int i = 0; i < md.getTickets().size(); i++){
            if(md.getTickets().get(i).getPeople() == 5){
                arr.add(String.valueOf(md.getTickets().get(i).getPrice()));
                arr.add(md.getTickets().get(i).getRide());
                arr.add(md.getTickets().get(i).getTime());
                arr.add(md.getTickets().get(i).getType());
                this.ticketTracker.add(md.getTickets().get(i));
            }
        }
        return arr;
    }
    public ArrayList<ArrayList<String>> createTicketToString(){
        ArrayList<ArrayList<String>> ticketArray = new ArrayList<ArrayList<String>>();
        ticketArray.add(addSingleTickets());
        ticketArray.add(addThreePersonTickets());
        ticketArray.add(addFivePersonTickets());
        return ticketArray;
    }
    private void addPurchaseActionListener(){
        vw.getMf().getMjp().getSp().getPurchaseButton().addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                int selectedRow = vw.getMf().getMjp().getCp().getSelectedRow();
                Ticket selectedTicket = ticketTracker.get(selectedRow);
                int selectedTicketRow = md.getTickets().indexOf(selectedTicket);
                md.getTickets().get(selectedTicketRow).setPurchased(true);
                md.addPurchasedTicket(md.getTickets().get(selectedTicketRow));
                vw.showConfirmationMessage();
            } 
        });
    }
    private void addSearchActionListener(){
        vw.getMf().getMjp().getNp().getSearchButton().addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                ticketTracker = new ArrayList<Ticket>();
                ArrayList<ArrayList<String>> ticketArray = new ArrayList<ArrayList<String>>();
                if(vw.getMf().getMjp().getNp().singleTickets()){
                   
                    ticketArray.add(addSingleTickets());
                }
                if(vw.getMf().getMjp().getNp().threePersonTickets()){
                   
                    ticketArray.add(addThreePersonTickets());
                }
                if(vw.getMf().getMjp().getNp(). fivePersonTickets()){
                   
                    ticketArray.add(addFivePersonTickets());
                }
                vw.updateCp(ticketArray);
            } 
        });
    }
    
    private void addShowTicketsActionListener(){ 
        vw.getMf().getMjp().getSp().getShowTicketsButton().addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                TicketViewer tv = new TicketViewer(md.getPurchasedTickets());
                //tv.populatePurchasedTicketsArray(md.getPurchasedTickets());
                tv.setVisible(true);
              
            } 
        });
    }
  
}
