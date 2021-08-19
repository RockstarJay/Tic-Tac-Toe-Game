package com.jaybhagat.workshop.tictactoegame;

import java.util.Scanner;

/*
 * class to play the tic tac toe game
 * @author com.jaybhagat
 */

public class TicTacToeGame {
	public static char[] board;
	public static char playerOption,computerOption;
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		//function call
		 createBoard();
		// method call to choose the option
		chooseXorO();
		// method call to see the board
		currentBoard();
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
			 computerOption = 'o';
		 else
			 computerOption = 'x';
		 System.out.println("You Selected : " +playerOption);
	 }
	
	/**
	 * displays board
	 * number are assigned with marks and numbers
	 */
	private static void showBoard() {
		System.out.println("\n  " + board[1] + " | " + board[2] + " | " + board[3] + " ");
		System.out.println(" ----------- ");
		System.out.println("  " + board[4] + " | " + board[5] + " | " + board[6] + " ");
		System.out.println(" ----------- ");
		System.out.println("  " + board[7] + " | " + board[8] + " | " + board[9] + " \n");
	}
	
	/**
	 * assigning elements with numbers if it is not played by the user
	 */
	private static void currentBoard() {
		board = new char[10];
		for (int i = 1; i < 10; i++) {
			if (board[i] != 'X' && board[i] != 'O') {
				board[i] = (char) ( i + '0');
			}
		}
	    showBoard();
	}
}