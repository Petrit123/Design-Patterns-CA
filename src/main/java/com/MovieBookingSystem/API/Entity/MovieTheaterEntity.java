package com.MovieBookingSystem.API.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_movieTheater")
public class MovieTheaterEntity {
	@Id
	@Column(name = "movieTheaterId")
	private int movieTheaterId;
	
	@Column(name = "name")
	private String movieTheaterName;
	
	@Column(name = "address")
	private String movieTheaterAddress;
	
	@Column(name = "phoneNumber")
	private String phoneNumber;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "rating")
	private float rating;
	
	@Column(name = "movies")
	private List<MovieEntity> movies;
	
	public MovieTheaterEntity(int movieTheaterId, String movieTheaterName, String movieTheaterAddress, String phoneNumber,
							  String email, float rating, List<MovieEntity> movies) {
		super();
		this.movieTheaterId = movieTheaterId;
		this.movieTheaterName = movieTheaterName;
		this.movieTheaterAddress = movieTheaterAddress;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.rating = rating;
		this.movies = movies;
	}
	
	public int getMovieTheaterId() {
		return movieTheaterId;
	}
	public void setMovieTheaterId(int movieTheaterId) {
		this.movieTheaterId = movieTheaterId;
	}
	public String getMovieTheaterName() {
		return movieTheaterName;
	}
	public void setMovieTheaterName(String movieTheaterName) {
		this.movieTheaterName = movieTheaterName;
	}
	public String getMovieTheaterAddress() {
		return movieTheaterAddress;
	}
	public void setMovieTheaterAddress(String movieTheaterAddress) {
		this.movieTheaterAddress = movieTheaterAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public List<MovieEntity> getMovies() {
		return movies;
	}
	public void setMovies(List<MovieEntity> movies) {
		this.movies = movies;
	}
	
}
