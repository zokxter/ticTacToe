package ticTacToe;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicTacToeStarter {

    private static final String template = "Tic Tac Toe GAME: %d!";
    private final AtomicLong counter = new AtomicLong();
//@RequestParam(value="name", defaultValue="Osky") String name
    @RequestMapping("/greeting")
    public TicTacToe greeting() {
        return new TicTacToe(counter.incrementAndGet(),
                            String.format(template, counter.incrementAndGet()));
    }
}
