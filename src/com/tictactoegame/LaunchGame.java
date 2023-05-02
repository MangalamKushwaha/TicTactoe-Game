package com.tictactoegame;

public class LaunchGame {

	public static void main(String[] args) {
		TicTacToe t=new TicTacToe();
		t.dispBoard();
//		System.out.println(t.checkColWin());
//		System.out.println(t.checkRowWin());	 
//		System.out.println(t.checkDiagWin());
		
		
		
		HumanPlayer p1=new HumanPlayer("Nim",'x');
	//	HumanPlayer p2=new HumanPlayer("AAm",'O');	// if two human are playing then use this
		AIPlayer p2=new AIPlayer("AI PALYER",'O');
		Player cp; // creating reference type object
			cp=p1; // here assume that cp=current player
			while(true)
			{
				System.out.println(cp.name+ " turn");
				cp.makeMove();
				TicTacToe.dispBoard();	// to print the move of player 
				if(TicTacToe.checkDiagWin() || TicTacToe.checkRowWin() ||TicTacToe.checkColWin()) {
					System.out.println(cp.name+ " has won");
					break;
				}
				else if(TicTacToe.checkDraw()) {
					System.out.println("Game is draw");
					break;
				}
				else {
					if(cp==p1) {
						cp=p2;
					}else {
						cp=p1;
					}
				}
			}
	}
}
