package com.online_store.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online_store.services.OrderServiceManager;
import java.util.List;
import com.online_store.entities.Order;


@RestController
@RequestMapping("/listOrders")
public class OrderController {

    @Autowired
    private OrderServiceManager serviceManager;

    @GetMapping()
    public List<Order> findAllOrders(){
        return this.serviceManager.findAll();
    }

}

