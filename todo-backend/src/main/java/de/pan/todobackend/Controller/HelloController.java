package de.pan.todobackend.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import de.pan.todobackend.Service.HelloService;


@RestController
public class HelloController {
    private HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("hello")
    public String helloEndpoint() {
        return this.helloService.Greeting();
    }
}