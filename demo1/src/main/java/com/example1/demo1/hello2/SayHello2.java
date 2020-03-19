package com.example1.demo1.hello2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SayHello2 {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topic")
    public List<topic> getAllTopic(){
        return topicService.getAllTopics();
    }
}
