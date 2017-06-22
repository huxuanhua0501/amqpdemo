package net.xuanhuahu.mq.rabbitmq.mq.direct;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by win7 on 2017/6/19.
 */
@Service(value = "directProducer")
public class Producer {
    @Autowired
    private AmqpTemplate directamqpTemplate;

    public  void  send(Object obj){
        directamqpTemplate.convertAndSend("directmq",obj);
    }
}
