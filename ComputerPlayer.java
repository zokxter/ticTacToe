package ticTacToe;

import lombok.Data;
import ticTacToe.Strategy.Level;
import ticTacToe.TicList.Xoxo;

public @Data class ComputerPlayer extends Player {

	private Level level;

	public ComputerPlayer(String name, Xoxo xo, Level level) {
		super(name, xo);
		this.level = level;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}
}
