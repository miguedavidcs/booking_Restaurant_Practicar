package com.boot.bookingrestaurantapi.exceptions;

import java.util.ArrayList;
import java.util.List;

import com.boot.bookingrestaurantapi.dtos.ErrorDTO;

public class BookingException extends Exception{
	
	
	private static final long serialVersionUID = 1L;
	private final String code;
	private final int responseCode;
	private final List<ErrorDTO> errorList = new ArrayList<>();
	public BookingException(String code, int responseCode,String message) {
		super(message);
		this.code = code;
		this.responseCode = responseCode;
	}
	public BookingException(String code, int responseCode,String message,List<ErrorDTO> errorList) {
		super(message);
		this.code = code;
		this.responseCode = responseCode;
		this.errorList.addAll(errorList);
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getCode() {
		return code;
	}
	public int getResponseCode() {
		return responseCode;
	}
	public List<ErrorDTO> getErrorList() {
		return errorList;
	}
	
	

}
