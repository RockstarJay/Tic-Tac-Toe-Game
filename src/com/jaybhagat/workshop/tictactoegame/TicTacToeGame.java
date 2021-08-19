package com.jaybhagat.workshop.tictactoegame;

import java.util.Scanner;

/*
 * class to play the tic tac toe game
 * @author com.jaybhagat
 */

public class TicTacToeGame {
	public static char playerOption,computerOption;
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		//function call
		char[] board = createBoard();
		// method call to choose the option
		chooseXorO();
	}
	
	/*
	 * method for a empty board
	 * 0th index is ignored for user understading
	 */
	private static char[] createBoard() {
		char[] board = new char[10];  
		for(int index = 1; index < board.length; index++) {
			board[index] = ' ';
		}
		return board;
	}
	
	/*
	 * asking user to choose between X or O to play the game
	 * computer will be assign with the other one available 
	 */
	static void chooseXorO() {
		 System.out.print("Choose an Option x or o : ");
		 playerOption = scanner.next().charAt(0);
		 if (playerOption == 'x')
			 computerOption='o';
		 else
			 computerOption ='x';
		 System.out.println("You Selected : " +playerOption);
	 }
}