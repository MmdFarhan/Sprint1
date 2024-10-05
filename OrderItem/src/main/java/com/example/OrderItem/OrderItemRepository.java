package com.example.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.OrderItem.OrderItem;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer>{

}
