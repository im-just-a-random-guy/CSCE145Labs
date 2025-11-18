
//Written by Ryan Cook

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);

		int userPoints = 0;
		int comPoints = 0;

		int userNum = 0;

		int maxRounds = 3;		//added a variable for 3 so there are no "magic numbers" in the for-loops

		boolean gameActive = true;

		System.out.println();

		System.out.println("Welcome to Rock Paper Scissors");
		System.out.println();

		while(gameActive) 
		{

			for(int round = 1; round <= maxRounds; round++) 
			{
				System.out.println("Enter Rock, Paper, or Scissors");



				//User Input

				//Used numbers corresponding to each input to make it easier to compare to the computer's choice

				String userInput = k.nextLine();

				if (userInput.equals("Rock") || userInput.equals("rock")) 
				{
					userNum = 1;
				}

				else if (userInput.equals("Paper") || userInput.equals("paper")) 
				{
					userNum = 2;
				}

				else if (userInput.equals("Scissors") || userInput.equals("scissors")) 
				{
					userNum = 3;
				}

				//Added a little ha ha funny kekw
				else if (userInput.equals("Dinosaur") || userInput.equals("Gun") || userInput.equals("Nuke")) 
				{
					System.out.println("...Really? What are we, five?");
					System.out.println("Just for that, you dont get to play anymore. >:(");
					System.exit(0);
				}

				else 
				{
					userNum = 4;
				}


				//Computer Input

				int comNum = (int)(Math.random() * 3) + 1;

				String comRoll = "";

				if (comNum == 1) 
				{
					comRoll = "Rock";
				}

				else if(comNum == 2) 
				{
					comRoll = "Paper";
				}

				else if (comNum == 3) 
				{
					comRoll = "Scissors";
				}

				//		System.out.println(comNum + ", " + comRoll);	//Used this to test out if the number and selection coincide


				//Results from comparing both user input and computer selection

				//tie.
				if (userNum == comNum) 
				{
					System.out.println("" + userInput + " v " + comRoll);
					System.out.println("This round is a tie!");
					String score = "Player Points: " + userPoints + "      Computer Points: " + comPoints;
					System.out.println(score);
				}

				//computer wins
				else if ((userNum == 1 && comNum == 2) || (userNum == 2 && comNum == 3) || (userNum == 3 && comNum == 1)) 
				{
					System.out.println("" + userInput + " v " + comRoll);
					System.out.println("Com wins this round!");
					comPoints+= 1;
					String score = "Player Points: " + userPoints + "      Computer Points: " + comPoints;
					System.out.println(score);
				}

				//player wins
				else if ((userNum == 1 && comNum == 3) || (userNum == 2 && comNum == 1) || (userNum == 3 && comNum == 2)) 
				{
					System.out.println("" + userInput + " v " + comRoll);
					System.out.println("Player wins this round!");
					userPoints+= 1;
					String score = "Player Points: " + userPoints + "      Computer Points: " + comPoints;
					System.out.println(score);
				}
				
				//user inputs an invalid response
				else if (userNum == 4) 
				{
					System.out.println("Invalid Input. Computer gets the point");
					comPoints+= 1;
					String score = "Player Points: " + userPoints + "      Computer Points: " + comPoints;
					System.out.println(score);
				}

				System.out.println();

			}

			gameActive = false;

			//End Results
			if (userPoints > comPoints) 
			{
				System.out.println("PLAYER WINS OVERALL!!!");
			}

			else if (userPoints < comPoints) 
			{
				System.out.println("COMPUTER WINS OVERALL!!!");
			}

			else if (userPoints == comPoints) 
			{
				System.out.println("IT WAS AN OVERALL TIE!");
			}

			System.out.println();

			//Asks if the user wants to play again
			System.out.println("want to play again? Type yes or no.");

			String playAgain = k.nextLine();

			//Starts the game again, and sets points to 0
			if (playAgain.equals("yes") || playAgain.equals("Yes")) 
			{
				gameActive = true;
				userPoints = 0;
				comPoints = 0;
			}

			//The program terminates naturally
			else if (playAgain.equals("no") || playAgain.equals("No")) 
			{
				System.out.println("Goodbye");
			}

			else 
			{
				System.out.println("Im gonna take that as no. Goodbye");
			}
		}


		//		int dice = (int)(Math.random() * 6) + 1;		//testing a random number generator for the game
		//		System.out.println("You rolled " + dice);


	}

}
