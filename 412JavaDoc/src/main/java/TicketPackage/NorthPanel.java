package TicketPackage;


import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
//import javax.swing.JRadioButton;

public class NorthPanel extends JPanel {
    private JCheckBox singleTickets;
    private JCheckBox threePersonTickets;
    private JCheckBox fivePersonTickets;
    private JButton search;
    private JButton back;
    
    public NorthPanel(){
        this.singleTickets = new JCheckBox();
        this.threePersonTickets = new JCheckBox();
        this.fivePersonTickets = new JCheckBox();
        this.search = new JButton();
        this.back = new JButton();
        this.back.setText("Back");
        this.search.setText("Search");
        this.singleTickets.setText("Single Ticket");
        this.threePersonTickets.setText("Three Person Ticket");
        this.fivePersonTickets.setText("fivePersonTickets");
        add(this.back);
        add(this.singleTickets);
        add(this.threePersonTickets);
        add(this.fivePersonTickets);
        add(this.search);
        
    }

    public JButton getSearchButton(){
        return this.search;
    }
    public JButton getBackButton(){
        return this.back;
    }
    public boolean singleTickets(){
        return singleTickets.isSelected();
    }
    public boolean threePersonTickets(){
        return threePersonTickets.isSelected();
    }
    public boolean fivePersonTickets(){
        return fivePersonTickets.isSelected();
    }
}
