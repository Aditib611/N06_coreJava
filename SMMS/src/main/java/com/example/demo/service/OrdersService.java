package com.example.demo.service;
import com.example.demo.entity.Orders;
import com.example.demo.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdersService {

    @Autowired
    private  OrdersRepository orderRepository;

    public List<Orders> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Orders> getOrderById(int orderId) {
        return orderRepository.findById(orderId);
    }

    public Orders createOrder(Orders order) {
        // Add any business logic/validation before saving
        return orderRepository.save(order);
    }

    public Orders updateOrder(int orderId, Orders updatedOrder) {
        return orderRepository.findById(orderId)
                .map(order -> {
                    order.setCategory(updatedOrder.getCategory());
                    order.setUserId(updatedOrder.getUserId());
                    order.setProductId(updatedOrder.getProductId());
                    order.setStatus(updatedOrder.getStatus());
                    // Update other fields as needed
                    return orderRepository.save(order);
                })
                .orElse(null);
    }

    public void deleteOrder(int orderId) {
        orderRepository.deleteById(orderId);
    }



}
