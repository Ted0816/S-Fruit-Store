/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author GERALDINO_COMP111
 */
public class JOPTIONPANE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        int choice;
        int quantity;
        double total = 0;
        double pay;
        String again;

        double[] prices = {10.00, 12.00, 15.00, 20.00, 30.00};
        String[] items = {"Apple", "Orange", "Grapes", "Mango", "Banana"};

        do {
            String menuMessage = """
                                  Welcome to S Fruit Store\n
                                  Menu - List of Fruits for Sale:
                                  1. Apple.....10.00
                                  2. Orange.....12.00
                                  3. Grapes.....15.00
                                  4. Mango.....20.00
                                  5. Banana.....30.00
                                  6. Type 6 to Exit
                                  """;
            JOptionPane.showMessageDialog(null, menuMessage, "Fruit Store Menu", JOptionPane.INFORMATION_MESSAGE);

            String inputChoice = JOptionPane.showInputDialog("Choose between 1/2/3/4/5 or press 6 to LEAVE:");
            try {
                choice = Integer.parseInt(inputChoice);
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number between 1 and 6.");
                continue;
            }

            if (choice >= 1 && choice <= 5) {
                String fruit = items[choice - 1];
                String quantityInput = JOptionPane.showInputDialog("You chose " + fruit + ". How many do you want?");
                try {
                    quantity = Integer.parseInt(quantityInput);
                    total += quantity * prices[choice - 1];
                    JOptionPane.showMessageDialog(null, "Current total: $" + String.format("%.2f", total));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid quantity. Please enter a valid number.");
                    continue;
                }

            } else if (choice == 6) {
                JOptionPane.showMessageDialog(null, "Exiting the Fruit Store...");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid choice. Please choose between 1/2/3/4/5/6.");
            }

            again = JOptionPane.showInputDialog("Would you like to buy more? (Yes/No):");
            if (!again.equalsIgnoreCase("Yes")) {
                break;
            }

        } while (true);

        double discount = 0;
        if (total >= 500) {
            discount = total * 0.05;
            total -= discount;
            JOptionPane.showMessageDialog(null, "Discount applied: $" + String.format("%.2f", discount));
        }

        if (total > 0) {
            String totalMessage = "Total amount to pay: $" + String.format("%.2f", total);
            JOptionPane.showMessageDialog(null, totalMessage);

            do {
                String inputPayment = JOptionPane.showInputDialog("Enter payment amount:");
                try {
                    pay = Double.parseDouble(inputPayment);

                    if (pay < total) {
                        double shortfall = total - pay;
                        JOptionPane.showMessageDialog(null, "Sorry, your payment is insufficient. Please add $" + String.format("%.2f", shortfall) + " more.");
                    } else {
                        double change = pay - total;
                        JOptionPane.showMessageDialog(null, "Payment successful! Your change: $" + String.format("%.2f", change));
                        break;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid payment amount.");
                }

            } while (true);
        } else {
            JOptionPane.showMessageDialog(null, "No items purchased.");
        }
    }
}
