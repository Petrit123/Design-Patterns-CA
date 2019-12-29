package Entity;

import java.sql.Time;

import java.util.Date;
import java.util.List;

import Strategy.PaymentMethod;

public class BookingEntity {
	
	private int bookingId;
	private int userId;
	private int movieTheaterId;
	private int movieId;
	private double amount;
	private Time movieShowingTime;
	private Date dateBooked;
	private String bookingStatus;
	private int numTickets;
	private List<SeatEntity> seats;
	
	public BookingEntity(int bookingId, int userId, int movieTheaterId, int movieId, double amount, Time movieShowingTime,
						 Date dateBooked, String bookingStatus, int numTickets, List<SeatEntity> seats) {
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
	public List<SeatEntity> getSeats() {
		return seats;
	}
	public void setSeats(List<SeatEntity> seats) {
		this.seats = seats;
	}
	
	public void pay(PaymentMethod paymentMethod) {
		paymentMethod.pay(amount);
	}
	
}
