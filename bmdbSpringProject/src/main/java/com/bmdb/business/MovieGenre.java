package com.bmdb.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity // This tells Hibernate to make a table out of this class
public class MovieGenre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "movieID")
	private Movie movie; // specifies many Movie Genres for one movie
	@ManyToOne // specifies many MovieGenre objects to one genre
	@JoinColumn(name = "genreID")
	private Genre genre;
	@ManyToOne // specifies many MovieGenre objects to one actor
	@JoinColumn(name = "actorID")
	private Actor actor;
	
	// getters and setters
	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
}