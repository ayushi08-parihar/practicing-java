//WRITE A PROGRAM ADD FIVE PLAYER NAME AND THEIR RUNS AND PRINT THEM
import java.util.*;
public class ArrayList3 {
    public static void main(String[] args) {
        List<String> playerNames = new ArrayList<String>();
        List<Integer> playerRuns = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter player " + (i + 1) + " name: ");
            String name = sc.nextLine();
            playerNames.add(name);

            System.out.print("Enter runs scored by " + name + ": ");
            int runs = sc.nextInt();
            playerRuns.add(runs);
            sc.nextLine(); // Consume the newline
        }

        System.out.println("\nPlayer Names and Runs:");
        for (int i = 0; i < playerNames.size(); i++) {
            System.out.println(playerNames.get(i) + ": " + playerRuns.get(i) + " runs");
        }
    }
}
    