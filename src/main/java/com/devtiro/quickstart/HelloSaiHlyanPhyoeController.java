package com.devtiro.quickstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSaiHlyanPhyoeController {

    @GetMapping(path = "/sai")
    public String helloSaiHlyanPhyoe() {
        return "Hello Sai Hlyan Phyoe";
    }
}
