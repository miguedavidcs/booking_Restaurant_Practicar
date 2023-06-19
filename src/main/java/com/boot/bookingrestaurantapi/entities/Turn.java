/**
 * 
 */
package com.boot.bookingrestaurantapi.entities;

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
 * @author mcastano
 *
 */
@Entity
@Table(name="turn")
public class Turn {
	/**
	 * Atributo que determina Id de la tabla turnos
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="ID" ,unique = true, nullable = false)
	private long id;
	/**
	 * Atributo que determina nombre de la tabla restaurante
	 */
	@Column(name = "NAME")
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RESTAURANT_ID",nullable = false)
	private Restaurant idrestaurant;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Restaurant getIdrestaurant() {
		return idrestaurant;
	}

	public void setIdrestaurant(Restaurant idrestaurant) {
		this.idrestaurant = idrestaurant;
	}

	
	
}
