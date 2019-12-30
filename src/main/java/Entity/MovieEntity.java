package Entity;

public class MovieEntity {
	
	private int movieId;
	private int movieTheaterId;
	private String movieName;
	private String description;
	private String cast;
	private String category;
	private String genre;
	private String duration;
	private String releaseDate;
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
