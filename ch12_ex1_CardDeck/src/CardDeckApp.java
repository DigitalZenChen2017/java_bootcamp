//import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class CardDeckApp {

    public static void main(String[] args) {
        System.out.println("DECK");
        ArrayList <String> deck = getDeck();
        displayCards(deck);

        System.out.println("SHUFFLED DECK");
        shuffleDeck(deck);
        displayCards(deck);

        int count = 2;
        System.out.println("HAND OF " + count + " CARDS");
        ArrayList <String> hand = dealCards(deck, count);
        displayCards(hand);
    }

    private static ArrayList<String> getDeck() {
//        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
//        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", 
//            "8", "9", "10", "Jack", "Queen", "King"};
    	
    	  // create new ArrayList suits and ranks
    	  ArrayList<String> suits = new ArrayList<>();
    	  ArrayList<String> ranks = new ArrayList<>(13);
    	  
    	  // add elements to suits ArrayList
//    	  suits.add("Spades");
//    	  suits.add("Hearts");
//    	  suits.add("Diamonds");
//    	  suits.add("Clubs");
    	  
    	  Collections.addAll(suits, "Spades","Hearts", "Diamonds", "Clubs");

    	  // add elements to ranks ArrayList
//    	  suits.add("Spades");
//    	  suits.add("Hearts");
//    	  suits.add("Diamonds");
//    	  suits.add("Clubs");
//    	  suits.add("Spades");
//    	  suits.add("Hearts");
//    	  suits.add("Diamonds");
//    	  suits.add("Clubs");
    	  
    	  Collections.addAll(ranks, "Ace", "2", "3", "4", "5", "6", "7", 
            "8", "9", "10", "Jack", "Queen", "King");
    	  

//        String[] deck = new String[52];
        
    	// create deck of 52 cards ArrayList
        ArrayList<String> deck = new ArrayList<>(52);
        
        int i = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
            	 
               deck.set(i, rank + " of " + suit); // use deck.set (index, object)
                i++;
            }
        }
        return deck;
    }

    private static void displayCards(ArrayList<String> cards) {
        System.out.print("|");        
        for (String card : cards) {
            System.out.print(card + "|");
        }
        System.out.println();        
    }

    private static void shuffleDeck(ArrayList<String> deck) {
        for (int i = 0; i < deck.size(); i++) {
            String savedCard = deck.get(i);
            int randomIndex = (int) (Math.random() * deck.size()-1);
//            deck[i] = deck[randomIndex];
//            deck[randomIndex] = savedCard;
            
            deck.set(randomIndex, savedCard);
        }
    }

    private static ArrayList<String> dealCards(ArrayList<String> deck, int count) {
        ArrayList<String> hand = new ArrayList<>(count);
        for (int i = 1; i < count; i++) {
        	hand.add(deck.remove(i));
        }
        
        return hand;
    }
}