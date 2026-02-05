package com.online_store.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online_store.services.OrderServiceManager;
import java.util.List;

import com.online_store.dto.OrderDTO;

@RestController
public class OrderController {

    @Autowired
    private OrderServiceManager orderServiceManager;

    @GetMapping("/view-orders")
    public List<OrderDTO> findAllOrders() {
        return this.orderServiceManager.findAll().stream().map(order -> new OrderDTO(
                order.getId(),
                order.getCustomerId(),
                order.getOrderDate(),
                OrderDTO.OrderStatus.valueOf(order.getStatus().name()),
                order.getTotal())).toList();
    }

}
