package com.MovieBookingSystem.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_seat")
public class SeatEntity {
	
	@Column(name = "column")
	private String column;
	
	@Column(name = "row")
	private int row;
	
	@Column(name = "seat_status")
	private String seatStatus;
	
	public SeatEntity(String column, int row, String seatStatus) {
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
