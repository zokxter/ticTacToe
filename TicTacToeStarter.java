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

import ticTacToe.TicList.Xoxo;

@RestController
public class TicTacToeStarter {

    private final AtomicInteger counter = new AtomicInteger();
    private List<Game> listGame = new ArrayList<Game>();

    /**
     * 
     * @param first
     * @param second
     * @return
     */
    @RequestMapping( value  = "/game/new", params = {"first","second"}, method = RequestMethod.GET)
    public Game startTicTacToe(@RequestParam("first") String first,@RequestParam("second") String second ) {
        Game newGame = new Game(counter.incrementAndGet(),first, second);
        listGame.add(newGame);
        return newGame;
    }
    
    /**
     * 
     * @param id
     * @return
     */
    @RequestMapping( value  = "/game/status", params = {"gameId"}, method = RequestMethod.GET)
    public Game gameStatus(@RequestParam("gameId") int id) {
    	return listGame.get(id-1); //TODO: check if the list is empty
    }
    
    /**
     * 
     * @param id
     * @param row
     * @param column
     * @return
     */
    @RequestMapping( value  = "/game/play", params = {"gameId","row","column"}, method = RequestMethod.GET)
    public ResponseEntity<String> gamePlay(@RequestParam("gameId") int id, @RequestParam("row") int row,@RequestParam("column") int column ) {
    	//TODO : implement
    	return new ResponseEntity<String>(HttpStatus.PRECONDITION_FAILED);
    }
}
