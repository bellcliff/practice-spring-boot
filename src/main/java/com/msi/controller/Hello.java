package com.msi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bo-yang on 3/31/2016.
 */
@RestController
public class Hello {
    @RequestMapping("/")
    public String index() {
        return "Hello world!";
    }
}
