package com.online_store.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import java.time.LocalDate;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "order_date")
    private LocalDate orderDate;

    public enum OrderStatus {
        Pendiente, En_proceso, Enviado, Entregado
    }

    @Column(name = "status")
    private OrderStatus status;

    private double total;

    public Order() {}

    public Order(int customerId, LocalDate orderDate, OrderStatus status, double total) {
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.status = status;
        this.total = total;
    }

  
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public int getCustomerId() { return customerId; }
    public void setCustomerId(int customerId) { this.customerId = customerId; }

    public LocalDate getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDate orderDate) { this.orderDate = orderDate; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }

    public OrderStatus getStatus() { return status; }
    public void setStatus(OrderStatus status) { this.status = status; }
}
