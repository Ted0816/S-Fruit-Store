/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s.fruit.store;

import java.util.Scanner;

/**
 *
 * @author GERALDINO_COMP111
 */
public class SFruitStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        int choice;
        int quantity;
        double total = 0;
        double pay;
        String again;

        double[] prices = {15.00, 35.00, 25.00, 500.00, 99.00}; 
        String[] items = {"Apple", "Orange", "Grapes", "Manggo", "Banana"};

        do {
            System.out.println("Welcome to S Fruit Store");
           System.out.println("Menu");System.out.println("List of Fruits sales");
                   
             System.out.println("""
                               1. Apple.....10.00
                               2. Orange.....12.00
                               3. Grapes.....15.00
                               4. Manggo.....20.00
                               5. Banana.....30.00
                               6. Type 6 to Exit""");

            System.out.println("Choose between 1/2/3/4/5 or press 6 to LEAVE:");
            choice = input.nextInt();

            if (choice >= 1 && choice <= 5) {
                System.out.println("You chose " + items[choice - 1]);
                System.out.print("How many do you want? ");
                quantity = input.nextInt();

                total += quantity * prices[choice - 1];
                System.out.println("Current total: " + total);

            } else if (choice == 6) {
                System.out.println("Exiting the Fruit Store...");
                break; 
            } else {
                System.out.println("Invalid choice. Please choose between 1/2/3/4/5/6.");
            }

            System.out.print("Would you like to buy more? (Yes/No): ");
            again = input.next();

        } while (again.equalsIgnoreCase("Yes")); 

        double discount = 0;
        if (total >= 500) {
            discount = total * 0.05;
            total -= discount;
            System.out.println("Discount applied: " + discount);
        }

        if (total > 0) {
            System.out.println("Total amount to pay: " + total);
            do {
                System.out.print("Enter payment amount: ");
                pay = input.nextDouble(); 

                if (pay < total) {
                    double shortfall = total - pay;
                    System.out.println("Sorry, your payment is insufficient. Please do fulfill your payment, add " + shortfall + " more.");
                } else {
                    double change = pay - total;
                    System.out.println("Payment successful! Your change: " + change);
                    break;
                }
            } while (pay < total);
        } else {
            System.out.println("No Items Bought.");
        }
    }
    }
    


    
    

