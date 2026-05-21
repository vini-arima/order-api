package com.projeto.order_api.service;

import org.springframework.stereotype.Service;

import com.projeto.order_api.entities.Order;

import java.util.*;

@Service
public class OrderService {
    private List<Order> orders = new ArrayList<>();
    private Long nextId = 1L;

    // GET ALL
    public List<Order> findAll() {
        return orders;
    }

    // GET BY ID
    public Order findById(Long id) {
        for (Order order : orders) {

            if (order.getId() != null && order.getId().equals(id)) {
                return order;
            }

        }

        return null;
    }

    // POST
    public Order create(Order order) {
        order.setId(nextId);
        nextId++;

        orders.add(order);

        return order;
    }

    // PUT
    public Order update(Long id, Order updatedOrder) {

        Order existingOrder = findById(id);

        if (existingOrder == null) {
            return null;

        } else {
            existingOrder.setMoment(updatedOrder.getMoment());
            existingOrder.setStatus(updatedOrder.getStatus());
            existingOrder.setClient(updatedOrder.getClient());
            existingOrder.setItems(updatedOrder.getItems());
        }

        return existingOrder;

    }

    // DELETE
    public void delete(Long id) {
        Order order = findById(id);

        if (order != null) {
            orders.remove(order);
        }

    }
}
