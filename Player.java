package ticTacToe;

import java.util.ArrayList;

import lombok.Data;
import ticTacToe.TicList.Xoxo;

public @Data class Player {
	private final String name;
	private PlayerStatistic playerStat;
	private final Xoxo xo;

	public Player(String name, Xoxo xo) {
		this.name = name;
		this.playerStat = new PlayerStatistic();
		this.xo = xo;
	}

	/**
	 * Purpose: Get number of played games for a player
	 * 
	 * @return number of played games
	 */
	public int getNumberOfPlayedGames() {
		return this.playerStat.getWonGames() + this.playerStat.getDrawnGames() + this.playerStat.getLostGames();
	}

	public int getWonGames() {
		return playerStat.getWonGames();
	}

	public void setWonGames(int wonGames) {
		this.playerStat.setWonGames(wonGames);
	}

	public int getDrawnGames() {
		return playerStat.getDrawnGames();
	}

	public void setDrawnGames(int drawnGames) {
		this.playerStat.setDrawnGames(drawnGames);
	}

	public int getLostGames() {
		return playerStat.getLostGames();
	}

	public void setLostGames(int lostGames) {
		this.playerStat.setLostGames(lostGames);
	}

	public String getName() {
		return name;
	}

	public Xoxo getXo() {
		return xo;
	}
}
