package com.MovieBookingSystem.API.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.MovieBookingSystem.API.DTO.BookingDTO;
import com.MovieBookingSystem.API.Entity.BookingEntity;
import com.MovieBookingSystem.FactoryMethodPattern.PaymentFactoryMethod;
import com.MovieBookingSystem.FactoryMethodPattern.PaymentMethodType;

@Transactional
@Repository
public class BookingDAO {
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public BookingDTO findBookingById(int bookingId) {
		List<BookingEntity> foundBooking = entityManager.createQuery("SELECT e FROM BookingEntity e WHERE e.bookingId = :bookingId", BookingEntity.class)
				.setParameter("bookingId", bookingId).getResultList();
		System.out.println(foundBooking.toString());
		System.out.println(foundBooking.get(0).getBookingId());
		BookingDTO booking  = new BookingDTO(foundBooking.get(0));
		return booking;
	}

	
	public void makeBooking(BookingEntity booking) {	
		
		entityManager.persist(booking);		
		
		System.out.println("Success");	
	}
	
	public void makePayment(int bookingId,PaymentMethodType paymentMethod) {
	List<BookingEntity> foundBooking = entityManager.createQuery("SELECT e FROM BookingEntity e WHERE e.bookingId = :bookingId", BookingEntity.class)
				.setParameter("bookingId", bookingId).getResultList();
	
	BookingEntity booking = foundBooking.get(0);
	
	PaymentFactoryMethod payment = new PaymentFactoryMethod();

	//booking.pay(payment.getPaymentMethod(paymentMethod));
	
	foundBooking.get(0).setBookingStatus("Paid");
	
	entityManager.persist(booking);

		
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
