package com.example.metric.controller;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestMetricController {

    @GetMapping("/hello")
    public String sayHello() {
        log.error("Hello");
        return "Hello";
    }

    @GetMapping("/loop")
    @SneakyThrows
    public String loop() {
        log.error("Loop");
        for (int i=1; i<1000; i++)
            Thread.sleep(5);
        return "Loop";
    }

}
