package com.boot.bookingrestaurantapi.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author mcastano
 *
 */
@Entity
@Table(name ="board")
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="ID" ,unique = true, nullable = false)
	private long id;
	/**
	 * Atributo que determina capacidad de la tabla mesas
	 */
	@Column(name = "CAPACITY")
	private int capacidad;
	/**
	 * Atributo que determina numero de la tabla mesas
	 */
	@Column(name = "NUMBER")
	private int number;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "RESTAURANT_ID",nullable = false)
	private Restaurant idrestaurant;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Restaurant getIdrestaurant() {
		return idrestaurant;
	}

	public void setIdrestaurant(Restaurant idrestaurant) {
		this.idrestaurant = idrestaurant;
	}

	

}
