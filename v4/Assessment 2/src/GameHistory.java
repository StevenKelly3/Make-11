//this is for the high scores!!

//IMPORTS
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GameHistory {

    public ArrayList<String> userScores = new ArrayList<>(); //array to store

    //READ HIGH-SCORES
    public GameHistory() {
        File reader = new File("src/game_history.txt"); //instance of file opens file
        String details = "";
        try {
            Scanner scanner = new Scanner(reader); //new instance of scanner
            while(scanner.hasNextLine()) { //while scanner can read the next line
                details = scanner.nextLine(); //read next line and store as details
                this.userScores.add(details); //add details to userScores
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}