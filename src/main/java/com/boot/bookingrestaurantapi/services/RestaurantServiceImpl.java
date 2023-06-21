package com.boot.bookingrestaurantapi.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.boot.bookingrestaurantapi.Repositories.RestaurantRepository;
import com.boot.bookingrestaurantapi.entities.Restaurant;
import com.boot.bookingrestaurantapi.exceptions.BookingException;
import com.boot.bookingrestaurantapi.exceptions.NotFoundException;
import com.boot.bookingrestaurantapi.jsons.RestaurantRest;
import com.boot.bookingrestaurantapi.services.Impl.RestaurantServices;

public class RestaurantServiceImpl implements RestaurantServices {

	@Autowired
	RestaurantRepository restaurantRepository;

	public static final ModelMapper modelMapper = new ModelMapper();

	public RestaurantRest getRestaurantById(Long restaurantId) throws BookingException {

		return modelMapper.map(getRestaurantEntity(restaurantId), RestaurantRest.class);
	}

	public List<RestaurantRest> getRestaurant() throws BookingException {
		final List<Restaurant> restaurantEntity = restaurantRepository.findAll();
		return restaurantEntity.stream().map(servicio -> modelMapper.map(servicio, RestaurantRest.class))
				.collect(Collectors.toList());
	}

	private Restaurant getRestaurantEntity(Long restaurantId) throws BookingException {

		return restaurantRepository.findById(restaurantId)
				.orElseThrow(() -> new NotFoundException("SNOT-404-1", "RESTAURANT NOT FOUND"));
	}

}
