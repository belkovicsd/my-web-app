package com.belkovicsd.myproject.controller;

import com.belkovicsd.myproject.model.Product;
import jakarta.annotation.Nonnull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    @Nonnull
    private final ProductService productService;

    @GetMapping("/get")
    @Nonnull
    public List<Product> getAllProducts() {
        return productService.getProducts();
    }

}