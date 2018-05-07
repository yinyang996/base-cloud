package com.wuxinvip.messagequeue.core;


import com.aliyun.openservices.ons.api.Message;
import com.aliyun.openservices.ons.api.bean.ProducerBean;
import com.wuxinvip.messagequeue.event.RocketmqEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * 发送bean类
 */
@Component
public class MessageQueueTemplate {


    @Autowired
    ProducerBean producerBean;

    public void send(RocketmqEvent rocketmqEvent){

        Message message = new Message();
        message.setTopic(rocketmqEvent.getTopic());
        message.setTag(rocketmqEvent.getTag());
        message.setBody(rocketmqEvent.getMsg().getBytes());
        producerBean.send(message);
    }
}
