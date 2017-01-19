package ticTacToe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import lombok.Data;
import ticTacToe.TicList.Xoxo;

public @Data class Game {

	private static final String COMPUTER = "computer";

	public enum Status {
		NOT_STARTED, IN_PROGRESS, FINISHED;
	}

	private int gameId;
	private Board board;
	private Status status;
	private UserPlayer userPlayer;
	private ComputerPlayer computer;
	private String winner;

	public Game(int gameId, String player1, String player2) {
		this.gameId = gameId;
		this.board = new Board();
		this.status = Status.NOT_STARTED;
		if (player1.equals(COMPUTER) || (!player1.equals(COMPUTER) && !player2.equals(COMPUTER))) {
			this.userPlayer = new UserPlayer(player1, Xoxo.O);
			this.computer = new ComputerPlayer(COMPUTER, Xoxo.X, Strategy.getLevel(this.userPlayer));
		} else {
			this.userPlayer = new UserPlayer(player1, Xoxo.X);
			this.computer = new ComputerPlayer(COMPUTER, Xoxo.O, Strategy.getLevel(this.userPlayer));
		}
		this.winner = "";
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public UserPlayer getUserPlayer() {
		return userPlayer;
	}

	public void setUserPlayer(UserPlayer userPlayer) {
		this.userPlayer = userPlayer;
	}

	public ComputerPlayer getComputer() {
		return computer;
	}

	public void setComputer(ComputerPlayer computer) {
		this.computer = computer;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}
}
