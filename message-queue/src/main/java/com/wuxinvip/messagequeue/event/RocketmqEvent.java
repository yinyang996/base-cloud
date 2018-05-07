package com.wuxinvip.messagequeue.event;

import com.aliyun.openservices.ons.api.Message;
import org.springframework.context.ApplicationEvent;

import java.io.UnsupportedEncodingException;

/**
 * Created by root on 2017/5/5.
 */
public class RocketmqEvent extends ApplicationEvent {
    private static final long serialVersionUID = -4468405250074063206L;

    private String topic;
    private String tag;
    private byte[] body;

    public RocketmqEvent(Message msg) {
        super(msg);
        this.topic = msg.getTopic();
        this.tag = msg.getTag();
        this.body = msg.getBody();
    }
    public String getMsg() {
        try {
            return new String(this.body,"utf-8");
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    public String getMsg(String code) {
        try {
            return new String(this.body,code);
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }
}
