package Card;
/*
 * Randomly generate a deck of cards .
 * Card class representing a playing cards: Suit and Face*/

public class Card {

	private String face; //face of cars {Ace,Deuce,3,...}
	private String suit; //{hearts, diamond...}
	
	//constructor
	public Card(String cardFace, String cardSuit){
		face=cardFace; //initialize face of card
		suit=cardSuit; //initialize suit of card
		
	}//end of argument card constructor
	
	//return string represention of card
	public String toString() {
		return face + " of " + suit;
	}//end toString
	
}//end class Card
