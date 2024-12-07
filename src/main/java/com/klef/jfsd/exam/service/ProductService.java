package com.klef.jfsd.exam.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    private final String apiUrl = "https://fakestoreapi.com/products";

    public List<Object> fetchAllProducts() {
        RestTemplate restTemplate = new RestTemplate();
        Object[] products = restTemplate.getForObject(apiUrl, Object[].class);
        return Arrays.asList(products);
    }
}
