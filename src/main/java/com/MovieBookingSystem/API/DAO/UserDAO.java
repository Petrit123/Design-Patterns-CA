package com.MovieBookingSystem.API.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.MovieBookingSystem.API.DTO.UserDTO;
import com.MovieBookingSystem.API.Entity.UserEntity;
import com.MovieBookingSystem.Observer.OfferLetter;

@Transactional
@Repository
public class UserDAO {
	
	private final int positionOfUser = 0;
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	
	@PersistenceContext
	private EntityManager entityManager;
		
	public UserDTO getUserByUserName(String userName) {
		List<UserEntity> foundUser = entityManager.createQuery("SELECT e FROM UserEntity e WHERE e.userName = :userName", UserEntity.class)
				.setParameter("userName", userName).getResultList();
		System.out.println(foundUser.toString());
		System.out.println(foundUser.get(0).getId());
		UserDTO user = new UserDTO(foundUser.get(positionOfUser));
		return user;
	}

	public void createUser(UserEntity user) {	
		
		entityManager.persist(user);		
		
		System.out.println("Success");	
	}
	
	public void sendOfferLetters(String newOffer) {
		List<UserEntity> userList = entityManager.createQuery("SELECT e FROM UserEntity e", UserEntity.class).getResultList();
		OfferLetter offers = new OfferLetter();
		
		for(UserEntity user : userList) {
			offers.registerObserver(user);
			offers.setOffers(newOffer);
		}		
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
