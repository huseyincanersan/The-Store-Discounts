package com.spring.store.demo.models;


import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


public class Item {

  

    public Item(ItemType type, BigDecimal price) {
		super();
		this.type = type;
		this.price = price;
	}
    
    public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	private ItemType type;

	private BigDecimal price;
}
