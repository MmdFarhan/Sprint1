package com.example.OrderItem;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.OrderItem.OrderItem;
import com.example.OrderItem.OrderItemRepository;

@Service
public class OrderItemService {
	@Autowired
    private OrderItemRepository orderItemRepository;

    
    public List<OrderItem> getAllOrderItems() {
        return orderItemRepository.findAll();
    }

    
    public OrderItem getOrderItemById(int id) {
        Optional<OrderItem> orderItem = orderItemRepository.findById(id);
        return orderItem.orElse(null);
    }

    
    public OrderItem addOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    
    public OrderItem updateOrderItem(int id, OrderItem orderItem) {
        if (orderItemRepository.existsById(id)) {
            orderItem.setOrderItemId(id);
            return orderItemRepository.save(orderItem);
        }
        return null;
    }

    
    public void deleteOrderItem(int id) {
        orderItemRepository.deleteById(id);
    }
}
