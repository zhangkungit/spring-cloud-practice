package com.github.charlesvhe.springcloud.practice.consumer.service;

import com.github.charlesvhe.springcloud.practice.provider.entity.Product;
import com.github.charlesvhe.springcloud.practice.provider.service.ProductServiceFeign;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestService {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestService.class);

    @Autowired
    private ProductServiceFeign productService;

    @Autowired
    private ItemService itemService;

    @GetMapping("/testGet")
    public List<Product> testGet() {
        return productService.get();
    }

    @GetMapping("/testGetOne")
    public Product testGetOne(Long id) {
        return productService.getOne(id);
    }

    @GetMapping("/testTCC")
    public String testTCC(Long id) {
        // 必须 一个 TCC 一个类，和 @Transactional 一样 需要调用该类的第一个方法就是有注解的
        return itemService.tryRecord(id);
    }

}
