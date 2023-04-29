/*
Elizar Sta Maria
CPE - 102
 */

package Sta_Maria_Elizar;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.*;

public class TaskPerf6 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Path filepath = Paths.get("C:\\Sta_Maria_Elizar\\Records.txt");
        String account = "Acc: ";
 
        for (int x = 1 ;  x > 0; x++){
        try {
            BufferedWriter writer = Files.newBufferedWriter(filepath, CREATE, APPEND);
            System.out.println("===============");
            System.out.println("1. Register \n" + "2. Login ");
            System.out.println("===============");

            int select = scan.nextInt();
            if(select == 1){
                    System.out.println("Enter new username: ");
                    String name = scan.next();
                    System.out.println("Enter new password: ");
                    String password = scan.next();
                    account = name + "," + password;
                    writer.write(account);
                    writer.newLine();
                    System.out.println("Registered successfully");
                    writer.close();            
            }
            if(select == 2){
                    System.out.println("Enter username: ");
                    String kname = scan.next();
                    System.out.println("Enter password: ");
                    String kpass = scan.next();
                    Scanner checker = new Scanner(filepath);
                    while (checker.hasNextLine()) {
                        String line = checker.nextLine();
                        String[] acc = line.split(",");
                        if (kname.equals(acc[0]) && kpass.equals(acc[1])) {
                            System.out.println("Successfully logged In!");
                            break;
                        }
                        else {
                            System.out.println("Invalid username or password! ");
                        }
                    }
                    checker.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        continue;
    }
        scan.close();
    }

}
//last edited on Laboratory - 4/29/23
