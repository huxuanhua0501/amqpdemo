package net.xuanhuahu.mq.rabbitmq.service.impl;

import net.xuanhuahu.mq.rabbitmq.mq.Producer;
import net.xuanhuahu.mq.rabbitmq.service.IMqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by win7 on 2017/6/16.
 */
@Service
public class MqService implements IMqService {
    @Autowired
    private Producer producer;

    public void send(String str) {

      producer.send(str);
    }
}
