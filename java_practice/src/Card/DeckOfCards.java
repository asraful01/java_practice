package Card;

import java.util.Random;

public class DeckOfCards {

	private Card[] deck;//array of Card objects
	private int currentCard;//index of next Card to be dealt(0-51)
	private static final int NUMBER_OF_CARDS=52; // const.# of cards
	//random number generator
	private static final Random randomNumbers=new Random();
	
	//constructor
	
		DeckOfCards(){
			//filling the deck of cards
			
			String[] faces= {"A","2","3","4","5",
								"6","7","8","9","10",
								"J","Q","K"};
			String[] suits= {"Spades","Diamonds","Clubs","hearts"};
			
			deck=new Card[NUMBER_OF_CARDS];//create a array of Card objects
			currentCard=0; //set currentCard since first card dealt is deck[0];
			
			//populating deck with Card objects
			for(int i=0;i<deck.length;i++) 
				deck[i]=new Card(faces[i%13],suits[i/13]);
					
			}//end of constructor
		
		//time to shuffle deck of cards with one-pass algorithm
		void shuffle() {
		currentCard=0;
		//for each Card. pick another random Card and sawp them
		for(int first=0;first<deck.length;first++) {
			int second=randomNumbers.nextInt(NUMBER_OF_CARDS);
			
			//swap current card with randomly selected cards
			Card temp=deck[first];
			deck[first]=deck[second];
			deck[second]=temp;	
			
			}//end of for
		}//end suffle
		
		//time to deal a card
		
		Card dealCard() {
			if(currentCard<deck.length) 
				return deck[currentCard++];//return current card in array
			else
				return null;//if all cards were dealts
			
		}//end dealCard
}//end deckOfCards

