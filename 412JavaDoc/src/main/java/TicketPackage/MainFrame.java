package TicketPackage;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class MainFrame extends JFrame {
    
    private mainPanel mjp;

    public MainFrame(ArrayList<Ticket> arr) {
        super("");
        LayoutSetupMAC();
        mjp = new mainPanel(arr);
        this.add(mjp);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640, 480);
        setVisible(true);
    }

    public mainPanel getMjp() {
        return mjp;
    }

    public void setMjp(mainPanel mjp) {
        this.mjp = mjp;
    }

    void LayoutSetupMAC() {
        // On some MACs it might be necessary to have the statement below 
        //for the background color of the button to appear    
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //------------------------------------------------------           
    }
}
