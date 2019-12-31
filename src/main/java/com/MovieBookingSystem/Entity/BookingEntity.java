package com.MovieBookingSystem.Entity;

import java.sql.Time;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.MovieBookingSystem.Strategy.PaymentMethod;

@Entity
@Table(name = "tbl_booking")
public class BookingEntity {
	
	@Id
	@Column(name = "bookingId")
	private int bookingId;
	
	@Column(name = "userid")
	private int userId;
	
	@Column(name = "movieTheaterId")
	private int movieTheaterId;
	
	@Column(name = "movieId")
	private int movieId;
	
	@Column(name = "amount")
	private double amount;
	
	@Column(name = "movieShowingTime")
	private String movieShowingTime;
	
	@Column(name = "dateBooked")
	private String dateBooked;
	
	@Column(name = "bookingStatus")
	private String bookingStatus;
	
	@Column(name = "numTickets")
	private int numTickets;
	
	@Column(name = "seats")
	private SeatEntity seat;
	
	public BookingEntity(int bookingId, int userId, int movieTheaterId, int movieId, double amount, String movieShowingTime,
						 String dateBooked, String bookingStatus, int numTickets, SeatEntity seat) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.movieTheaterId = movieTheaterId;
		this.movieId = movieId;
		this.amount = amount;
		this.movieShowingTime = movieShowingTime;
		this.dateBooked = dateBooked;
		this.bookingStatus = bookingStatus;
		this.numTickets = numTickets;
		this.seat = seat;
	}
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getMovieTheaterId() {
		return movieTheaterId;
	}
	public void setMovieTheaterId(int movieTheaterId) {
		this.movieTheaterId = movieTheaterId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getMovieShowingTime() {
		return movieShowingTime;
	}
	public void setMovieShowingTime(String movieShowingTime) {
		this.movieShowingTime = movieShowingTime;
	}
	public String getDateBooked() {
		return dateBooked;
	}
	public void setDateBooked(String dateBooked) {
		this.dateBooked = dateBooked;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public int getNumTickets() {
		return numTickets;
	}
	public void setNumTickets(int numTickets) {
		this.numTickets = numTickets;
	}
	public SeatEntity getSeats() {
		return seat;
	}
	public void setSeats(SeatEntity seat) {
		this.seat = seat;
	}
	
	public void pay(PaymentMethod paymentMethod) {
		paymentMethod.pay(amount);
	}
	
}
