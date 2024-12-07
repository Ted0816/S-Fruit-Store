/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circletest1;

import java.util.Scanner;

/**
 *
 * @author GERALDINO_COMP111
 */
public class CircleTest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the radius of the circle: ");
            double userRadius = scanner.nextDouble();

            Circle myCircle = new Circle(userRadius);

            System.out.println("Radius: " + myCircle.getRadius());
            System.out.println("Area: " + myCircle.getArea());
            System.out.println("Circumference: " + myCircle.getCircumference());
            System.out.println("Diameter: " + myCircle.getDiameter());

            System.out.print("\nEnter a new radius: ");
            double newRadius = scanner.nextDouble();
            myCircle.setRadius(newRadius);

            System.out.println("\nUpdated Circle Details:");
            System.out.println("Radius: " + myCircle.getRadius());
            System.out.println("Area: " + myCircle.getArea());
            System.out.println("Circumference: " + myCircle.getCircumference());
            System.out.println("Diameter: " + myCircle.getDiameter());

            scanner.close();
        }
    }

}
       