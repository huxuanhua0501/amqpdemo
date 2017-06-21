package net.xuanhuahu.mq.rabbitmq.mq.direct;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by win7 on 2017/6/19.
 */
@Service
public class Producer {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public  void  send(Object obj){
        amqpTemplate.convertAndSend("directmq",obj);
    }
}
