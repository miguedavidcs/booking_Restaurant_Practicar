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
@Table(name="reservation")
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="ID" ,unique = true, nullable = false)
	private long id;
	/**
	 * Atributo que determina localizador de la tabla turnos
	 */
	@Column(name = "LOCATOR")
	private String locator;
	/**
	 * Atributo que determina person de la tabla turnos
	 */
	@Column(name = "PERSON")
	private String person;
	/**
	 * Atributo que determina fecha de la tabla turnos
	 */
	@Column(name = "FECHA")
	private String fecha;
	/**
	 * Atributo que determina turno de la tabla turnos
	 */
	@Column(name = "TURN")
	private String turn;
	/**
	 * Atributo que determina id foraneo de la tabla restaurante
	 * que esta en la tabla turnos
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RESTAURANT_ID",nullable = false)
	private Restaurant idrestaurant;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLocator() {
		return locator;
	}
	public void setLocator(String locator) {
		this.locator = locator;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getTurn() {
		return turn;
	}
	public void setTurn(String turn) {
		this.turn = turn;
	}
	public Restaurant getIdrestaurant() {
		return idrestaurant;
	}
	public void setIdrestaurant(Restaurant idrestaurant) {
		this.idrestaurant = idrestaurant;
	}
	
	

}
