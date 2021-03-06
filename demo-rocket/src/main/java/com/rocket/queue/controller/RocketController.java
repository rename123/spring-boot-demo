package com.rocket.queue.controller;

import com.rocket.queue.service.RocketMqService;
import org.apache.rocketmq.client.producer.SendResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author sql
 * @version 1.0.0
 * @date 2021/8/25 10:21
 */
@RestController
public class RocketController {
    @Resource
    private RocketMqService rocketMqService ;

    @RequestMapping("/sendMsg")
    public SendResult sendMsg (){
        String msg = "OpenAccount Msg";
        SendResult sendResult = null;
        try {
            sendResult = rocketMqService.openAccountMsg(msg) ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sendResult ;
    }
}
