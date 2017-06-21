package net.xuanhuahu.mq.rabbitmq.controller;

import net.xuanhuahu.mq.rabbitmq.service.IMqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by win7 on 2017/6/16.
 */
@RestController
@RequestMapping(value = "/a")
public class MqController {
    @Autowired
    private IMqService mqService;
    @GetMapping(value = "/go")
    public void  send(){
        String str = "你妹打啊";
        mqService.send(str);
    }
}
