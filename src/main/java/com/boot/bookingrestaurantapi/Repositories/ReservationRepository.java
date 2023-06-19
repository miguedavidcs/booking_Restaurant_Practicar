/**
 * 
 */
package com.boot.bookingrestaurantapi.Repositories;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import com.boot.bookingrestaurantapi.entities.Reservation;


/**
 * @author mcastano
 *
 */
@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
	Optional<Reservation> findById(Long id);
	Optional<Reservation> findByLocator(String Locator);
	
	@Modifying
	@Transactional
	Optional<Reservation> deleteByLocator(String Locator);
	Optional<Reservation> FindByTurnandRestaurantId(String turn, Long restaurantId);

}
