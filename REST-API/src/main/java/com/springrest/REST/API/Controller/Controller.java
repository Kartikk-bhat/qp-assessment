package com.springrest.REST.API.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.springrest.REST.API.Entity.Items;
import com.springrest.REST.API.Entity.Order;
import com.springrest.REST.API.Service.ItemService;

@RestController
public class Controller {

	@Autowired
	ItemService itemService;
	
	@GetMapping("/items")
	public List<Items>getcourses(){
		
		return this.itemService.getItems();
	}
	
	
	@PostMapping("/addItems")
	public Items addItems(@RequestBody Items items) {
		
		return  this.itemService.addItems(items);
	}
	
	@PutMapping("/updateItems")
	public Items updateItems(@RequestBody Items items) {
		
		return  this.itemService.addItems(items);
	}
	
	
	@DeleteMapping("/deleteItems/{id}")
	public void  deleteItems(@PathVariable String id) {
		
		  this.itemService.deleteItems(Long.parseLong(id));
	}
	
	
    @PostMapping("/createOrder")
    public Order createOrder(@RequestBody Order order) {
        return this.itemService.createOrder(order);
    }
        
     
	
	
}
