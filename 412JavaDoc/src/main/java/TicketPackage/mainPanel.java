package TicketPackage;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;

public class mainPanel extends JPanel{
    
    private centerTestPanel cp;
    private NorthPanel np;
    private southPanel sp;

    public mainPanel(ArrayList<Ticket> arr)
    {
        super();
        setBackground(Color.yellow);
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        cp = new centerTestPanel(arr);
        np = new NorthPanel();
        sp = new southPanel();
        add(cp, BorderLayout.CENTER);
        add(np, BorderLayout.NORTH);
        add(sp, BorderLayout.SOUTH);

    }

    public centerTestPanel getCp()
    {
        return cp;
    }
    public southPanel getSp(){
        return this.sp;
    }
    public void setCp(centerTestPanel cp)
    {
        this.cp = cp;
    }
    public NorthPanel getNp(){
        return np;
    }
    public void setNp(NorthPanel np){
        this.np = np;
    }
}
