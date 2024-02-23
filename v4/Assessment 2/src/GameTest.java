import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void addToUserDeck() {
        ArrayList <String> userDeck = new ArrayList<>();
        userDeck.add("5 of Hearts");
        System.out.println(userDeck.get(0));
        assertEquals(userDeck.get(0), "5 of Hearts");
    }

    @Test
    void userSelectsCard() {
        ArrayList <String> userDeck = new ArrayList<>();
        userDeck.add("5 of Hearts");
        System.out.println("Deck: " + userDeck);
        Scanner scanner = new Scanner(System.in);
        int selectedIndex = 1;
        if(selectedIndex == 1){
            String selectedCard = userDeck.get(selectedIndex - 1);
            System.out.println("Selected Card: " + selectedCard);
            assertEquals(userDeck.get(0), selectedCard);
        }

    }

    @Test
    void splitCard(){
        ArrayList <String> userDeck = new ArrayList<>();
        userDeck.add("5 of Hearts");
        System.out.println("Deck: " + userDeck);
        Scanner scanner = new Scanner(System.in);
        int selectedIndex = 1;
        if(selectedIndex == 1){
            String[] selectedCard = userDeck.get(selectedIndex - 1).split(" of ");
            System.out.println("Rank: " + selectedCard[0]);
            System.out.println("Suit: " + selectedCard[1]);
            assertEquals(selectedCard[0], "5");
            assertEquals(selectedCard[1], "Hearts");
        }
    }

    @Test
    void make11() {
        int score = 0;
        ArrayList<String> userDeck = new ArrayList<>();
        ArrayList<String> computerDeck = new ArrayList<>();

        System.out.println("Score " + score);
        userDeck.add("5 of Hearts");
        computerDeck.add("6 of Hearts");
        System.out.println("Deck: " + userDeck);
        Scanner scanner = new Scanner(System.in);
        int selectedIndex = 1;
        if (selectedIndex == 1) {
            String[] selectedCard = userDeck.get(selectedIndex - 1).split(" of ");
            String[] computerSplit = computerDeck.get(0).split(" of ");
            int uRank = Integer.parseInt(selectedCard[0]);
            int cRank = Integer.parseInt(computerSplit[0]);
            System.out.println("Rank: " + selectedCard[0]);
            System.out.println("Suit: " + selectedCard[1]);
            System.out.println("CRank: " + computerSplit[0]);
            System.out.println("CSuit: " + computerSplit[1]);
            score++;
            System.out.println("Total: " + (uRank + cRank));
            System.out.println("Score: " + score);
            assertEquals(11, uRank+cRank);
            assertEquals(score, 1);
        }
    }

    

}