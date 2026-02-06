package com.online_store.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class OrderDTO {

    private Integer id;
    private int customerId;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate orderDate;
    public enum OrderStatus {
        Pendiente, En_proceso, Enviado, Entregado
    }
    private OrderStatus status;
    private double total;

    public OrderDTO(){}
    
    public OrderDTO (Integer id, int customerId, LocalDate orderDate, OrderStatus status, double total){
        this.id = id;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.status = status;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
