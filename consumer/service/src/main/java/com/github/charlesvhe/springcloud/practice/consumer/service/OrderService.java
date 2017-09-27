package com.github.charlesvhe.springcloud.practice.consumer.service;

import org.mengyun.tcctransaction.api.Compensable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderService {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderService.class);

    @Compensable(confirmMethod = "confirmOrder", cancelMethod = "cancelOrder")
    public String tryOrder(Long id) {
        LOGGER.info("tryOrder");
        if (id % 4 == 0) {
            throw new RuntimeException("tryOrder 异常回滚");
        }
        return "tryOrder";
    }

    public String confirmOrder(Long id) {
        LOGGER.info("confirmOrder");
        return "confirmOrder";
    }

    public String cancelOrder(Long id) {
        LOGGER.info("cancelOrder");
        return "cancelOrder";
    }
}
