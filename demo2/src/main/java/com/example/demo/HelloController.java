package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class HelloController {
    @Value("${server.port}")
    private int port;
    @Autowired
    private Environment env;
    @Autowired
    private person person;
    @RequestMapping("/fuck")
    public String hello()
    {
        System.out.println(Arrays.toString(person.getS()));
        System.out.println(person.getAge());
        System.out.println(person.getName());
        System.out.println(env.getProperty("server.port"));
        System.out.println(port);
        return "fuck java!";
    }
    @RequestMapping("/hello")
    public String hello2()
    {
        return "fuck java!";
    }
}
