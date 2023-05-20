/*
Elizar Sta Maria
CPE - 102 
08 Hands-on Activity 1 - ARG
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Act{

    public static void main(String args[]){  

       try{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your student number: ");
        String EnterId = scan.next();
        Pattern patt = Pattern.compile("[0-9]{4}-[0-9]{2}-[0-9]{3}");
        String Exisitng_Id = EnterId;
   
        Matcher checker = patt.matcher(Exisitng_Id);
        if(checker.matches() == true){
            System.out.println("Logged Successfully!");
            System.out.println("Welcome!");
        }
        else if(checker.matches() != true){
            System.out.println("Wrong Number");
        }
        else{
            System.out.println("invalid character");
        }

       }catch(Exception e){
        System.out.println(e.getMessage());
       }

    }

}