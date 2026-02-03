package com.online_store.repositories;

import com.online_store.entities.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Integer>{

   
}
