
import java.util.Scanner;

public class BlackJackGame {
	
	public static int computeScore(Card[] hand, int index)
	{
		int score = 0;
		boolean hasAce = false;
		
		for(int i = 0; i < index; i++) 
		{
			if(hand[i].getValue() == 1) 
			{
				hasAce = true;
			}
			score += hand[i].getValue();
		}
		
		if(hasAce && score <= 11) 
		{
			score += 10;
		}
		
		return score;
	}

	public static void main(String[] args) 
	{
		
//		Card c = new Card();
//		System.out.println(c);
		
		Card[] playerHand = new Card[10];
		int playerIndex = 0;
		Card[] dealerHand = new Card[10];
		int dealerIndex = 0;
		
		String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
		String[] displayValues = {"Two", "Three", "Four", "Five", 
									"Six", "Seven", "Eight", "Nine", 
									"Ten", "Jack", "Queen", "King",
									"Ace"};
		
		int[] values = {2,3,4,5,
						6,7,8,9,
						10,10,10,10,
						1};
		
		Deck d = new Deck(suits, displayValues, values);
//		System.out.println(d.getCards()[5]);
//		System.out.println(d);
//		
//		System.out.println(d.deal());
//		System.out.println(d.deal());
		
		d.shuffle(10000);
//		System.out.println(d);
		
		playerHand[playerIndex] = d.deal();
		playerIndex++;
		dealerHand[dealerIndex] = d.deal();
		dealerIndex++;
		
		playerHand[playerIndex++] = d.deal();
		dealerHand[dealerIndex++] = d.deal();
		
		System.out.println("Player Hand: ");
		for(int i = 0; i < playerIndex; i++) 
		{
			System.out.println(playerHand[i]);
		}
		
		System.out.println();
		System.out.println("Dealer Hand: ");
		for(int i = 0; i < dealerIndex; i++) 
		{
			System.out.println(dealerHand[i]);
		}
		
		//This is where adding card to hand logic goes
		
		if(computeScore(playerHand, playerIndex) == 21)
		{
			System.out.println("Blackjack!");
			System.exit(0);
		}
		
		Scanner k = new Scanner(System.in);
		System.out.println("Do you want another card? (yes/no)");
		String userInput = k.nextLine();
		
		while(userInput.toLowerCase().equals("yes"))
		{
			playerHand[playerIndex] = d.deal();
			playerIndex++;
			
			System.out.println();
			for(int i = 0; i < playerIndex; i++) 
			{
				System.out.println(playerHand[i]);
			}
			
			if(computeScore(playerHand, playerIndex) >= 21)
			{
				break;
			}
			
			System.out.println("Do you want another card? (yes/no)");
			userInput = k.nextLine();
		}
		
		while(computeScore(playerHand, playerIndex) <= 21 && computeScore(dealerHand, dealerIndex) < 17)
		{
			dealerHand[dealerIndex] = d.deal();
			dealerIndex++;
		}
		
		//We need to score the hands (almost done)
		
		int playerScore = computeScore(playerHand, playerIndex);
		int dealerScore = computeScore(dealerHand, dealerIndex);
		
		System.out.println("\nPlayer Score: " + playerScore + " Dealer Score: " + dealerScore);
		
		if(playerScore > 21) 
		{
			System.out.println("Dealer Wins!");
		}		
		else if(playerScore > dealerScore || dealerScore > 21)
		{
			System.out.println("Player Wins!");
		}
		else
		{
			System.out.println("Dealer Wins!");
		}
		
	}

}
