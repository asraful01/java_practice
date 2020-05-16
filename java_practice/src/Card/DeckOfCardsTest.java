package Card;

public class DeckOfCardsTest {
	//excute application
	
	//call main
	
	public static void main(String[]args) {
		DeckOfCards deck=new DeckOfCards();
		deck.shuffle();//place Cards in random order
		
		for(int i=1;i<=52;i++) {
			System.out.printf("%-19s", deck.dealCard());
		
		if(i%4==0)
			System.out.println();//output a newline after every fourth card
		}//end for
	}//end main
	

}//end class
