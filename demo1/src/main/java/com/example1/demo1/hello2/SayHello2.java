package com.example1.demo1.hello2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SayHello2 {

    @RequestMapping("/topic")
    public List<topic> getAllTopic(){
        return Arrays.asList(
                new topic("1","Spring-1","Java-1"),
                new topic("2","Spring-2","Java-2"),
                new topic("3","Spring-3","Java-3")
        );
    }
}
