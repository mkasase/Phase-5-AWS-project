package com.springweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringWebController {
    @RequestMapping("/")
    public String helloWorld(){
        return "Hello World from Spring Boot";

    }
}
