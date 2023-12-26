package com.springrest.REST.API.Service;

import java.util.List;

import com.springrest.REST.API.Entity.Items;
import com.springrest.REST.API.Entity.Order;


public interface ItemService {

	public List<Items>getItems();
	public Items addItems(Items item);
	public Items updateItems(Items item);
	public void deleteItems(long parseLong);
	public Order createOrder(Order order);


}
