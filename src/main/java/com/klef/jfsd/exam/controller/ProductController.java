package com.klef.jfsd.exam.controller;

import com.klef.jfsd.exam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Object> getAllProducts() {
        return productService.fetchAllProducts();
    }
}