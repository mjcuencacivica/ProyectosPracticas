package com.online_store.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.online_store.entities.Order;
import com.online_store.repositories.OrderRepository;


@Service
public class OrderServiceManager implements OrderService{

    @Autowired
    private OrderRepository repository;

    @Override
    public List<Order> findAll() {
        return repository.findAll();
    }

}
