package com.spring.store.demo.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


public class User {

	

	public User(UserType type, LocalDate registerDate) {
		super();
		this.type = type;
		this.registerDate = registerDate;
	}
	
	private UserType type;

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	public LocalDate getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(LocalDate registerDate) {
		this.registerDate = registerDate;
	}

	private LocalDate registerDate;
}
