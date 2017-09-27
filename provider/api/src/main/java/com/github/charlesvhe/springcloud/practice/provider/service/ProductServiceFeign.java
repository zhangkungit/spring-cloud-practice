package com.github.charlesvhe.springcloud.practice.provider.service;

import com.github.charlesvhe.springcloud.practice.provider.entity.Product;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("provider")
public interface ProductServiceFeign {
    @GetMapping("/v1/products")
    List<Product> get();

    @GetMapping("/v1/products/{id}")
    Product getOne(@PathVariable("id") Long id);
}
