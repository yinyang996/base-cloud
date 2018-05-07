package com.wuxinvip.messagequeue.properties;

import com.aliyun.openservices.ons.api.bean.ProducerBean;
import com.wuxinvip.messagequeue.common.Constant;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Properties;

@Component
@ConfigurationProperties(prefix = "message.queue")
public class ProducerProperties extends ProducerBean {


    private String consumerId;
    private String accessKey;
    private String secretKey;

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
}
