package ticTacToe;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ticTacToe.TicList.PlayerEnum;
import ticTacToe.TicList.Xoxo;

@RestController
public class TicTacToeController {

	private final AtomicInteger counter = new AtomicInteger();
	private List<Game> listGame = new ArrayList<Game>();
	List<UserPlayer> listPlayer = new ArrayList<>();

	/**
	 * Purpose: Create new TicTacToe game
	 * 
	 * @param first
	 * @param second
	 * @return Game
	 */
	@RequestMapping(value = "/game/new", params = { "first", "second" }, method = RequestMethod.GET)
	public synchronized Game startTicTacToe(@RequestParam("first") String first,
			@RequestParam("second") String second) {
		Game newGame = new Game(counter.incrementAndGet(), first, second);
		listGame.add(newGame);
		updateUserPlayerList(newGame);
		return newGame;
	}

	/**
	 * Purpose: Check game status
	 * 
	 * @param id
	 * @return Game
	 */
	@RequestMapping(value = "/game/status", params = { "gameId" }, method = RequestMethod.GET)
	public synchronized Game gameStatus(@RequestParam("gameId") int id) {
		try {
			return listGame.get(id - 1);
		} catch (IndexOutOfBoundsException e) {
		}
		return null;
	}

	/**
	 * Purpose: Method for playing TicTacToe
	 * 
	 * @param id
	 * @param row
	 * @param column
	 * @return ResponseEntity
	 */
	@RequestMapping(value = "/game/play", params = { "gameId", "row", "column" }, method = RequestMethod.GET)
	public synchronized ResponseEntity<String> gamePlay(@RequestParam("gameId") int id, @RequestParam("row") int row,
			@RequestParam("column") int column) {

		Game currentGame = listGame.get(id - 1);
		List<TicList> board = currentGame.getBoard().getTicTacToeList();
		ResponseEntity<String> response = new ResponseEntity<String>(HttpStatus.PRECONDITION_FAILED);
		if (!GameLogic.checkIfGameEnded(currentGame)) {
			if (board.get(board.size() - 1).getPlayerEnum().equals(PlayerEnum.COMPUTER)) {
				GameLogic.makePlayerMove(new TicList(row, column, PlayerEnum.USER), currentGame);
				GameLogic.makeComputerMove(currentGame);
				response = new ResponseEntity<String>(HttpStatus.OK);
			} else {
				GameLogic.makeComputerMove(currentGame);
				GameLogic.makePlayerMove(new TicList(row, column, PlayerEnum.USER), currentGame);
				response = new ResponseEntity<String>(HttpStatus.OK);
			}
		}
		return response;
	}

	/**
	 * Purpose: Check player statistic
	 * 
	 * @param name
	 * @return listPlayer
	 */
	@RequestMapping(value = "/game/statistic", method = RequestMethod.GET)
	public synchronized List<UserPlayer> playerStatistic() {
		return listPlayer;
	}

	/**
	 * Update user player list
	 * 
	 * @param game
	 */
	public void updateUserPlayerList(Game game) {
		UserPlayer user = game.getUserPlayer();
		if (!checkIfUserPlayerExist(user)) {
			listPlayer.add(user);
		}
	}

	/**
	 * Check if player exists
	 * 
	 * @param player
	 * @return true if exists, false otherwise
	 */
	public boolean checkIfUserPlayerExist(UserPlayer player) {
		for (UserPlayer userPlayer : listPlayer) {
			if (userPlayer.getName().equals(player.getName())) {
				return true;
			}
		}
		return false;
	}
}
