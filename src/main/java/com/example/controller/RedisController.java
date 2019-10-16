package com.example.controller;

import com.example.sender.RedisSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

  @Autowired
  RedisSender redisSender;

  @GetMapping("/redis")
  public String redisSampleController () {
    redisSender.sendDataToRedisQueue("Hello ");
    return "Successfully Sent Message";
  }
}
