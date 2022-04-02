package com.gjq.springboot_redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redisTest")
public class RedisTestController {
    private String result="123";
    static {
        System.out.println(123);
    }
//    注入redis管理
    @Autowired
    private RedisTemplate redisTemplate;
    @GetMapping("demo01")
    public String testRedis(){
        redisTemplate.opsForValue().set("gjq","gjqnb");//加入一个键值对
        Object gjq = redisTemplate.opsForValue().get("gjq");//获取刚才加入的键值对的值
        System.out.println(this.result);
        this.result="456";
        return  (String) gjq;
    }

    @GetMapping("demo02")
    public String demo02(){
        System.out.println(this.result);
        this.result="789";
        return  "(String) gjq";
    }
}
