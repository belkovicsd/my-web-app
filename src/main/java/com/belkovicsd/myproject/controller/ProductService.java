package com.belkovicsd.myproject.controller;

import com.belkovicsd.myproject.model.Product;
import jakarta.annotation.Nonnull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {

    @Nonnull
    private final ProductRepository productRepository;

    @Nonnull
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

}