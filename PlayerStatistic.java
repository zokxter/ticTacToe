package ticTacToe;

public class PlayerStatistic {
	private int wonGames;
	private int drawnGames;
	private int lostGames;

	public PlayerStatistic() {
	}

	public int getWonGames() {
		return wonGames;
	}

	public void setWonGames(int wonGames) {
		this.wonGames = wonGames;
	}

	public int getDrawnGames() {
		return drawnGames;
	}

	public void setDrawnGames(int drawnGames) {
		this.drawnGames = drawnGames;
	}

	public int getLostGames() {
		return lostGames;
	}

	public void setLostGames(int lostGames) {
		this.lostGames = lostGames;
	}
}