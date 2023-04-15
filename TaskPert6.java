/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//Elizar Sta Maria
//Cpe - 102
package taskpert6;

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.*;
import java.text.*;
import static java.nio.file.AccessMode.EXECUTE;


public class TaskPert6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Path file = 
                Paths.get("c:\\Java\\StaMaria\\TPact.txt");
        String s = "";
        String delimeter = ",";
        long Account;
        String name;
       int passoword;
        final long QUIT = 0;
        boolean condition = true;
        try{
            OutputStream output = new
                BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer = new 
                BufferedWriter(new OutputStreamWriter(output));
            for(int x = 1; x > 0; x++){
            System.out.println("1. Register \n" + " 2. Login \n" + " 3. Done ");
            int input = scan.nextInt();
            if(input == 1){
           
            while(condition != false)
            {
                System.out.println(" Enter Name NO. : " +": ");
                scan.nextLine();
                name = scan.nextLine();
                System.out.println("Enter Password: ");
                passoword = scan.nextInt();
                DecimalFormat df = new DecimalFormat("0.00");
                s = name + delimeter + df.format(passoword);
                writer.write(s, 0, s.length());
                writer.newLine();
                    condition = false;
                    System.out.println("Successfully Registered");
            }continue;
            
            }
            writer.close();
            
            }
        }catch(Exception e){
            System.out.println("Message: " + e);
        }
    }
    
}
