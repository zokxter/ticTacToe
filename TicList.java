package ticTacToe;

public class TicList {
	
	public enum Xoxo {
		X("X"),O("O"),BLANK("");
		
		public String xo;
		
		Xoxo(String xo){
			this.xo = xo;
		}
	}
	
	private int row;
	private int column;
	private Xoxo value;
	
	
	public TicList(int row, int column) {
		super();
		this.row = row;
		this.column = column;
		this.value = Xoxo.BLANK;
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
	
	

}
