package ticTacToe;

public class TicTacToe {

    private final long id;
    private final String content;

    public TicTacToe(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
