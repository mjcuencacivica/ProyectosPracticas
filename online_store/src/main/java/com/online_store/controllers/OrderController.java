package com.online_store.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.online_store.services.OrderServiceManager;
import java.util.List;
import com.online_store.dto.OrderDTO;
import com.online_store.entities.Order;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/orders")

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

    @GetMapping("/view-order/{id}")
    public OrderDTO findById(@PathVariable Integer id) {
        Order order = orderServiceManager.getOrderById(id);
        return new OrderDTO(order.getId(),
                order.getCustomerId(),
                order.getOrderDate(),
                OrderDTO.OrderStatus.valueOf(order.getStatus().name()),
                order.getTotal());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Order createOrder(@RequestBody Order order) {
        try {
            if (order.getOrderDate() == null) {
                order.setOrderDate(java.time.LocalDate.now());
            }
            return orderServiceManager.saveOrder(order);
        } catch (Exception e) {
            throw new RuntimeException("Error creando la orden: " + e.getMessage(), e);
        }
    }

    @PutMapping("/update-order/{id}")
    @ResponseStatus(HttpStatus.OK)
    public OrderDTO updateOrderById(@PathVariable Integer id, @RequestBody OrderDTO orderDTO) {
        Order order = orderServiceManager.updateOrderById(id, orderDTO);
        return new OrderDTO(order.getId(),
                order.getCustomerId(),
                order.getOrderDate(),
                OrderDTO.OrderStatus.valueOf(order.getStatus().name()),
                order.getTotal());
    }

}
