package com.github.charlesvhe.springcloud.practice.consumer.service;

import com.github.charlesvhe.springcloud.practice.provider.entity.Product;
import com.github.charlesvhe.springcloud.practice.provider.service.ProductServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestService {

    @Autowired
    private ProductServiceFeign productService;

    @GetMapping("/testGet")
    public List<Product> testGet() {
        return productService.get();
    }

    @GetMapping("/testGetOne")
    public Product testGetOne(Long id) {
        return productService.getOne(id);
    }
}
