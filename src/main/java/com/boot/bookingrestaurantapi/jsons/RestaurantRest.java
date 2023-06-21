package com.boot.bookingrestaurantapi.jsons;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestaurantRest {
	@JsonProperty("id")
	private long id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("addres")
	private String address;
	@JsonProperty("image")
	private String image;
	@JsonProperty("reservation")
	private List<ReservationRest> reservation;
	@JsonProperty("board")
	private List<BoartRest> board;
	@JsonProperty("turn")
	private List<TurnRest> turn;

}
