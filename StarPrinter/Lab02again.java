
//Written by Ryan Cook


/*
 * Note: the reason this file is titled Lab02again is because I messed up my first few attempt so badly that I just needed to start fresh
 */

import java.util.Scanner;

public class Lab02again {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a number");
		int userInput = keyboard.nextInt(); 		//using this for actual code
		
		//int n = 6; 								//using this for testing

		if(userInput > 0) 							//checks if number entered is greater than 0
		{


			for(int i = 1; i <= userInput; i++)  	//controls how many increasing rows to print (including peak)
			{

				for(int j = 1; j <= i; j++) 		//controls how many stars to print in each row	
				{
					System.out.print("*"); 			//Prints inside of rows
				}

				System.out.println(); 				//Inserts a new row for the code to print in

			}


			for(int i = 1; i <= userInput; i++) 	//controls how many decreasing rows to print (excluding peak)
			{
				for(int j = i; j < userInput; j++)  //controls how many stars to print in each row
				{
					System.out.print("*");
				}

				System.out.println();
			}

		}

		else 										// used for when an invalid number is entered
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}

	}

}
