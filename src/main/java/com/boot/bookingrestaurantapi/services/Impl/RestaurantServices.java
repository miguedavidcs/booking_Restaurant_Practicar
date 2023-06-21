package com.boot.bookingrestaurantapi.services.Impl;

import java.util.List;

import com.boot.bookingrestaurantapi.exceptions.BookingException;
import com.boot.bookingrestaurantapi.jsons.RestaurantRest;

public interface RestaurantServices {
	RestaurantRest getRestaurantById(Long restaurantId)throws BookingException;
	public List<RestaurantRest> getRestaurant()throws BookingException;
}
