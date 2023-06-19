package com.boot.bookingrestaurantapi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.bookingrestaurantapi.entities.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{

}
