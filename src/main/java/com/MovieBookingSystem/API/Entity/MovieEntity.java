package com.MovieBookingSystem.API.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_movie")
public class MovieEntity {
	
	@Id
	@Column(name = "movieId")
	private int movieId;
	
	@Column(name = "movieTheaterId")
	private int movieTheaterId;
	
	@Column(name = "movieName")
	private String movieName;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "cast")
	private String cast;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "genre")
	private String genre;
	
	@Column(name = "duration")
	private String duration;
	
	@Column(name = "releaseDate")
	private String releaseDate;
	
	@Column(name = "numTickets")
	private int numTickets;
	
	public MovieEntity(int movieId, int movieTheaterId, String movieName, String description, String cast, String category,
					   String genre, String duration, String releaseDate, int numTickets) {
		super();
		this.movieId = movieId;
		this.movieTheaterId = movieTheaterId;
		this.movieName = movieName;
		this.description = description;
		this.cast = cast;
		this.category = category;
		this.genre = genre;
		this.duration = duration;
		this.releaseDate = releaseDate;
		this.numTickets = numTickets;
	}
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getMovieTheaterId() {
		return movieTheaterId;
	}
	public void setMovieTheaterId(int movieTheaterId) {
		this.movieTheaterId = movieTheaterId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getNumTickets() {
		return numTickets;
	}

	public void setNumTickets(int numTickets) {
		this.numTickets = numTickets;
	}
	
	

}
