
  package com.springrest.REST.API.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.REST.API.Entity.Items;



public interface ItemsDao extends JpaRepository<Items,Long> {
  
  
  
  }
 