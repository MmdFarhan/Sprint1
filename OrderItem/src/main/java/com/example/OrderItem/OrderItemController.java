package com.example.OrderItem;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.OrderItem.OrderItem;
import com.example.OrderItem.OrderItemService;

@RestController
@RequestMapping("/orderitems")
@CrossOrigin("http://localhost:4200")
public class OrderItemController {
	@Autowired
    private OrderItemService orderItemService;

    @GetMapping
    public List<OrderItem> getAllOrderItems() {
        return orderItemService.getAllOrderItems();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderItem> getOrderItemById(@PathVariable int id) {
        OrderItem orderItem = orderItemService.getOrderItemById(id);
        return orderItem != null ? ResponseEntity.ok(orderItem) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public OrderItem addOrderItem(@RequestBody OrderItem orderItem) {
        return orderItemService.addOrderItem(orderItem);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderItem> updateOrderItem(@PathVariable int id, @RequestBody OrderItem orderItem) {
        OrderItem updatedOrderItem = orderItemService.updateOrderItem(id, orderItem);
        return updatedOrderItem != null ? ResponseEntity.ok(updatedOrderItem) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrderItem(@PathVariable int id) {
        orderItemService.deleteOrderItem(id);
        return ResponseEntity.noContent().build();
    }
}
