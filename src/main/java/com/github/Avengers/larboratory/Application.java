package com.github.Avengers.larboratory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Meifans on 2016/9/21.
 */
@RestController
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/api/{who}/{toSay}")
    public String sample(@PathVariable String toSay, @PathVariable String who) {
        return who + "," + " I " + toSay;
    }


}
