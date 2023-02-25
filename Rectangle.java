/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangle;



import java.util.*;
public class Rectangle {

    double length = 0.0d;
    double width = 0.0d;
    double area = 0.0d;
    
    public Rectangle (double A, double B, double C){
    
        this.length = A;
        this.width = B;
        this.area = A * B;
        
    }
    
     
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println(" Enter the object's length");
        double length = scan.nextDouble();
        System.out.println(" Enter the objects width");
        double width = scan.nextDouble();
        
        
    }
    
}
