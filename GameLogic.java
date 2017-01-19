package ticTacToe;

import ticTacToe.TicList.Xoxo;

public class GameLogic {

	private static final int boardSize = 9; //TODO: make board size arbitrary n*n

	/**
	 * Check if game ended
	 * 
	 * @param game
	 * @return
	 */
	public static boolean checkIfGameEnded(Game game) {
		if (game.getBoard().getTicTacToeList().size() == boardSize || game.getWinner().isEmpty()) {
			return true;
		}
		return false;
	}

	public static void makePlayerMove(TicList ticList, Game game) {
		// TODO: implement
	}

	public static void makeComputerMove(Game game) {
		// TODO: implement
	}
}
