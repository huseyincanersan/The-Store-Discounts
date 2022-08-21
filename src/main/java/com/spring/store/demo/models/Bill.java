package com.spring.store.demo.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;


public class Bill {

    private List<Item> items;

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}
