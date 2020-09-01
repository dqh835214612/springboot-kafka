package com.example.deng.Redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class RedisController {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Autowired
    private RedisUtil redisUtil;
    @RequestMapping(value = "/hello")
    public Object hello(){
        redisTemplate.opsForValue().set("www","1111111");
        return redisTemplate.opsForValue().get("www");
    }
    @RequestMapping(value = "/hello1")
    public Object hello1(){
        redisUtil.set("www","22222");
        return redisUtil.get("www");
    }
}
