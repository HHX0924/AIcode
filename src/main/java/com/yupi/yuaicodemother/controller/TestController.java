package com.yupi.yuaicodemother.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
        @GetMapping("/")
        public String healthCheck() {
            return "ok";
        }

}
