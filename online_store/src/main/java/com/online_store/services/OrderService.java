package com.online_store.services;

import java.util.List;

import com.online_store.entities.Order;
import com.online_store.dto.OrderDTO;

public interface OrderService {

    List <Order> findAll();

    Order getOrderById(Integer id);
    Order saveOrder(Order order);
    Order createOrder(OrderDTO orderDTO);



}
