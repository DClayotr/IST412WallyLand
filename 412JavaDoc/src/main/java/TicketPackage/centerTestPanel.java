package TicketPackage;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.util.ArrayList;

public class centerTestPanel extends JPanel {
    
    private JScrollPane scrollPane;
    private JTable ticketTable;
    private tableModel tm;
    private ArrayList<ArrayList<String>> attributes;

    public centerTestPanel(ArrayList<Ticket> arr){
        
        setAttributes(arr);
        setupScreen(attributes);

    }

    public void setAttributes(ArrayList<Ticket> arr){
        this.attributes = new ArrayList<ArrayList<String>>();
        ArrayList<String> ticketAttributes = new ArrayList<String>();
        for(Ticket tic : arr){
            ticketAttributes = new ArrayList<String>();
            ticketAttributes.add(String.valueOf(tic.getPrice()));
            ticketAttributes.add(tic.getRide());
            ticketAttributes.add(tic.getTime());
            ticketAttributes.add(tic.getType());
            attributes.add(ticketAttributes);
        }
    }
    public void updateScreen(ArrayList<Ticket> arr){
        setAttributes(arr);
        setupScreen(attributes);
    }
    public void setupScreen(ArrayList<ArrayList<String>> arr){
        if(this.scrollPane == null){
            this.tm = new tableModel(arr);
            this.ticketTable = new JTable(tm);
            this.scrollPane = new JScrollPane(ticketTable);
            this.add(this.scrollPane);
        }
        else{
            this.remove(scrollPane);
            this.tm = new tableModel(arr);
            this.ticketTable = new JTable(tm);
            this.scrollPane = new JScrollPane(ticketTable);
            this.add(this.scrollPane);
            this.revalidate();
        }
            
    }
    public int getSelectedRow(){
        return this.ticketTable.getSelectedRow();
    }

}
