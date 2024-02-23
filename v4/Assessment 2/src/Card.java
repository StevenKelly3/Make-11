//IMPORTS
import java.util.Random;

public class Card {

    private int rank;
    public int suit;

    private static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"}; //stores each rank value
    private static String[] suits = {"Clubs", "Spades", "Diamonds", "Hearts"}; //stores each suits value

    public Card() {
        Random random = new Random(); //new instance of random
        this.rank = random.nextInt(Card.ranks.length); //generates a random int value between 0 and ranks array length
        this.suit = random.nextInt(Card.suits.length); //generates a random int value between 0 and suits array length
    }

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return Card.ranks[this.rank]; //returns rank value as a string
    }

    public String getSuit() {
        return Card.suits[this.suit]; //returns suit value as a string
    }



    public String toString() {
        return getRank() + " of " + getSuit(); //returns a string representation of the card
    }
}