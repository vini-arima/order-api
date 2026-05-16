package com.projeto.order_api.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
// Anotações do Framework
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.order_api.entities.Order;
import com.projeto.order_api.entities.OrderStatus;
import com.projeto.order_api.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    // BUSCAR POR ID
    @GetMapping("/{id}")
    public Order getById(@PathVariable Long id) {

        Order order = service.findById(id);

        if (order == null) {
            throw new RuntimeException("Pedido não encontrado");
        }

        return order;
    }

    // CRIAR
    @PostMapping
    public Order create(@RequestBody Order order) {
        return service.create(order);
    }

    // DELETAR
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);

    }

    // ATUALIZAR (tudo)
    @PutMapping("/{id}/status")
    public Order updateStatus(
            @PathVariable Long id,
            @RequestBody Order updateOrder) {

        Order order = service.update(id, updateOrder);

        if (order == null) {
            throw new RuntimeException("Pedido não encontrado");
        }

        return order;
    }

    // Observação 1 - ATUALIZAR TUDO
    // Obeservação 2 - ATUALIZAR STATUS
}
