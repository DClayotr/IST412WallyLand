/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlannerPackage;

import javax.swing.SwingUtilities;

/**
 *
 * @author mattu
 */
public class PlannerMain {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        SwingUtilities.invokeLater(() -> {
            PlannerController cntl = new PlannerController();
        });

    }

}   
