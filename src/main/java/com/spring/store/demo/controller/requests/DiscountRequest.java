package com.spring.store.demo.controller.requests;


import com.spring.store.demo.models.Bill;
import com.spring.store.demo.models.User;

import lombok.Getter;
import lombok.Setter;


public class DiscountRequest {

    private User user;

    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	private Bill bill;

}
