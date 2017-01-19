package ticTacToe;

import java.util.ArrayList;
import java.util.List;

public class Board {
	private List<TicList> ticTacToeList;

	public Board() {
		this.ticTacToeList = new ArrayList<TicList>();
	}

	public List<TicList> getTicTacToeList() {
		return ticTacToeList;
	}

	public void setTicTacToeList(List<TicList> ticTacToeList) {
		this.ticTacToeList = ticTacToeList;
	}

}
