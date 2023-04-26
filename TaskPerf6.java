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
        Path doc = Paths.get("C:\\Elizar\\record3.txt");
        String delimiter = ",";
        String account = "";
 
        try {
            BufferedWriter writer = Files.newBufferedWriter(doc, CREATE, APPEND);
            System.out.println("===============");
            System.out.println("1. Register \n" + "2. Login ");
            System.out.println("===============");

            int select = scan.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Enter new username: ");
                    String name = scan.next();
                    System.out.println("Enter new password: ");
                    String password = scan.next();
                    account = name + delimiter + password;
                    writer.write(account);
                    writer.newLine();
                    System.out.println("Registered successfully");
                    writer.close();
                    break;
                case 2:
                    System.out.println("Enter username: ");
                    String kname = scan.next();
                    System.out.println("Enter password: ");
                    String kpass = scan.next();
                    Scanner checker = new Scanner(doc);
                    while (checker.hasNextLine()) {
                        String line = checker.nextLine();
                        String[] acc = line.split(delimiter);
                        if (kname.equals(acc[0]) && kpass.equals(acc[1])) {
                            System.out.println("Successfully logged In!");
                            break;
                        }
                        else {
                            System.out.println("Invalid username or password! ");
                        }
                    }
                    checker.close();
                    break;
            }
        } catch (Exception e) {
            
        }
        scan.close();
    }

}
