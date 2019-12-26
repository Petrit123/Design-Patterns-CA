package MovieTheater;

import java.util.List;

import Movie.Movie;


public class MovieTheater {
	
	private int movieTheaterId;
	private String movieTheaterName;
	private String movieTheaterAddress;
	private String phoneNumber;
	private String email;
	private float rating;
	private List<Movie> movies;
	
	public MovieTheater(int movieTheaterId, String movieTheaterName, String movieTheaterAddress, String phoneNumber,
			String email, float rating, List<Movie> movies) {
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
	public List<Movie> getMovies() {
		return movies;
	}
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	
}
