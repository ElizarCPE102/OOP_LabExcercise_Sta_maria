/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package foodmenu_elizar;

import java.util.*;
public class FoodMenu_Elizar {

    private String name = " ";
    private double price = 0.0d;
    

    
    public FoodMenu_Elizar(String A, double B){
        this.name = A; 
        this.price = B;
    }
    
   public void getitem (){
        
   }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
            System.out.println(" Menu ");
            System.out.println("---------------");
            System.out.println("1. Insert ");       
            System.out.println("2. Edit ");
            System.out.println("3. View ");
            System.out.println("4. Exit ");
            System.out.println("---------------");
            int select = scan.nextInt();
        
            if (select == 1){
                   for(int f = 0; f < 11; f++){       
                  {
                System.out.print("Enter Food Name: ");
                String Afoodname = scan.next();
                System.out.print("Enter Price: ");
                double Bfoodprice = scan.nextDouble();
                FoodMenu_Elizar Food = new FoodMenu_Elizar(Afoodname, Bfoodprice);
                   }
                  }                     
                }           
            
            if (select == 3){
            
                
            }
            
            
            
            
            if (select == 4){
                System.out.println("Program Finished");
            } 
    } 
    }
