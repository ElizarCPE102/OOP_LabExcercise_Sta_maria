//"updated"
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

public void Foodlist(String A, int B){
    this.name = A;
    this.price = B;
}
public void display(){
    System.out.println(this.name + "  " + this.price);
}
public void input(){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Name: ");
    String Aname = scan.next();
    System.out.print("Enter Price: ");
    int Bprice = scan.nextInt();
    Foodlist(Aname, Bprice);
}
    public static void main(String args[]){

        FoodMenu Food = new FoodMenu(" Empty ", 0);
        FoodMenu Food1 = new FoodMenu(" Empty ", 0);
        FoodMenu Food2 = new FoodMenu(" Empty ", 0);
        FoodMenu Food3 = new FoodMenu(" Empty ", 0);
        FoodMenu Food4 = new FoodMenu(" Empty ", 0);
        FoodMenu Food5 = new FoodMenu(" Empty ", 0);
        FoodMenu Food6 = new FoodMenu(" Empty ", 0);
        FoodMenu Food7 = new FoodMenu(" Empty ", 0);
        FoodMenu Food8 = new FoodMenu(" Empty ", 0);
        FoodMenu Food9 = new FoodMenu(" Empty ", 0);
        
        //Options/selection 
        int i = 0;
        for (i = 1; i > 0; i++){ 
        Scanner scan = new Scanner(System.in);
        System.out.println(" Menu ");
        System.out.println(" 1. Insert ");
        System.out.println(" 2. Edit ");
        System.out.println(" 3. View ");
        System.out.println(" 4. Exit ");
        int s = scan.nextInt();
        switch (s){
            case 1:{
                Food.input();
                Food1.input();
                Food2.input();
                Food3.input();
                Food4.input();
                Food5.input();
                Food6.input();
                Food7.input();
                Food8.input();
                Food9.input();
            }continue;

            case 2:{
            }continue;

            case 3:{
                System.out.println(" Food Listed ");
                System.out.println("___________________");
                Food.display();
                Food1.display();
                Food2.display();
                Food3.display();
                Food4.display();
                Food5.display();
                Food6.display();
                Food7.display();
                Food8.display();
                Food9.display();
                System.out.println("___________________");
            }continue;

            case 4:{
                System.out.println(" Finished! ");
            }break;
         }
        }
    }
}
