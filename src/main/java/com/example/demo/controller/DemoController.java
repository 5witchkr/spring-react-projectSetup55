package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DemoController {

    @GetMapping("demo")
    public List<String> demo() {
        return Arrays.asList("hello","world");
    }
}
