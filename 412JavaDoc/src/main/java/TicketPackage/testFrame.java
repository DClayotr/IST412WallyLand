package TicketPackage;

import java.awt.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class testFrame extends JFrame{
    JFrame f;    
    testFrame(){    
        f=new JFrame();    
        JLabel label1 = new JLabel("Ride 1");
        JLabel label2 = new JLabel("Ride 2");
        JButton ride1 = new JButton("purchase");
        JButton ride2 = new JButton("purchase");
        // JButton b1=new JButton("1");    
        // JButton b2=new JButton("2");    
        // JButton b3=new JButton("3");    
        // JButton b4=new JButton("4");    
        // JButton b5=new JButton("5");    
        // JButton b6=new JButton("6");    
        // JButton b7=new JButton("7");    
        // JButton b8=new JButton("8");    
        // JButton b9=new JButton("9");    
        // adding buttons to the frame       
        // f.add(b1); f.add(b2); f.add(b3);  
        // f.add(b4); f.add(b5); f.add(b6);  
        // f.add(b7); f.add(b8); f.add(b9);   
        f.add(label1);
        f.add(ride1); 
        f.add(label2);
        f.add(ride2);
    
        // setting grid layout of 3 rows and 3 columns    
        f.setLayout(new GridLayout(0,2));    
        f.setSize(300,300);    
        f.setVisible(true);    
    }
}
