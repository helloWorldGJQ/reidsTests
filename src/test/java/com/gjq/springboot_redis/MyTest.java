package com.gjq.springboot_redis;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class MyTest {

    @Autowired
    private RedisTemplate redisTemplate;

    public  static Boolean doSecKill(String uid,String pid){
        if(uid==null||pid==null){
            return  false;
        }
        String kcKey="sk:"+pid+":qt";
        String userKey="sk:"+pid+":user";
        return false;
    }
}
