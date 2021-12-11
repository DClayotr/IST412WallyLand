/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlannerPackage;
        
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author mattu
 */
public class PlannerView extends JFrame {

    private final JTextField eventNameTextField;
    private final JTextField eventTimeTextField;
    private int index;

    private final PlannerController cntl;

    
    public PlannerView(PlannerController plannerController) {
        this.cntl = plannerController;
        eventNameTextField = new JTextField();
        eventTimeTextField = new JTextField();
        initComponents();
        displayEventInfo();
        index = 0;
    }

    private void displayEventInfo() {
        int listSize = cntl.getListSize();
        if (listSize != 0) {
            eventNameTextField.setText(cntl.getEvent(index).getName() + "");
            eventTimeTextField.setText(cntl.getEvent(index).getTime() + "");
            eventNameTextField.setEditable(true);
            eventTimeTextField.setEditable(true);
        } else {
            eventNameTextField.setText("\n");
            eventTimeTextField.setText("\n");
            eventNameTextField.setEditable(false);
            eventTimeTextField.setEditable(false);
        }
    }

    private void initComponents() {
        setTitle("Event Planner");
        setSize(600, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel itemPanel = new JPanel(new GridLayout(5, 1));
        itemPanel.add(new JLabel("Event Name:"));
        itemPanel.add(eventNameTextField);
        itemPanel.add(new JLabel("Time (enter as integer, ex: 8:00am -> 8:"));
        itemPanel.add(eventTimeTextField);

        JButton saveButton = new JButton("Save");
        JButton viewButton = new JButton("View List");
        JButton previousButton = new JButton("Previous");
        JButton deleteButton = new JButton("Delete");
        JButton nextButton = new JButton("Next");
        JButton newButton = new JButton("New");

        saveButton.addActionListener(event -> saveText());
        viewButton.addActionListener(event -> viewList());
        deleteButton.addActionListener(event -> delete());
        nextButton.addActionListener(event -> displayNextItem());
        previousButton.addActionListener(event -> displayPreviousItem());
        newButton.addActionListener(event -> addNewEvent());

        JPanel buttonPanel = new JPanel();

        buttonPanel.add(previousButton);
        buttonPanel.add(newButton);
        buttonPanel.add(saveButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(viewButton);
        buttonPanel.add(nextButton);

        getContentPane().add(itemPanel);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    private void saveText() {
        int listSize = cntl.getListSize();
        String eventNameInput = eventNameTextField.getText();
        String eventTimeInput = eventTimeTextField.getText();

        if (listSize > 0) {
            try {
                cntl.getEvent(index).setName(eventNameInput);
                cntl.getEvent(index).setTime(Integer.parseInt(eventTimeInput));

                JOptionPane.showMessageDialog(new javax.swing.JFrame(),
                        "Saved \"" + eventNameInput
                        + "\" at " + eventTimeInput + ":00.");

                if (index == listSize - 1) {
                    int response = JOptionPane.showConfirmDialog(null, "Would you like to add another event?", "Continue",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (response == JOptionPane.YES_OPTION) {
                        addNewEvent();
                    }
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(new javax.swing.JFrame(),
                        "Changes cannot be saved.");
            }
        } else {
            JOptionPane.showMessageDialog(new javax.swing.JFrame(),
                    "List is currently empty; try adding an item by clicking the \"New\" button.");
        }

    }


    //sort method

    private void viewList() {
        int listSize = cntl.getListSize();
        String displayList = "";
        for (int i = 0; i < listSize; i++) {
            displayList += cntl.getEvent(i).toString() + "\n";
        }

        JOptionPane.showMessageDialog(new javax.swing.JFrame(),
                "Your planner for today: \n" + displayList);
    }

    private void ticketView() {
        this.setVisible(false);
        //show ticket UI?
    }

    private void delete() {
        int listSize = cntl.getListSize();
        if (listSize == 0) {
            JOptionPane.showMessageDialog(new javax.swing.JFrame(),
                    "List is currently empty; try adding an item by clicking the \"New\" button.");
        } else {
            int response = JOptionPane.showConfirmDialog(null, "Delete "
                    + cntl.getEvent(index).toString()
                    + " ?", "Confirm",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                if (index < listSize - 1) {
                    cntl.delete(index);
                    displayEventInfo();
                } else {
                    cntl.delete(index);
                    index = 0;
                    displayEventInfo();
                }
            }
        }
    }

    private void displayNextItem() {
        int listSize = cntl.getListSize();
        //switch (listSize) {
            if(listSize == 0){
                JOptionPane.showMessageDialog(new javax.swing.JFrame(),
                        "List is currently empty; try adding an item by clicking the \"New\" button.");
            }
            if (listSize == 1){
                JOptionPane.showMessageDialog(new javax.swing.JFrame(),
                        "There's only one item in the list so far.");
            }
            else {
                if (index == listSize - 1) {
                    index = 0;
                } else {
                    index++;
                }
                displayEventInfo();
            }
        }

    private void displayPreviousItem() {
        int listSize = cntl.getListSize();
            if(listSize == 0){
                JOptionPane.showMessageDialog(new javax.swing.JFrame(),
                            "List is currently empty; try adding an item by clicking the \"New\" button.");
            }
            if(listSize == 1){
                JOptionPane.showMessageDialog(new javax.swing.JFrame(),
                            "There's only one item in the list so far.");
            }    
            else {
                if (index == 0) {
                    index = listSize - 1;
                } else {
                    index--;
                }
                displayEventInfo();
            }
        }

    private void addNewEvent() {
        cntl.addNewEventToEndOfList();
        int listSize = cntl.getListSize();
        index = listSize - 1;
        displayEventInfo();
        JOptionPane.showMessageDialog(new javax.swing.JFrame(),
                "Added a new event to your planner. Use the \"Save\" button to save changes.");
    }

}
