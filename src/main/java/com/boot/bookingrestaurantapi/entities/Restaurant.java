/**
 * 
 */
package com.boot.bookingrestaurantapi.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author mcastano
 *
 */
@Entity
@Table(name="restaurant")
public class Restaurant {
	/**
	 * Atributo que determina Id de la tabla restaurante
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
	/**
	 * Atributo que determina dirrecion de la tabla restaurante
	 */
	@Column(name = "ADDRESS")
	private String address;
	/**
	 * Atributo que determina Imagenes de la tabla restaurante
	 */
	@Column (name = "IMAGE")
	private String image;
	@OneToMany(cascade = CascadeType.ALL,fetch =  FetchType.LAZY, mappedBy ="idrestaurant") 
	private List<Reservation> reservation;
	@OneToMany(cascade = CascadeType.ALL,fetch =  FetchType.LAZY, mappedBy ="idrestaurant") 
	private List<Board> board;
	@OneToMany(cascade = CascadeType.ALL,fetch =  FetchType.LAZY, mappedBy ="idrestaurant") 
	private List<Turn> turn;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public List<Reservation> getReservation() {
		return reservation;
	}
	public void setReservation(List<Reservation> reservation) {
		this.reservation = reservation;
	}
	public List<Board> getBoard() {
		return board;
	}
	public void setBoard(List<Board> board) {
		this.board = board;
	}
	public List<Turn> getTurn() {
		return turn;
	}
	public void setTurn(List<Turn> turn) {
		this.turn = turn;
	}
	
	

}
