package com.github.charlesvhe.springcloud.practice.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("consumer")
public interface ItemServiceFeign {
}
