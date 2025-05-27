package com.yeny.product_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yeny.product_service.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
