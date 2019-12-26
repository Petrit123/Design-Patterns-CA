package Seat;

public class Seat {
	
	private String column;
	private int row;
	private String seatStatus;
	
	public Seat(String column, int row, String seatStatus) {
		super();
		this.column = column;
		this.row = row;
		this.seatStatus = seatStatus;
	}
	
	public String getColumn() {
		return column;
	}
	public void setColumn(String column) {
		this.column = column;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public String getSeatStatus() {
		return seatStatus;
	}
	public void setSeatStatus(String seatStatus) {
		this.seatStatus = seatStatus;
	}

}
