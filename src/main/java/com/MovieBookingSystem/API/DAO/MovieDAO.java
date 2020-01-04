package com.MovieBookingSystem.API.DAO;

import com.MovieBookingSystem.API.Entity.MovieEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class MovieDAO {

    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

    @PersistenceContext
    private EntityManager entityManager;

    public int findNumMovieTickets(String movieName, int movieTheaterId) {
        List<MovieEntity> foundMovie = entityManager.createQuery("SELECT e FROM MovieEntity e WHERE e.movieName = :movieName AND e.movieTheaterId = :movieTheaterId", MovieEntity.class)
                .setParameter("movieName", movieName)
                .setParameter("movieTheaterId", movieTheaterId).getResultList();
        int numTickets = foundMovie.get(0).getNumTickets();
        
        return numTickets;    
    }
    
    public String findMovieById(int movieId) {
    	List<MovieEntity> foundMovie = entityManager.createQuery("SELECT e FROM MovieEntity e WHERE e.movieId = :movieId", MovieEntity.class)
    			.setParameter("moviedId", movieId).getResultList();
    	String movieName = foundMovie.get(0).getMovieName();
    	
    	return movieName;
    }
    
    public void updateNumTickets(int movieId, int numTickets) {
    	List<MovieEntity> foundMovie = entityManager.createQuery("SELECT e FROM MovieEntity e WHERE e.movieId = :movieId", MovieEntity.class)
    			.setParameter("moviedId", movieId).getResultList();
    	MovieEntity movie = foundMovie.get(0);
    	movie.setNumTickets(numTickets);
    	entityManager.persist(movie);
    	
    }


    public EntityManagerFactory getEntityManagerFactory() {
        return this.entityManagerFactory;
    }

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    public EntityManager getEntityManger() {
        return this.entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}