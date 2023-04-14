//Elizar V. Sta Maria III - Cpe - 102
//Laboratory Exercise 5
package LABExecercise;
import java.util.*;
public class LabEXER5B{
    public static void main (String []args){
        int x = 10;
        String quest[] = new String[x];
         quest[0] = "Who is naruto's rival?\n" + "A. Sasuke B. Gaara C. Lee ";
         quest[1] = "Who is the Main Character of Onepiece?\n" + "A. Luffy B. Ichigo C. Saitama ";
         quest[2] = "10 + 10 = ?\n" + "A. 1010 B. 100 C. 20 ";
         quest[3] = "What is the color of apple?\n" + "A. Purple B. Red C. Black ";
         quest[4] = "Who paint the monaliza?\n" + "A. Leonardo dicaprio B. Leonardo da vinci C. Leonardo ";
         quest[5] = "What is the equivalent of 1 minute in seconds?\n" + "A. 100 B. 50 C. 60 ";
         quest[6] = "What is the meaning of konoha in english?\n" + "A. Hidden Leaf B. Hidden Trees C. Hidden Leaves ";
         quest[7] = "What is the planet closest to the sun?\n" + "A. Earth B. Mercury C. Pluto ";
         quest[8] = "Who lives in a pineapple under the sea?\n" + "A. Spongebob B. patrick C. Squidward ";
         quest[9] = "Mekhane belongs to what fictional universe?\n" + "A. Backrooms B. Marvel C. SCP ";
        String[] notif = {"Correct!", "Wrong!"};
        int score = 0;
        String[] answer = new String[x];
         answer[0] ="a";
         answer[1] ="a";
         answer[2] ="c";
         answer[3] ="b";
         answer[4] ="b";
         answer[5] ="c";
         answer[6] ="a";
         answer[7] ="b";
         answer[8] ="a";
         answer[9] ="c";
        Scanner scan = new Scanner(System.in);
        try{  
            for(x = 0; x < 10; x++){
                System.out.println(quest[x]);
                String ans = scan.nextLine();
                if(ans.equalsIgnoreCase("a") || ans.equalsIgnoreCase("b") || ans.equalsIgnoreCase("c")){
            if(!ans.equalsIgnoreCase(answer[x])){
                System.out.println(notif[1]);
               continue;
            } 
            else if(ans.equalsIgnoreCase(answer[x])){
                System.out.println(notif[0]);
                score++;
                continue;
            }
        }else{
            x--;
            System.out.println("Not Applicabble...\n pls try again");
            continue;
        }
    }
        }catch(Exception e){
            x--;
            System.out.println("Invalid Input");
            System.out.println("Try again");
        }
        finally{
            System.out.println("Score: " + score +"/10");
        }
    }
}
