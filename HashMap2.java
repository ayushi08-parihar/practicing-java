//enter player name and runs in run time
import java.util.HashMap;
import java.util.Scanner;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap<String, Integer> playerRuns = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter player name: ");
            String name = sc.next();
            System.out.println("Enter runs: ");
            int runs = sc.nextInt();
            playerRuns.put(name, runs);
            System.out.println("Do you want to add more players? (yes/no)");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("no")) {
                
                break;


            }
        }
        System.out.println(playerRuns);
    }   
    
}