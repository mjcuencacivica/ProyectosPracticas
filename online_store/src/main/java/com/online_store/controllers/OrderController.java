package com.online_store.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.online_store.services.OrderServiceManager;
import java.util.List;
import com.online_store.entities.Order;


@Controller
public class OrderController {

    @Autowired
    private OrderServiceManager orderServiceManager;

    @GetMapping("/view-orders")
    public String findAllOrders(Model model){
        List<Order> listOrders = this.orderServiceManager.findAll();
        model.addAttribute("listOrders", listOrders);
        return "index";
    }


  



}

