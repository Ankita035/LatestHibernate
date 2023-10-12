package com.to1.example.Hiber1to1.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="user_id")
	private int id;
	
	@Column(name="username")
	private String userName;
	
	@OneToOne(mappedBy="user",cascade=CascadeType.ALL)//this defines foreign keys
	private Address address;
	
	public User(int id, String userName, Address address) {
		super();
		this.id = id;
		this.userName = userName;
		this.address = address;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
