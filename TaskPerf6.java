/*
Elizar Sta Maria
CPE - 102
 */

package Sta_Maria_Elizar;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TaskPerf6 {
    public static void main (String args[]) throws FileNotFoundException{
        Scanner scan = new Scanner(System.in);
        System.out.println("===============");
        System.out.println("1. Register \n" + "2. Login ");
        System.out.println("===============");
        int input = scan.nextInt();
        String newName;
        String newPass;

        String[] Rname = new String[1];
        String[] Rpass = new String[1];
            if(input == 1){
                for (int i = 1; i > 0; i++){
                System.out.println("Enter New Name: ");
                newName = scan.next();
                System.out.println("Enter New Password:");
                newPass = scan.next();
                File file = new File("C:\\Elizar\\Records2.txt");
                Rname[0] = newName;
                Rpass[0] = newPass;

                try{
                    FileWriter write = new FileWriter("C:\\Elizar\\Records.txt",true);
                    write.write(newName + "|" + newPass);
                    System.out.println("Registered!");
                    write.close();
                    break;
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
            }else if (input == 2){
                System.out.println("Enter Name: ");
                String Name = scan.next();
                System.out.println("Enter Password: ");     
                String Password = scan.next();
                File file = new File("C:\\Elizar\\Records2.txt");
                Scanner kk = new Scanner(file);
                
                if(Name == Rname[0] && Password == Rpass[0]){
                    System.out.println(" Logged In Successfully!");     
                }
                else
                {
                    System.out.println("Incorrect Input!");
                }
            
        }
    }
}
