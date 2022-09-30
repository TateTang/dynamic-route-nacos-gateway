package tate.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author tangmf
 * @Date 2022/2/16 10:39 上午
 * @Description
 */
@RestController
@RequestMapping("/consumer/")
@Slf4j
public class ConsumerController {
    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        log.info("I'm calling nacos-consumer service by dynamic gateway...");
        return name + " Hi~, I'm from nacos-consumer";
    }
}
