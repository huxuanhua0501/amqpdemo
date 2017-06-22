package net.xuanhuahu.mq.rabbitmq.mq.fanout;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by win7 on 2017/6/19.
 */
@Service(value = "fanoutProducer")
public class Producer {
    @Autowired
    private AmqpTemplate fanoutamqpTemplate;

    public  void  send(Object obj){
        fanoutamqpTemplate.convertAndSend("fanoutmq",obj);
    }
}
