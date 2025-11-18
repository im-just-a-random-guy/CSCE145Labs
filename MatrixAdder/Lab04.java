
/*
 * Written by Ryan Cook
 */

//Used Arrays2D to help with the arrays. Might need to look back on it tho just to make sure.

import java.util.Scanner;

public class Lab04 {

	public static void print(String s) {

		System.out.println(s);				//used this method to avoid typing System.out.println(); for everything
	}

	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);

		print("Welcome to the matrix adder program");


		//MATRIX 1 -----------------------------------------------------------------------------

		print("Enter length and width for matrix 1");

		int uLength1 = k.nextInt();
		int uWidth1 = k.nextInt();

		int[][] matrix1 = new int[uLength1][uWidth1];

		//		System.out.println(matrix1.length);

		for(int i = 0; i < uLength1; i++) 
		{
			for(int j = 0; j < uWidth1; j++) 
			{
				System.out.println("Enter value at " + i + " " + j);
				matrix1[i][j] = k.nextInt();
			}
		}


		//MATRIX 2 ------------------------------------------------------------------------------

		print("Enter length and width for matrix 2");

		int uLength2 = k.nextInt();
		int uWidth2 = k.nextInt();

		int[][] matrix2 = new int[uLength2][uWidth2];

		//		System.out.println(matrix1.length);		Testing if the matrix was initialized correctly

		for(int i = 0; i < uLength2; i++) 
		{
			for(int j = 0; j < uWidth2; j++) 
			{
				System.out.println("Enter value at " + i + " " + j);
				matrix2[i][j] = k.nextInt();
			}
		}

		System.out.println();


		//PRINTING THE MATRICES ------------------------------------------------------------------------		

		if(uLength1 == uLength2 && uWidth1 == uWidth2) 
		{

			for (int i = 0; i < uLength1; i++) 
			{
				for (int j = 0; j < uWidth1; j++) 
				{
					System.out.print(matrix1[i][j] + " ");
				}

				System.out.println(); // new line after each row
			}

			print("+");

			for (int i = 0; i < uLength2; i++) 
			{
				for (int j = 0; j < uWidth2; j++) 
				{
					System.out.print(matrix2[i][j] + " ");
				}
				
				System.out.println(); 
			}

			print("=");

		}

		else 
		{ 
			print("Input invalid. The sizes of the two arrays must be the same as each other");
			System.exit(0);
		}


		//ADDING THE MATRICES --------------------------------------------------------------------------------------

		int[][] result = new int[uLength1][uWidth2];

		for (int i = 0; i < uLength1; i++) 
		{
			for (int j = 0; j < uWidth2; j++) 
			{
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		for (int i = 0; i < uLength1; i++) 
		{
			for (int j = 0; j < uWidth2; j++) 
			{
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}

}
