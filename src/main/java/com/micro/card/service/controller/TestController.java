package com.micro.card.service.controller;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Cacheable
@CacheConfig(cacheNames = "card_test")
@RequestMapping(value = "/")
public class TestController {

    @GetMapping("")
    @Cacheable
    public String getName() {
        return "Card Micro Service";
    }

    @PostMapping("")
    public String postName() {
        return "Card Micro Service";
    }
}
