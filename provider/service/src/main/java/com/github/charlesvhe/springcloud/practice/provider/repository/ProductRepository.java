package com.github.charlesvhe.springcloud.practice.provider.repository;

import com.github.charlesvhe.springcloud.practice.provider.entity.Product;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class ProductRepository extends SimpleJpaRepository<Product, Long> {
    public ProductRepository(EntityManager em) {
        super(Product.class, em);
    }
}
