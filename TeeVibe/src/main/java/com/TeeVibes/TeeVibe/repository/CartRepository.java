package com.TeeVibes.TeeVibe.repository;

import com.TeeVibes.TeeVibe.model.Cart;
import com.TeeVibes.TeeVibe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

    List<Cart> findAllByUserOrderByCreatedDateDesc(User user);

    List<Cart> deleteByUser(User user);

}

