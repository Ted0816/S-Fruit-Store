/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package new2;


/**
 *
 * @author GERALDINO_COMP111
 */
public class CIRKUL {
    double Circumference;
    double area;
    double radius;
    double diameter;
    double arc;
    
    public CIRKUL(){
    }
    public CIRKUL(double t){
        this.radius=t;
    }
   double Compute_Circumference(double t){
       return 2*Math.PI*t;
   }
   double Compute_area(double t){
    return Math.PI*t*t;
   }
     double Compute_diameter(double t){
    return t*2; 
   }
      double Compute_arc(double radius, double angle){
    return 2*Math.PI*angle/360;
    
      }
}
