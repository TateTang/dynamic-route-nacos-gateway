package com.tate.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author tangmf
 * @Date 2022/2/16 10:41 上午
 * @Description
 */
@RestController
@RequestMapping("/provider/")
@Slf4j
public class ProviderController {
    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        log.info("I'm calling nacos-provider service by dynamic gateway...");
        return name + " Hi~, I'm from nacos-provider";
    }
}
