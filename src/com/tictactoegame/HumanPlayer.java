package com.tictactoegame;

import java.util.Scanner;


// there are two player in game 
// First player name as Human Player
public class HumanPlayer extends Player{	//  Using Inheritance we inherited property from Player Class
	public HumanPlayer(String name, char mark) {
		//super();
		this.name = name;
		this.mark = mark;
	}
	// take move of first player and take input from Human player
	void makeMove(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and column:");
		int row;
		int col;
		do {
			row=sc.nextInt();
			col=sc.nextInt();
		}while(!isValidMove(row,col));  // Let at (2,1) has already X and you again fill at (2,1) then it will tell you to choose another index
		// after make move we need to mark the character 'X' or 'O' in game
		TicTacToe.placeMark(row,col,mark); // want to access without creating object, using class name as placeMark is static in TicTacToe class
											// classname.fxnname() 
	}
}
