package com.github.charlesvhe.springcloud.practice.consumer.repository;

import com.github.charlesvhe.springcloud.practice.consumer.entity.Item;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class ItemRepository extends SimpleJpaRepository<Item, Long> {
    public ItemRepository(EntityManager em) {
        super(Item.class, em);
    }
}
