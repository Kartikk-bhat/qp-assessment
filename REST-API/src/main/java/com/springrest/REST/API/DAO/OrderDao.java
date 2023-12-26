package com.springrest.REST.API.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.REST.API.Entity.Order;

public  interface OrderDao extends JpaRepository<Order, Long> {

}
