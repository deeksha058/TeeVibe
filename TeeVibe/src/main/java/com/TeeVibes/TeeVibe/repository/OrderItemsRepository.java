package com.TeeVibes.TeeVibe.repository;

import com.TeeVibes.TeeVibe.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemsRepository extends JpaRepository<OrderItem,Integer> {
}
