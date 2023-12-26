package com.springrest.REST.API.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Order {

	@Id
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Items> items;
    

	public Order(Long id, List<Items> items) {
		super();
		this.id = id;
		this.items = items;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	
    
    
	
}
