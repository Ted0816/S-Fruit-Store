/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import javax.swing.JOptionPane;

/**
 *
 * @author GERALDINO_COMP111
 */
public class CalculatingAreaAndVolume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }
    // This area is the formula for each area that needs to be solve
}

  public static double CalculatetheAreaofCircle(double r) {
    return Math.PI * r * r;
}

    public static double CalculateAreaofRectangle(double l, double w) {
    return l * w;
}

    public static double CalculateAreaofTriangle(double b, double h) {
    return 0.5 * b * h;
}

    public static double CalculateSphereofVolume(double r) {
    return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
}

    public static double CalculateCylinderofVolume(double r, double h) {
    return Math.PI * Math.pow(r, 2) * h;
}
  public static double CalculateTriangleSide(double a, double b, double angleC) {
    double angleInRadians = Math.toRadians(angleC);
    return Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(angleInRadians));
}
      
    public static double CalculateCircleSegmentArea(double r, double angle) {
    double angleInRadians = Math.toRadians(angle);
    return (Math.pow(r, 2) / 2) * (angleInRadians - Math.sin(angleInRadians));
}

    public static double CalculateSurfaceSphereArea(double r) {
    return 4 * Math.PI * Math.pow(r, 2);
}
// This array is an area for which is our choices for the user
    public static void main(String[] args) {

    String[] options = {
        "Area of Circle", "Area of Rectangle", "Area of Triangle",
        "Volume of Sphere", "Volume of Cylinder",
        "Law of Cosines - Triangle Side",
        "Area of Circle Segment", "Surface Area of Sphere"
    };
// This is a area box to select options
    int choice = JOptionPane.showOptionDialog(null, "Select an option:",
            "Shape Calculator", JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

    // This part of the code is where you calculate the different equation and where you input the needed data to complete the code   
    {
        if (choice == 0) {
            double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius:"));
            JOptionPane.showMessageDialog(null, "Area of Circle: " + CalculatetheAreaofCircle(radius));
        } else if (choice == 1) {
            double length = Double.parseDouble(JOptionPane.showInputDialog("Enter length:"));
            double width = Double.parseDouble(JOptionPane.showInputDialog("Enter width:"));
            JOptionPane.showMessageDialog(null, "Area of Rectangle: " + CalculateAreaofRectangle(length, width));
        } else if (choice == 2) {
            double base = Double.parseDouble(JOptionPane.showInputDialog("Enter base:"));
            double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height:"));
            JOptionPane.showMessageDialog(null, "Area of Triangle: " + CalculateAreaofTriangle(base, height));
        } else if (choice == 3) {
            double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius:"));
            JOptionPane.showMessageDialog(null, "Volume of Sphere: " + CalculateSphereofVolume(radius));
        } else if (choice == 4) {
            double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius:"));
            double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height:"));
            JOptionPane.showMessageDialog(null, "Volume of Cylinder: " + CalculateCylinderofVolume(radius, height));
        } else if (choice == 5) {
            double a = Double.parseDouble(JOptionPane.showInputDialog("Enter side a:"));
            double b = Double.parseDouble(JOptionPane.showInputDialog("Enter side b:"));
            double angleC = Double.parseDouble(JOptionPane.showInputDialog("Enter angle C (in degrees):"));
            JOptionPane.showMessageDialog(null, "Third side: " + CalculateTriangleSide(a, b, angleC));
        } else if (choice == 6) {
            double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius:"));
            double angle = Double.parseDouble(JOptionPane.showInputDialog("Enter central angle (in degrees):"));
            JOptionPane.showMessageDialog(null, "Area of Circle Segment: " + CalculateCircleSegmentArea(radius, angle));
        } else if (choice == 7) {
            double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius:"));
            JOptionPane.showMessageDialog(null, "Surface Area of Sphere: " + CalculateSurfaceSphereArea(radius));
        } else {
            JOptionPane.showMessageDialog(null, "Invalid choice!");
        }

    }

}