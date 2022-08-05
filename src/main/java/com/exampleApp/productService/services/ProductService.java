package com.exampleApp.productService.services;

import com.exampleApp.productService.entities.Product;
import com.exampleApp.productService.repositories.ProductRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> getByid(Long id) {
        return productRepository.findById(id);
    }
}
