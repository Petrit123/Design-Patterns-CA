package Booking;

import java.sql.Time;

import java.util.Date;
import java.util.List;

import PaymentMethod.PaymentMethod;
import Seat.Seat;

public class Booking {
	
	private int bookingId;
	private int userId;
	private int movieTheaterId;
	private int movieId;
	private double amount;
	private Time movieShowingTime;
	private Date dateBooked;
	private String bookingStatus;
	private int numTickets;
	private List<Seat> seats;
	
	public Booking(int bookingId, int userId, int movieTheaterId, int movieId, double amount, Time movieShowingTime,
			Date dateBooked, String bookingStatus, int numTickets, List<Seat> seats) {
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
		this.seats = seats;
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
	public Time getMovieShowingTime() {
		return movieShowingTime;
	}
	public void setMovieShowingTime(Time movieShowingTime) {
		this.movieShowingTime = movieShowingTime;
	}
	public Date getDateBooked() {
		return dateBooked;
	}
	public void setDateBooked(Date dateBooked) {
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
	public List<Seat> getSeats() {
		return seats;
	}
	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	
	public void pay(PaymentMethod paymentMethod) {
		paymentMethod.pay(amount);
	}
	
}
