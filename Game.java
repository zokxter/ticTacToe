package ticTacToe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Game {
	
	private static final String COMPUTER = "computer";
	
	public enum Status  {
		NOT_STARTED,
		IN_PROGRESS,
		FINISHED;
	}
	
	private int gameId;
	private List<TicList> ticTacToeList;
	private Status status;
	private String player1;
	private String player2;
	private String winner;
	
	public Game(int gameId, String player1, String player2) {
		super();
		this.gameId = gameId;
		setTicTacToeList(new ArrayList<>());
		this.status = Status.NOT_STARTED;
		if(player1.equals(COMPUTER)){
			this.player1 = COMPUTER;
			this.player2 = player2;
		} else if(player2.equals(COMPUTER)){
			this.player2 = COMPUTER;
			this.player1 = player1;
		} else {
			this.player1 = player1;
			this.player2 = player2;
		}
		this.winner = "";
	}
	
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getPlayer1() {
		return player1;
	}
	public void setPlayer1(String player1) {
		this.player1 = player1;
	}
	public String getPlayer2() {
		return player2;
	}
	public void setPlayer2(String player2) {
		this.player2 = player2;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}

	public List<TicList> getTicTacToeList() {
		return ticTacToeList;
	}

	public void setTicTacToeList(List<TicList> ticTacToeList) {
		this.ticTacToeList = ticTacToeList;
	}
}
