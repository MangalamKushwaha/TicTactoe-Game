package com.tictactoegame;



abstract class Player {
	String name;
	char mark;

	abstract void makeMove(); 
	
	// check that your move is valid or not
		// if your move as (5,1), it give error b/c board is 3 by 3
		boolean isValidMove(int row,int col){
			if(row>=0 && row<=2 && col>=0 && col<=2){
				if(TicTacToe.board[row][col]==' '){
					return true;
				}
			}	
			return false;
		}

}
