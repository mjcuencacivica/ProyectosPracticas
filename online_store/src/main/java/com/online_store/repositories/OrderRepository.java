package com.online_store.repositories;

import com.online_store.entities.*; 
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository <Order, Integer>{

}
