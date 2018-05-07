package com.wuxinvip.messagequeue.core;

import com.aliyun.openservices.ons.api.*;
import com.wuxinvip.messagequeue.event.RocketmqEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.io.IOException;


/**
 * 接收bean
 */
@Component
public class ConsumerMessageListener implements MessageListener {

    private static final Logger logger = LoggerFactory.getLogger(ConsumerMessageListener.class);
    @Autowired
    ApplicationContext applicationContext;

    public Action consume(Message message, ConsumeContext context) {
        System.out.println("Receive: " + message);
        try {
            logger.info("rocket 接收到消息:{}",message);
            //do something..
            applicationContext.publishEvent(new RocketmqEvent(message));

            return Action.CommitMessage; //消息处理正常
        } catch (Exception e) {
            //消费失败
            logger.error("rocket 消息处理失败 ：{}",message);
            return Action.ReconsumeLater;//消息加入重试
        }
    }


    /**
     * 接收示例
     */

    @EventListener(condition = "#event.topic=='your.topic' && #event.tag=='your.tag'")
    public void MessageListener(RocketmqEvent rocketmqEvent) throws IOException {
        String string = rocketmqEvent.getMsg();
    }

}
