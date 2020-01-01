package com.MovieBookingSystem.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.MovieBookingSystem.Strategy.PaymentMethod;

public class BookingDTO{
	

	private int bookingId;
	
	private int userId;
	
	private int movieTheaterId;
	
	private int movieId;
	
	private double amount;
	
	private String movieShowingTime;
	
	private String dateBooked;
	
	private String bookingStatus;
	
	private int numTickets;
	
	private int seatId;
	
	public BookingDTO() {
		
	}
	
	public BookingDTO(int bookingId, int userId, int movieTheaterId, int movieId, double amount, String movieShowingTime,
						 String dateBooked, String bookingStatus, int numTickets, int seatId) {

		this.bookingId = bookingId;
		this.userId = userId;
		this.movieTheaterId = movieTheaterId;
		this.movieId = movieId;
		this.amount = amount;
		this.movieShowingTime = movieShowingTime;
		this.dateBooked = dateBooked;
		this.bookingStatus = bookingStatus;
		this.numTickets = numTickets;
		this.seatId = seatId;
	}
	
	public BookingDTO(BookingEntity entity) {
		
		this.bookingId = entity.getBookingId();
		this.userId = entity.getUserId();
		this.movieTheaterId = entity.getMovieTheaterId();
		this.movieId = entity.getMovieId();
		this.amount = entity.getAmount();
		this.movieShowingTime = entity.getMovieShowingTime();
		this.dateBooked = entity.getDateBooked();
		this.bookingStatus = entity.getBookingStatus();
		this.numTickets = entity.getNumTickets();
		this.seatId = entity.getSeatId();
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
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	
	public void pay(PaymentMethod paymentMethod) {
		paymentMethod.pay(amount);
	}
	
}
