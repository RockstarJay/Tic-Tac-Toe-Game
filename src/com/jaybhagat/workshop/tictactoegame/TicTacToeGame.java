package com.jaybhagat.workshop.tictactoegame;

/*
 * class to print the tic tac toe game board
 * @author com.jaybhagat
 */

public class TicTacToeGame {

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		createBoard();
	}
	
	private static char[] createBoard() {
		char[] board = new char[10];
		for(int index = 0; index < board.length; index++) {
			board[index] = ' ';
		}
		return board;
	}
}