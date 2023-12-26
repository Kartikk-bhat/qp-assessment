package com.springrest.REST.API.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Items {
	
	@Id
	private Long id;
	private int price;
	private String description;
	
	
	public Items() {
		super();
		
	}
	public Items(Long id, int price, String description) {
		super();
		this.id = id;
		this.price = price;
		this.description = description;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Course [Id=" + id + ", price=" + price + ", description=" + description + "]";
	}
	
	

}
