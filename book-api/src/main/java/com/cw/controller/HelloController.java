package com.cw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author cw
 * @create 2020/4/16 15:18
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public  Object hello(){
        return "hello word";
    }
}
