package com.example1.demo1.hello2;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

      private  List<topic> topics= Arrays.asList(
                new topic("1","Spring-1","Java-1"),
                new topic("2","Spring-2","Java-2"),
                new topic("3","Spring-3","Java-3"),
                new topic("4","Spring-4","Java-4")
      );
      public List<topic> getAllTopics(){
          return topics;
      }
}
