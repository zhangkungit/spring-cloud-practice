package com.github.charlesvhe.springcloud.practice.consumer.service;

import org.mengyun.tcctransaction.api.Compensable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemService implements ItemServiceFeign {
    private static final Logger LOGGER = LoggerFactory.getLogger(ItemService.class);

    @Autowired
    private OrderService orderService;

    @Compensable(confirmMethod = "confirmRecord", cancelMethod = "cancelRecord")
    public String tryRecord(Long id) {
        LOGGER.info("tryRecord");
        orderService.tryOrder(id);
        if (id % 3 == 0) {
            throw new RuntimeException("tryRecord 异常回滚");
        }
        return "tryRecord";
    }

    public String confirmRecord(Long id) {
        LOGGER.info("confirmRecord");
        return "confirmRecord";
    }

    public String cancelRecord(Long id) {
        LOGGER.info("cancelRecord");
        return "cancelRecord";
    }
}
