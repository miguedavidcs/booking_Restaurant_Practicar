package com.boot.bookingrestaurantapi.exceptions;

import java.util.Arrays;

import org.springframework.http.HttpStatus;

import com.boot.bookingrestaurantapi.dtos.ErrorDTO;

public class NotFoundException extends BookingException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotFoundException(String code, String message) {
		super(code,HttpStatus.NOT_FOUND.value(), message);
		// TODO Auto-generated constructor stub
	}
	public NotFoundException(String code, String message ,ErrorDTO data) {
		super(code,HttpStatus.NOT_FOUND.value(), message , Arrays.asList(data));
		// TODO Auto-generated constructor stub
	}

}
