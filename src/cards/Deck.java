package cards;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

	Card [] deckOfCards = new Card [52];
	Card [] shuffledDeck = new Card [52];
	ArrayList<Card> deck = new ArrayList();
	private int counter=0;

	public Deck(){

		for (Suit s : Suit.values()){
			for (Rank r : Rank.values()){
				deckOfCards [counter] = new Card(r, s);
				counter++;
			}
		}
	}

	public static void main (String [] args){

		Deck d = new Deck();
		d.shuffle();
		d.showDeck();
		d.dealAcard();

	}

	public void showDeck(){
		for (Card c : deckOfCards){
			System.out.println(c);
		}
		System.out.println("\n\n");
		for (Card sh : shuffledDeck){
			if (sh != null){
				System.out.println(sh);
			}

		}

	}

	public void shuffle(){
		for (Card c : deckOfCards){
			deck.add(c);
		}

		int increment=0;
		Random r = new Random();
		for (Card c : shuffledDeck){
				shuffledDeck[increment]=deck.remove(r.nextInt(deck.size()));
				increment++;
			
		}

	}

	public void dealAcard(){
		System.out.println("\nThe next card is: "+shuffledDeck[0]);
	}

}
