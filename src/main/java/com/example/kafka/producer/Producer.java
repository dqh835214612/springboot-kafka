package com.example.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Producer {
    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;
    @RequestMapping("message/send")
    public String send(String msg){
        kafkaTemplate.send("demo", msg); //使用kafka模板发送信息
        return "success";
    }
}
