package com.example.demojenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianjie
 * @description
 * @date 22/9/25 0025 19:39
 */
@RestController
public class TEstcontroller {

    @GetMapping("/test")
    public String test() {
        return "test——github";
    }
}
