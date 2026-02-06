package com.online_store.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
<<<<<<< HEAD
=======

import com.online_store.dto.OrderDTO;
import com.online_store.dto.OrderDTO.OrderStatus;
>>>>>>> 99a1661 (Creado el endpoint POST/orders para crear un pedido)
import com.online_store.entities.Order;
import com.online_store.repositories.OrderRepository;


@Service
public class OrderServiceManager implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }


    @Override
    public Order getOrderById(Integer id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Pedidio con id " + id + " no encontrado."));
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }
     
    @Override
    public Order createOrder(OrderDTO orderDTO) {
        Order order = new Order();
        order.setCustomerId(orderDTO.getCustomerId());
        order.setOrderDate(orderDTO.getOrderDate());
        order.setStatus(Order.OrderStatus.valueOf(orderDTO.getStatus().name()));
        order.setTotal(orderDTO.getTotal());

        return orderRepository.save(order);
    }


}
