package com.example.test.repository;

import com.example.test.dto.ProductDto;
import com.example.test.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

   Optional<Product> findByName(String name);



}
