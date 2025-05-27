package com.yeny.product_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yeny.product_service.entity.Product;
import com.yeny.product_service.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product create(Product product) {
        return productRepository.save(product);
    }

    public Product getById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
