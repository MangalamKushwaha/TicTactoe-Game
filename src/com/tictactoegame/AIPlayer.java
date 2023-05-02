package com.tictactoegame;

import java.util.Random;
import java.util.Scanner;

//there are two player in game 
//Second player name as AI Player

public class AIPlayer extends Player{	// Using Inheritance we inherited property from Player Class
	public AIPlayer(String name, char mark) {
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
			Random r=new Random();	// Random is class in java which takes random integer values 
			row=r.nextInt(3);		//Random(3) will take value as 0,1,2 (but it will exclude 3)
			col=r.nextInt(3);
		}while(!isValidMove(row,col));  // Let at (2,1) has already X and you again fill at (2,1) then it will tell you to choose another index
		// after make move we need to mark the character 'X' or 'O' in game
		TicTacToe.placeMark(row,col,mark); // want to access without creating object, using class name as placeMark is static in TicTacToe class
											// classname.fxnname() 
		
	}
}
