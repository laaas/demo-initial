package com.example.demoinitial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DemoInitialApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoInitialApplication.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    String home(@RequestParam("data") String args) {
        return "Hello World " + args;
    }
    @RequestMapping("/test")
    @ResponseBody
    String test() {
        return "Teste mich!";
    }

}
