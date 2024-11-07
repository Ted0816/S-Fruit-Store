/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package new2;

import static java.lang.Double.max;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author GERALDINO_COMP111
 */
public class New2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        CIRKUL ted = new CIRKUL();
        JOptionPane.showMessageDialog(null, ted.Compute_Circumference(6.0));
        JOptionPane.showMessageDialog(null, ted.Compute_area(4.0));
        JOptionPane.showMessageDialog(null, ted.Compute_diameter(6.7));
        JOptionPane.showMessageDialog(null, ted.Compute_arc(4.0 , 5.0));
    }
}
