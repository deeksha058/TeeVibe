package com.TeeVibes.TeeVibe.repository;

import com.TeeVibes.TeeVibe.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
