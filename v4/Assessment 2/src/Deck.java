//IMPORTS
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck = new ArrayList<Card>(); //arraylist to store deck of cards


    public Deck() {
        for (int i = 0; i < 52; i++) {
            this.deck.add(new Card( i % 13, i / 13)); //adds 52 cards to deck
        }
        Collections.shuffle(this.deck); //shuffles deck
    }

    public Card deal() {
        if (!this.deck.isEmpty()) {
            Card card = this.deck.get(0); //gets the first value in the deck
            this.deck.remove(0); //removes first value in the deck
            return card; //returns card
        }else return null;
    }

    public String toString() {
        String resultStr = "\n";
        for (Card card : deck) {
            resultStr += card + "\n";
        }
        return resultStr; //returns a string representation of the card
    }
}