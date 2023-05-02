package com.tictactoegame;

public class TicTacToe {

	static char board[][];
	
	public TicTacToe() {
		board=new char[3][3];
		initBoard();
	}
	// Initializing array board
	void initBoard() {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				board[i][j]=' ';
			}
		}
	}
	// display method to show Board on console
	static void dispBoard(){ 
		System.out.println("___________");
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				System.out.print(board[i][j]+ " | ");
			}
			System.out.println();
			System.out.println("___________");
		}
	}
	// Marking of X or O with passing argument
	static void placeMark(int row,int col,char mark){
		if(row>=0 && row<=2 && col>=0 && col<=2) {
			board[row][col]=mark;
		}else {
			System.out.println("Invalid Position");
		}
	}
	
	// check winning for Column-wise 
	static boolean checkColWin() {
		for(int j=0;j<=2;j++) {
			if(board[0][j]!=' ' && board[0][j]==board[1][j] && board[1][j]==board[2][j])	// board[0][j]=' ' use to check that index is filled or not
			{
				return true;
			}
		}
		return false;
	}
	// check winning for Row-wise
	static boolean checkRowWin() {
		for(int i=0;i<=2;i++) {
			if(board[i][0]!=' ' && board[i][0]==board[i][1] && board[i][1]==board[i][2])
			{
				return true;
			}
		}
		return false;
	}
	// check winning for Diagonally
	static boolean checkDiagWin() {
		if(board[0][0]!=' ' && board[0][0]==board[1][1] && board[1][1]==board[2][2] 
				|| board[0][2]!=' ' &&	board[0][2]==board[1][1] && board[1][1]==board[2][0]){
		return true;
		}
		else{
	return false;
			}
		}
	// check condition for draw the match
	static boolean checkDraw(){
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				if(board[i][j]==' ') {	// if we found any empty space in board after checking winning condition
										//then this condition will check 
					return false;
				}
			}
		}
		return true;
	}
}
