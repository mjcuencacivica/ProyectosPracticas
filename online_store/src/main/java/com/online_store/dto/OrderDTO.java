package com.online_store.dto;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;



public class OrderDTO {

    private Integer id;

    @NotNull(message = "El id de cliente es obligatorio")
    @Positive(message = "El id de cliente debe ser positivo")
    private int customerId;

    @NotNull(message = "La fecha del pedido es obligatoria")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate orderDate;

    public enum OrderStatus {
        Pendiente, En_proceso, Enviado, Entregado
    }

    @NotNull(message = "El estado del pedido es obligatoria")
    private OrderStatus status;

    @PositiveOrZero(message = "El total no puede ser negativo")
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
