package com.boot.bookingrestaurantapi.exceptions;

import java.util.Arrays;

import org.springframework.http.HttpStatus;

import com.boot.bookingrestaurantapi.dtos.ErrorDTO;

public class internalServerErrorException extends BookingException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public internalServerErrorException(String code, String message) {
		super(code,HttpStatus.INTERNAL_SERVER_ERROR.value(), message);
		// TODO Auto-generated constructor stub
	}
	public internalServerErrorException(String code, String message ,ErrorDTO data) {
		super(code,HttpStatus.INTERNAL_SERVER_ERROR.value(), message , Arrays.asList(data));
		// TODO Auto-generated constructor stub
	}
}
