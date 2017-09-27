package com.github.charlesvhe.springcloud.practice.provider.service;

import com.github.charlesvhe.springcloud.practice.provider.entity.Product;
import com.github.charlesvhe.springcloud.practice.provider.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductService implements ProductServiceFeign {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> get() {
        return repository.findAll();
    }

    @Override
    public Product getOne(@PathVariable Long id) {
        return repository.findOne(id);
    }
}
