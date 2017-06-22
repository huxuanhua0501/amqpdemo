package net.xuanhuahu.mq.rabbitmq.service.impl;

import net.xuanhuahu.mq.rabbitmq.service.IMqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by win7 on 2017/6/16.
 */
@Service
public class MqService implements IMqService {
    @Autowired
    private net.xuanhuahu.mq.rabbitmq.mq.fanout.Producer fanoutProducer;
    @Autowired
    private net.xuanhuahu.mq.rabbitmq.mq.direct.Producer directProducer;
    @Autowired
    private  net.xuanhuahu.mq.rabbitmq.mq.topic.Producer topicProducer;

    public void send(String str) {

        fanoutProducer.send(str);
        directProducer.send(str);
        topicProducer.send(str);
    }
}
