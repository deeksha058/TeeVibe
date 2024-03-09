package com.TeeVibes.TeeVibe.repository;

import com.TeeVibes.TeeVibe.model.Order;
import com.TeeVibes.TeeVibe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository  extends JpaRepository<Order, Integer> {
    List<Order> findAllByUserOrderByCreatedDateDesc(User user);

}
