package com.wuxinvip.messagequeue.properties;

import com.aliyun.openservices.ons.api.MessageListener;
import com.aliyun.openservices.ons.api.bean.ConsumerBean;
import com.aliyun.openservices.ons.api.bean.Subscription;
import com.wuxinvip.messagequeue.common.Constant;
import com.wuxinvip.messagequeue.core.ConsumerMessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Map;
import java.util.Properties;

@Component
@ConfigurationProperties(prefix = "message.queue")
public class ConsumerProperties extends ConsumerBean {


    private String consumerId;
    private String accessKey;
    private String secretKey;

    private String topic;
    private String expression;

    @Autowired
    ConsumerMessageListener consumerMessageListener;

    @PostConstruct
    private void init(){
        super.start();
    }


    @PreDestroy
    private void destory(){
        super.shutdown();
    }

    @Override
    public void setProperties(Properties properties) {

        properties.setProperty(Constant.ConsumerId,consumerId);
        properties.setProperty(Constant.AccessKey,accessKey);
        properties.setProperty(Constant.SecretKey,secretKey);
        super.setProperties(properties);
    }

    @Override
    public void setSubscriptionTable(Map<Subscription, MessageListener> subscriptionTable) {

        Subscription subscription = new Subscription();
        subscription.setExpression(expression);
        subscription.setTopic(topic);
        subscriptionTable.put(subscription,consumerMessageListener);
        super.setSubscriptionTable(subscriptionTable);

    }


    public String getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(String consumerId) {
        this.consumerId = consumerId;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
}
