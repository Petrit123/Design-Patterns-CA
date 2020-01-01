package com.MovieBookingSystem.Entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

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
