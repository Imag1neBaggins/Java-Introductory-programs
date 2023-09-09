package filetable;
import java.util.*;
import java.io.*;

public class FileTable {

    public static void main(String[] args) throws Exception{
        File score = new File("table.txt");
        if (!(score.exists())){
            System.out.println("No file exists");
            System.exit(0);
        }
        Scanner input = new Scanner(score);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your team: ");
        String team = in.nextLine();
        int goalG = 0, goalC = 0, wins = 0, losses = 0, points = 0, draws = 0, hwins = 0, awins = 0, i = 0;
        double hgame = 0.0, agame = 0.0;
        while (input.hasNext()) {
            String fixture = input.nextLine();
            String[] table = fixture.split(" ");
            if (table[0].equals(team)){
                hgame++;
                goalG += Integer.valueOf(table[1]);
                goalC += Integer.valueOf(table[3]);
                if (Integer.valueOf(table[1]) > Integer.valueOf(table[3])){
                    hwins++;
                    wins++;
                    points += 3;
                }
                else if (Integer.valueOf(table[1]) < Integer.valueOf(table[3])){
                    losses++;
                }
                else {
                    draws++;
                    points += 1;
                }
            }
            else {
                agame++;
                goalC += Integer.valueOf(table[1]);
                goalG += Integer.valueOf(table[3]);
                if (Integer.valueOf(table[1]) > Integer.valueOf(table[3])){
                    losses++;
                }
                else if (Integer.valueOf(table[1]) < Integer.valueOf(table[3])){
                    wins++;
                    awins++;
                    points += 3;
                }
                else {
                    draws++;
                    points += 1;
                }
            }
            i++;
        }
        System.out.println("number of wins = " + wins);
        System.out.println("number of draws = " + draws);
        System.out.println("number of losses = " + losses);
        System.out.println("goals scored = " + goalG);
        System.out.println("goals conceded = " + goalC);
        System.out.println("points = " + points);
        System.out.println("percentage of away games won = " + (awins/agame)*100 + "%");
        System.out.println("percentage of home games won = " + (hwins/hgame)*100 + "%");
    }
    
}
