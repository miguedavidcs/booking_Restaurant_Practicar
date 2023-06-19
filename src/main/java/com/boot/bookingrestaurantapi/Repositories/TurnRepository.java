/**
 * 
 */
package com.boot.bookingrestaurantapi.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.bookingrestaurantapi.entities.Turn;

/**
 * @author mcastano
 *
 */
@Repository
public interface TurnRepository extends JpaRepository<Turn, Long> {
	Optional<Turn> findById(Long id);
}
