package com.test.springbootwar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {
    @GetMapping("/{page}")
    public String getPage(){
        return "helloworld";
    }
}
