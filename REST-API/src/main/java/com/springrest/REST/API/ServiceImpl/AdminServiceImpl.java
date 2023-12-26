package com.springrest.REST.API.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.REST.API.DAO.ItemsDao;
import com.springrest.REST.API.DAO.OrderDao;
import com.springrest.REST.API.Entity.Items;
import com.springrest.REST.API.Entity.Order;
import com.springrest.REST.API.Service.ItemService;



@Service
public class AdminServiceImpl implements ItemService {

	@Autowired
	private ItemsDao itemsDao;
	
	@Autowired
	private OrderDao orderDao;
	
	@Override
	public List<Items> getItems() {
		return itemsDao.findAll();
	}

	@Override
	public Items addItems(Items item) {
		itemsDao.save(item);
		return item;
	}
	
	
	@Override
	public Items updateItems(Items item) {
		itemsDao.save(item);
		return item;
	}
	
	@Override
	public void deleteItems(long parseLong) {
		Items items = itemsDao.getReferenceById(parseLong);
		itemsDao.delete(items);
	}
	
	 public Order createOrder(Order order) {
	        return orderDao.save(order);
	    }

	  
	
	

}
