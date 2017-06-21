package net.xuanhuahu.mq.rabbitmq.mq.direct;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * Created by win7 on 2017/6/19.
 */
public class Consumer implements MessageListener{
    String  str ="";
    @Override
    public void onMessage(Message message) {
        str = message.getBody().toString();
    }

    public static void main(String[] args) {
        String str1 = "12";
        String str = new String("12");

        System.err.println(str==str1);
    }
}
