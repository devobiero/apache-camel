package com.george.ke.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by george on 11/18/16.
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/rs/hello")
    public String index() {
        return "Hello from REST!";
    }
}
