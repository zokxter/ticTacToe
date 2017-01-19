package ticTacToe;

import lombok.Data;

public @Data class Strategy {

	private static final double upperPercentage = 0.9;
	private static final double lowerPercentage = 0.3;

	public enum Level {
		EASY, HARD
	}

	/**
	 * Get level of the computer
	 * 
	 * @param game
	 * @return Level
	 */
	public static Level getLevel(UserPlayer player) {

		int numberOfPlayedGames = player.getNumberOfPlayedGames();

		if (numberOfPlayedGames != 0 && player.getWonGames() / (double) numberOfPlayedGames >= upperPercentage) {
			return Level.HARD;
		} else if (numberOfPlayedGames != 0
				&& player.getLostGames() / (double) numberOfPlayedGames <= lowerPercentage) {
			return Level.EASY;
		} else if (Math.random() < 0.5) {
			return Level.EASY;
		} else {
			return Level.HARD;
		}
	}
}
