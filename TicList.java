package ticTacToe;

public class TicList {

	public enum Xoxo {
		X("X"), O("O"), BLANK("");

		public String xo;

		Xoxo(String xo) {
			this.xo = xo;
		}
	}

	public enum PlayerEnum {
		COMPUTER, USER, NO_ONE;
	}

	private int row;
	private int column;
	private Xoxo value;
	private PlayerEnum playerEnum;

	public TicList(int row, int column, PlayerEnum playerEnum) {
		this.row = row;
		this.column = column;
		this.value = Xoxo.BLANK;
		this.playerEnum = playerEnum;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public Xoxo getXo() {
		return value;
	}

	public void setXo(Xoxo xo) {
		this.value = xo;
	}

	public Xoxo getValue() {
		return value;
	}

	public void setValue(Xoxo value) {
		this.value = value;
	}

	public PlayerEnum getPlayerEnum() {
		return playerEnum;
	}

	public void setPlayerEnum(PlayerEnum playerEnum) {
		this.playerEnum = playerEnum;
	}
}
