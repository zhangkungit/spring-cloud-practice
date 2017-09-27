package com.github.charlesvhe.springcloud.practice.provider.repository;

import com.github.charlesvhe.springcloud.practice.provider.entity.Category;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class CategoryRepository extends SimpleJpaRepository<Category, Long> {
    public CategoryRepository(EntityManager em) {
        super(Category.class, em);
    }
}
