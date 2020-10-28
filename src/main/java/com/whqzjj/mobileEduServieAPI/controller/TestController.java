package com.whqzjj.mobileEduServieAPI.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "successful ! ^_^ !哈哈 666";
    }
}
