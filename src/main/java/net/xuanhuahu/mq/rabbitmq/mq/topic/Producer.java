package net.xuanhuahu.mq.rabbitmq.mq.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by win7 on 2017/6/19.
 */
@Service(value = "topicProducer")
public class Producer {
    @Autowired
    private AmqpTemplate topicamqpTemplate;

    public  void  send(Object obj){
        topicamqpTemplate.convertAndSend("topicmq.1",obj);
    }
}
