//"updated version 5"
//Elizar V. Sta Maria
// CPE - 102
import java.util.Scanner;
public class FoodMenu{
private String name = " Empty ";
private int price = 0;
public FoodMenu(String A, int B){
    this.name = A;
    this.price = B;
}
public void display(){
    System.out.println(this.name + "  " + this.price);
}
    public static void main(String args[]){
        FoodMenu Food1 = new FoodMenu(" ",0);
        FoodMenu Food2 = new FoodMenu(" ",0);
        FoodMenu Food3 = new FoodMenu(" ",0);
        FoodMenu Food4 = new FoodMenu(" ",0);
        FoodMenu Food5 = new FoodMenu(" ",0);
        FoodMenu Food6 = new FoodMenu(" ",0);
        FoodMenu Food7 = new FoodMenu(" ",0);
        FoodMenu Food8 = new FoodMenu(" ",0);
        FoodMenu Food9 = new FoodMenu(" ",0);
        FoodMenu Food10 = new FoodMenu(" ",0);  
        Food1.name = null;
        Food2.name = null;
        Food3.name = null;
        Food4.name = null;
        Food5.name = null;
        Food6.name = null;  
        Food7.name = null;
        Food8.name = null;
        Food9.name = null;  
        Food10.name = null;              
        //Options/selection 
        for (int i = 1; i > 0; i++){ 
        Scanner scan = new Scanner(System.in);
        System.out.println(" Menu ");
        System.out.println(" 1. Insert ");
        System.out.println(" 2. Edit ");
        System.out.println(" 3. View ");
        System.out.println(" 4. Exit ");
        int s = scan.nextInt();
        switch (s){
            case 1:{
                System.out.print("Enter Name: ");
                String Aname = scan.next();
                System.out.print("Enter Price: ");
                int Bprice = scan.nextInt();
                FoodMenu listed = new FoodMenu(Aname, Bprice);
                System.out.println("Food Added! "); 
                if(Food1.name == null){
                Food1 =  listed;}
                if(Food2.name == null){
                    if(Food1 != listed){
                    Food2 = listed;}}
                if(Food3.name == null){
                    if(Food1 != listed){
                        if(Food2 != listed){
                        Food3 = listed;}}}
                if(Food4.name == null){
                    if(Food1 != listed){
                        if(Food2 != listed){
                            if(Food3 != listed){
                                Food4 = listed;}}}}
                if(Food5.name == null){
                    if(Food1 != listed){
                        if(Food2 != listed){
                            if(Food3 != listed){
                                if(Food4 != listed){
                                    Food5 = listed;}}}}}
                if(Food6.name == null){
                    if(Food1 != listed){
                        if(Food2 != listed){
                            if(Food3 != listed){
                                if(Food4 != listed){
                                    if(Food5 != listed){
                                        Food6 = listed;}}}}}}
                if(Food7.name == null){
                    if(Food1 != listed){
                        if(Food2 != listed){
                            if(Food3 != listed){
                                if(Food4 != listed){
                                    if(Food5 != listed){
                                        if(Food6 != listed){
                                            Food7 = listed;}}}}}}}
                if(Food8.name == null){
                    if(Food1 != listed){
                        if(Food2 != listed){
                            if(Food3 != listed){
                                if(Food4 != listed){
                                    if(Food5 != listed){
                                        if(Food6 != listed){
                                            if(Food7 != listed){
                                                Food8 = listed;}}}}}}}}
                if(Food9.name == null){
                    if(Food1 != listed){
                        if(Food2 != listed){
                            if(Food3 != listed){
                                if(Food4 != listed){
                                    if(Food5 != listed){
                                        if(Food6 != listed){
                                            if(Food7 != listed){
                                                if(Food8 != listed){
                                                    Food9 = listed;}}}}}}}}}
                if(Food9.name == null){
                    if(Food1 != listed){
                        if(Food2 != listed){
                            if(Food3 != listed){
                                if(Food4 != listed){
                                    if(Food5 != listed){
                                        if(Food6 != listed){
                                            if(Food7 != listed){
                                                if(Food8 != listed){
                                                    if(Food9 != listed){
                                                        Food10 = listed;}}}}}}}}}}
            }continue;
            case 2:{
                System.out.println("___________________");
                System.out.println("1. " + Food1.name);
                System.out.println("2. " + Food2.name);
                System.out.println("3. " + Food3.name);
                System.out.println("4. " + Food4.name);
                System.out.println("5. " + Food5.name);
                System.out.println("6. " + Food6.name);
                System.out.println("7. " + Food7.name);
                System.out.println("8. " + Food8.name);
                System.out.println("9. " + Food9.name);
                System.out.println("10. " + Food10.name);
                System.out.println("___________________");
                System.out.println("Select the Food to edit price");
                System.out.println("FoodMenu from 1 - 10 ");
                System.out.println("___________________");
                int tname = scan.nextInt();
                if (tname == 1){
                    if(Food1.name != null){
                    System.out.println("Enter New Price:");
                    int newprice = scan.nextInt();
                    Food1.price = newprice;
                    System.out.println("Food Price Succesfully Changed! ");
                    }else {
                        System.out.println("Food Not Found ");
                        continue;}}
                if (tname == 2){
                    if(Food2.name != null){
                    System.out.println("Enter New Price:");
                    int newprice = scan.nextInt();
                    Food2.price = newprice;
                    System.out.println("Food Price Succesfully Changed! ");
                    }else {
                        System.out.println("Food Not Found ");
                        continue;}}
                if (tname == 3){
                    if(Food3.name != null){
                    System.out.println("Enter New Price:");
                    int newprice = scan.nextInt();
                    Food3.price = newprice;
                    System.out.println("Food Price Succesfully Changed! ");
                    }else {
                        System.out.println("Food Not Found ");
                        continue;}}
                if (tname == 4){
                    if(Food4.name != null){
                    System.out.println("Enter New Price:");
                    int newprice = scan.nextInt();
                    Food4.price = newprice;
                    System.out.println("Food Price Succesfully Changed! ");
                    }else {
                        System.out.println("Food Not Found ");
                        continue;}}
                if (tname == 5){
                    if(Food5.name != null){
                    System.out.println("Enter New Price:");
                    int newprice = scan.nextInt();
                    Food5.price = newprice;
                    System.out.println("Food Price Succesfully Changed! ");
                    }else {
                        System.out.println("Food Not Found ");
                        continue;}}
                if (tname == 6){
                    if(Food6.name != null){
                    System.out.println("Enter New Price:");
                    int newprice = scan.nextInt();
                    Food6.price = newprice;
                    System.out.println("Food Price Succesfully Changed! ");
                    }else {
                        System.out.println("Food Not Found ");
                        continue;}}
                if (tname == 7){
                    if(Food7.name != null){
                    System.out.println("Enter New Price:");
                    int newprice = scan.nextInt();
                    Food7.price = newprice;
                    System.out.println("Food Price Succesfully Changed! ");
                    }else {
                        System.out.println("Food Not Found ");
                        continue;}}
                if (tname == 8){
                    if(Food8.name != null){
                    System.out.println("Enter New Price:");
                    int newprice = scan.nextInt();
                    Food8.price = newprice;
                    System.out.println("Food Price Succesfully Changed! ");
                    }else {
                        System.out.println("Food Not Found ");
                        continue;}}
                if (tname == 9){
                    if(Food9.name != null){
                    System.out.println("Enter New Price:");
                    int newprice = scan.nextInt();
                    Food9.price = newprice;
                    System.out.println("Food Price Succesfully Changed! ");
                    }else{
                        System.out.println("Food Not Found ");
                        continue;}}
                if (tname == 10){
                    if(Food10.name != null){
                    System.out.println("Enter New Price:");
                    int newprice = scan.nextInt();
                    Food10.price = newprice;
                    System.out.println("Food Price Succesfully Changed! ");
                    }else {
                        System.out.println("Food Not Found ");
                        continue;}}
            }continue;
            case 3:{
                System.out.println("___________________");
                System.out.println(" Food Listed ");
                System.out.println("___________________");
                Food1.display();
                Food2.display();
                Food3.display();
                Food4.display();
                Food5.display();
                Food6.display();
                Food7.display();
                Food8.display();
                Food9.display();
                Food10.display();
                System.out.println("___________________");
            }continue;
            case 4:{
                System.out.println(" Finished! ");
            }
            default :System.out.println(" invalid choice ");   
         }
         break;
        }
    }
}


/*
package labexer5b;

import java.util.*;
public class LabExer5B {
    
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
        try{ 
            System.out.println("Who is naruto's rival? ");
            System.out.println("A. Sasuke  " + "B. Gaara  "+"C. Konohamaru  ");
            
            String Answer = scan.next();
            int score = 0;
            switch (Answer){
                case "A":{
                    System.out.println(" answer is correct!");
                    score++;
                    break;
                }
                case "B":{
                    System.out.println(" answer is wrong! ");
                    break;
                }
                case "C":{
                    System.out.println(" answer is wrong! ");
                    break;
                }
            }   
        }
        catch(InputMismatchException e){
            System.out.println("Invalid Input ");
        }
        catch(ArithmeticException e){
            System.out.println(" Invalid Input Integer");
        }
        
    }
    
}
*\
